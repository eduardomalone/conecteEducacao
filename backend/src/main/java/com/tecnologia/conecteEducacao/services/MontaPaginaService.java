package com.tecnologia.conecteEducacao.services;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecnologia.conecteEducacao.dto.MontaPaginaDTO;
import com.tecnologia.conecteEducacao.entities.Conteudo;
import com.tecnologia.conecteEducacao.repositories.ConteudoRepository;

@Service
public class MontaPaginaService {

	// pego as informacoes das paginas c o like

	// pego as informacoes com where

	// consulta cada modelo e comoco a montar os conteudos

	@Autowired
	private ConteudoRepository repositoryConteudo;
	
	@Autowired
	private MontaBlocos montaBlocos;
	
	private MontaPaginaDTO montaPaginaDTO;
	
	private String primeiroConteudoPagina;

	public MontaPaginaDTO montarInformacoes(String codNivel, String codConteudo) {

		//List<Conteudo> listConteudoLike = repositoryConteudo.findByCodconteudoContaining((codConteudo.substring(0, codConteudo.length()-2)));
		List<Conteudo> listConteudoLike = repositoryConteudo.findByCodnivelAndCodconteudoContainingOrderByIndice(Integer.parseInt(codNivel),codConteudo);
		List<String> codigosConteudo = new ArrayList();
		for (Conteudo cont : listConteudoLike) {
			codigosConteudo.add(cont.getCodconteudo().trim());
		}
		MontaPaginaDTO montaPaginaDTO = new MontaPaginaDTO();
		montaPaginaDTO.setCodconteudo(codigosConteudo);
		montaPaginaDTO.setProximasPaginas(codigosConteudo);
		
		//Conteudo conteudo = repositoryConteudo.findByCodconteudo(codConteudo);
		//List<Conteudo>  conteudoTesteLista = repositoryConteudo.findByCodnivelAndCodconteudoContainingOrderByIndice(Integer.parseInt(codNivel),codConteudo);
		
		//pega o primeiro item da lista (se houver mais, sera a paginacao do conteudo)
		if(!codigosConteudo.isEmpty()) {
			primeiroConteudoPagina = codigosConteudo.get(0);
		}
		
		Conteudo conteudo = repositoryConteudo.findByCodnivelAndCodconteudo(Integer.parseInt(codNivel),primeiroConteudoPagina);
		
		try {
			montaBlocos.buscaBlocos(codConteudo,conteudo,montaPaginaDTO).getListaBlocoConteudo();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return montaPaginaDTO;
		
	}

	

}