package com.tecnologia.conecteEducacao.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tecnologia.conecteEducacao.dto.Modelo01DTO;
import com.tecnologia.conecteEducacao.entities.Modelo01;
import com.tecnologia.conecteEducacao.repositories.Modelo01Repository;

@Service
public class Modelo01Service {
	
	@Autowired
	private Modelo01Repository repository;
		
	
	@Transactional(readOnly = true)
	public List<Modelo01DTO> findAll() {
		List<Modelo01> list = repository.findAll();
		return list.stream().map(x -> new Modelo01DTO(x)).collect(Collectors.toList());
	
	}
	
	//@Transactional(readOnly = true)
	//public Modelo01DTO findCodConteudoBloco(String codConteudo, String bloco) {
	//	Modelo01 modelo = repository.findByCodconteudoAndBloco(codConteudo, bloco);
	//	Modelo01DTO modeloDTO = new Modelo01DTO(modelo);
	//	return modeloDTO;
	//}
	
	@Transactional(readOnly = true)
	public Modelo01DTO findCodConteudo(String codConteudo) {
		Modelo01 modelo = repository.findByCodconteudo(codConteudo);
		Modelo01DTO modeloDTO = new Modelo01DTO(modelo);
		return modeloDTO;
	}
	
}
