package com.tecnologia.conecteEducacao.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tecnologia.conecteEducacao.dto.Modelo01DTO;
import com.tecnologia.conecteEducacao.dto.ModuloDTO;
import com.tecnologia.conecteEducacao.entities.Modelo01;
import com.tecnologia.conecteEducacao.entities.Modulo;
import com.tecnologia.conecteEducacao.repositories.ModuloRepository;

@Service
public class ModuloService {
	
	@Autowired
	private ModuloRepository repository;
		
	
	@Transactional(readOnly = true)
	public List<ModuloDTO> findAll() {
		List<Modulo> list = repository.findAll();
		return list.stream().map(x -> new ModuloDTO(x)).collect(Collectors.toList());
	
	}
	
	@Transactional(readOnly = true)
	public List<ModuloDTO> findByCodNivel(Integer codnivel) {
		List<Modulo> list = repository.findByCodnivelOrderByIndice( codnivel);
		return list.stream().map(x -> new ModuloDTO(x)).collect(Collectors.toList());
	
	}
	
	@Transactional(readOnly = true)
	public List<ModuloDTO> findByCodModulo(String codmodulo) {
		List<Modulo> list = repository.findByCodmoduloOrderByIndice(codmodulo);
		return list.stream().map(x -> new ModuloDTO(x)).collect(Collectors.toList());
	
	}
	
	@Transactional(readOnly = true)
	public List<ModuloDTO> findByCodnivelAndCodmoduloContaining( String codnivel, String codmodulo) {
		List<Modulo> list = repository.findByCodnivelAndCodmoduloContainingOrderByIndice(Integer.parseInt(codnivel), codmodulo);
		return list.stream().map(x -> new ModuloDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public List<ModuloDTO> findByCodmoduloAndCodnivel(String codmodulo, String codnivel) {
		List<Modulo> list = repository.findByCodmoduloAndCodnivelOrderByIndice(codmodulo, Integer.parseInt(codnivel));
		return list.stream().map(x -> new ModuloDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public List<ModuloDTO> findByCodmoduloContaining(String codmodulo) {
		List<Modulo> list = repository.findByCodmoduloContainingOrderByIndice(codmodulo);
		return list.stream().map(x -> new ModuloDTO(x)).collect(Collectors.toList());
	}
	
	
}
