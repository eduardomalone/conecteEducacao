package com.tecnologia.conecteEducacao.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tecnologia.conecteEducacao.dto.Modelo03DTO;
import com.tecnologia.conecteEducacao.entities.Modelo03;
import com.tecnologia.conecteEducacao.repositories.Modelo03Repository;

@Service
public class Modelo03Service {
	
	@Autowired
	private Modelo03Repository repository;
		
	
	@Transactional(readOnly = true)
	public List<Modelo03DTO> findAll() {
		List<Modelo03> list = repository.findAll();
		return list.stream().map(x -> new Modelo03DTO(x)).collect(Collectors.toList());
	
	}
	
	//@Transactional(readOnly = true)
	//public Modelo03DTO findCodConteudoBloco(String codConteudo, String bloco) {
	//	Modelo03 modelo = repository.findByCodconteudoAndBloco(codConteudo, bloco);
//		Modelo03DTO modeloDTO = new Modelo03DTO(modelo);
//		return modeloDTO;
//	}
}
