package com.tecnologia.conecteEducacao.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tecnologia.conecteEducacao.dto.SubModuloDTO;
import com.tecnologia.conecteEducacao.dto.SubSubModuloDTO;
import com.tecnologia.conecteEducacao.entities.SubSubModulo;
import com.tecnologia.conecteEducacao.repositories.SubSubModuloRepository;

@Service
public class SubSubModuloService {
	
	@Autowired
	private SubSubModuloRepository repository;
		
	
	@Transactional(readOnly = true)
	public List<SubSubModuloDTO> findAll() {
		List<SubSubModulo> list = repository.findAll();
		return list.stream().map(x -> new SubSubModuloDTO(x)).collect(Collectors.toList());
	
	}
	
	@Transactional(readOnly = true)
	public List<SubSubModuloDTO> findByCodNivel(Integer codnivel) {
		List<SubSubModulo> list = repository.findByCodnivelOrderByIndica( codnivel);
		return list.stream().map(x -> new SubSubModuloDTO(x)).collect(Collectors.toList());
	
	}
	
	@Transactional(readOnly = true)
	public List<SubSubModuloDTO> findByCodSubSubModulo(String codsubsubmodulo) {
		List<SubSubModulo> list = repository.findByCodsubsubmoduloOrderByIndica(codsubsubmodulo);
		return list.stream().map(x -> new SubSubModuloDTO(x)).collect(Collectors.toList());
	
	}
	
	@Transactional(readOnly = true)
	public List<SubSubModuloDTO> findByCodsubsubmoduloAndCodnivel(String codsubsubmodulo, String codnivel) {
		List<SubSubModulo> list = repository.findByCodsubsubmoduloAndCodnivelOrderByIndica(codsubsubmodulo, Integer.parseInt(codnivel));
		return list.stream().map(x -> new SubSubModuloDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public List<SubSubModuloDTO> findByCodsubsubmoduloContaining(String subsubcodmodulo) {
		List<SubSubModulo> list = repository.findByCodsubsubmoduloContainingOrderByIndica(subsubcodmodulo);
		return list.stream().map(x -> new SubSubModuloDTO(x)).collect(Collectors.toList());
	}
	
	
}
