package com.tecnologia.conecteEducacao.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tecnologia.conecteEducacao.dto.ModuloDTO;
import com.tecnologia.conecteEducacao.dto.SubModuloDTO;
import com.tecnologia.conecteEducacao.entities.Modulo;
import com.tecnologia.conecteEducacao.entities.SubModulo;
import com.tecnologia.conecteEducacao.repositories.SubModuloRepository;

@Service
public class SubModuloService {
	
	@Autowired
	private SubModuloRepository repository;
		
	
	@Transactional(readOnly = true)
	public List<SubModuloDTO> findAll() {
		List<SubModulo> list = repository.findAll();
		return list.stream().map(x -> new SubModuloDTO(x)).collect(Collectors.toList());
	
	}
	
	@Transactional(readOnly = true)
	public List<SubModuloDTO> findByCodNivel(Integer codnivel) {
		List<SubModulo> list = repository.findByCodnivelOrderByIndice( codnivel);
		return list.stream().map(x -> new SubModuloDTO(x)).collect(Collectors.toList());
	
	}
	
	@Transactional(readOnly = true)
	public List<SubModuloDTO> findByCodSubModulo(String codsubmodulo) {
		List<SubModulo> list = repository.findByCodsubmoduloOrderByIndice(codsubmodulo);
		return list.stream().map(x -> new SubModuloDTO(x)).collect(Collectors.toList());
	
	}
	
	@Transactional(readOnly = true)
	public List<SubModuloDTO> findByCodsubmoduloAndCodnivel(String codsubmodulo, String codnivel) {
		List<SubModulo> list = repository.findByCodsubmoduloAndCodnivelOrderByIndice(codsubmodulo, Integer.parseInt(codnivel));
		return list.stream().map(x -> new SubModuloDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public List<SubModuloDTO> findByCodmoduloContaining(String subcodmodulo) {
		List<SubModulo> list = repository.findByCodsubmoduloContainingOrderByIndice(subcodmodulo);
		return list.stream().map(x -> new SubModuloDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public List<SubModuloDTO> findByCodnivelAndCodsubmoduloContaining( String codnivel, String codmodulo) {
		List<SubModulo> list = repository.findByCodnivelAndCodsubmoduloContainingOrderByIndice(Integer.parseInt(codnivel), codmodulo);
		return list.stream().map(x -> new SubModuloDTO(x)).collect(Collectors.toList());
	}
}
