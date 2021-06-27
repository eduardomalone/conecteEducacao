package com.tecnologia.conecteEducacao.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecnologia.conecteEducacao.dto.ConteudoDTO;
import com.tecnologia.conecteEducacao.dto.ObjModuloDTO;
import com.tecnologia.conecteEducacao.dto.ObjSubModuloDTO;
import com.tecnologia.conecteEducacao.dto.ObjSubsubModuloDTO;
import com.tecnologia.conecteEducacao.dto.SubSubModuloDTO;
import com.tecnologia.conecteEducacao.entities.Conteudo;
import com.tecnologia.conecteEducacao.entities.Modulo;
import com.tecnologia.conecteEducacao.entities.SubModulo;
import com.tecnologia.conecteEducacao.entities.SubSubModulo;
import com.tecnologia.conecteEducacao.repositories.ConteudoRepository;
import com.tecnologia.conecteEducacao.repositories.ModuloRepository;
import com.tecnologia.conecteEducacao.repositories.SubModuloRepository;
import com.tecnologia.conecteEducacao.repositories.SubSubModuloRepository;

@Service
public class MontaArvoreService {

	@Autowired
	private ConteudoRepository repositoryConteudo;
	
	@Autowired
	private ModuloRepository repositoryModulo;
	
	@Autowired
	private SubModuloRepository repositorySubModulo;
	
	@Autowired
	private SubSubModuloRepository repositorySubSubModulo;
	
	@Autowired
	private ConteudoService conteudoService;
	
	
	public List<ObjModuloDTO> montarArvore(String codNivel,String codModulo) {
		
		List<Modulo> listaModulo = repositoryModulo.findByCodnivelAndCodmoduloContainingOrderByIndice(Integer.parseInt(codNivel), codModulo);
		List<SubModulo> listaSubModulos = repositorySubModulo.findByCodnivelAndCodsubmoduloContainingOrderByIndice(Integer.parseInt(codNivel),codModulo);
		List<SubSubModulo> listaSubsubModulos = repositorySubSubModulo.findByCodnivelAndCodsubsubmoduloContainingOrderByIndica(Integer.parseInt(codNivel),codModulo);
		List<ConteudoDTO> listaOlds = conteudoService.findByCodnivelAndCodconteudoContainingOrderByIndice(codNivel, codModulo);
		
		SubSubModuloDTO teste = new SubSubModuloDTO();
		
		List<ObjModuloDTO> objModuloDTORetorno = new ArrayList<>();
/*		
		if(listaOlds != null && !listaOlds.isEmpty()) {
			verificaOlders(listaModulo,listaOlds);
		}
*/		
		//pega o primeiro modulo, para buscar os submodulos
		for (int i = 0; i < listaModulo.size(); i++) {
			
			List<ObjSubModuloDTO> listSubModuloAux = new ArrayList<>();
			ObjModuloDTO objetoModuloDTO = new ObjModuloDTO();
			objetoModuloDTO.setModulo(listaModulo.get(i).getModulo());
			System.out.println("Modulo"+listaModulo.get(i).getModulo());
			
			for (int j = 0; j < listaSubModulos.size(); j++) {
				
				ObjSubModuloDTO objetoSubModuloDTO = new ObjSubModuloDTO();
				List<ObjSubsubModuloDTO> listSubSubModuloAux = new ArrayList<>();
				
				if(listaSubModulos.get(j).getCodsubmodulo().contains(listaModulo.get(i).getCodmodulo())) {
					
					System.out.println("subModulo: "+listaSubModulos.get(j).getSubmodulo());
					
					objetoSubModuloDTO.setSubmodulo(listaSubModulos.get(j).getSubmodulo());
					listSubModuloAux.add(objetoSubModuloDTO);
					objetoModuloDTO.setObjSubModulo(listSubModuloAux);
					
				}
				
				
				for (int k = 0; k < listaSubsubModulos.size(); k++) {
					
					ObjSubsubModuloDTO objetoSubsubModuloDTO = new ObjSubsubModuloDTO();
				
					
					if(listaSubsubModulos.get(k).getCodsubsubmodulo().contains(listaSubModulos.get(j).getCodsubmodulo())) {
						System.out.println("subsubModulo: "+listaSubsubModulos.get(k).getSubsubmodulo());
						System.out.println("codsubsubModulo: "+listaSubsubModulos.get(k).getCodsubsubmodulo());
						
						objetoSubsubModuloDTO.setCodsubsubModulo(listaSubsubModulos.get(k).getCodsubsubmodulo());
						objetoSubsubModuloDTO.setSubSubmodulo(listaSubsubModulos.get(k).getSubsubmodulo());
						listSubSubModuloAux.add(objetoSubsubModuloDTO);
						objetoSubModuloDTO.setSubsubModulo(listSubSubModuloAux);
					}
					
					
				}
				
				if(listSubSubModuloAux.isEmpty()) {
					
					ObjSubsubModuloDTO subsubModulo = new ObjSubsubModuloDTO();
					subsubModulo.setCodsubsubModulo(listaSubModulos.get(j).getCodsubmodulo());
					subsubModulo.setSubSubmodulo(listaSubModulos.get(j).getSubmodulo());
					
					listSubSubModuloAux.add(subsubModulo);
					objetoSubModuloDTO.setSubsubModulo(listSubSubModuloAux);
					
				}
				
			}
	//aqui		
			if(listSubModuloAux.isEmpty()) {
				
				List<ObjSubsubModuloDTO> listSubSubModuloAux = new ArrayList<>();
				
				ObjSubModuloDTO subModulo = new ObjSubModuloDTO();
				subModulo.setSubmodulo(listaModulo.get(i).getModulo());
				
				
				ObjSubsubModuloDTO subsubModulo = new ObjSubsubModuloDTO();
				subsubModulo.setCodsubsubModulo(listaModulo.get(i).getCodmodulo());
				subsubModulo.setSubSubmodulo(listaModulo.get(i).getModulo());
				
				listSubSubModuloAux.add(subsubModulo);
				listSubModuloAux.add(subModulo);
				objetoModuloDTO.setObjSubModulo(listSubModuloAux);
				objetoModuloDTO.getObjSubModulo().get(0).setSubsubModulo(listSubSubModuloAux);
				
			}
			objModuloDTORetorno.add(objetoModuloDTO);
		}
		
		return objModuloDTORetorno;
	}
	
	
	private List<Modulo> verificaOlders(List<Modulo> listaModulo, List<ConteudoDTO>listaOlds) {
		
		List<Modulo> listaSeparada = new ArrayList<>();
		
		for (int i = 0; i < listaModulo.size(); i++) {
			System.out.println("listaModulo "+listaModulo.get(i).getCodmodulo());
		}
		for (int j = 0; j < listaModulo.size(); j++) {
			System.out.println("listaOlds "+listaOlds.get(j).getCodconteudo());
		}
		
		
		return listaModulo;
	}
	
	

}
