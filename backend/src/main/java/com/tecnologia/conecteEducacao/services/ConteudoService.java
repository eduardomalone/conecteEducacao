package com.tecnologia.conecteEducacao.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tecnologia.conecteEducacao.dto.ConteudoDTO;
import com.tecnologia.conecteEducacao.entities.Conteudo;
import com.tecnologia.conecteEducacao.repositories.ConteudoRepository;

@Service
public class ConteudoService {
	
	@Autowired
	private ConteudoRepository repository;
		
	
	@Transactional(readOnly = true)
	public List<ConteudoDTO> findAll() {
		List<Conteudo> list = repository.findAll();
		return list.stream().map(x -> new ConteudoDTO(x)).collect(Collectors.toList());
	
	}
	
	@Transactional(readOnly = true)
	public ConteudoDTO findCodConteudo(String codConteudo) {
		Conteudo conteudo = repository.findByCodconteudo(codConteudo);
		ConteudoDTO conteudoDTO = new ConteudoDTO(conteudo);
		return conteudoDTO;
	}
	
	@Transactional(readOnly = true)
	public List<ConteudoDTO> findByCodconteudoContaining(String codConteudo) {
		List<Conteudo> list = repository.findByCodconteudoContaining(codConteudo);
		return list.stream().map(x -> new ConteudoDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public ConteudoDTO findByCodnivelAndCodconteudo(String codnivel, String codConteudo) {
		Conteudo conteudo = repository.findByCodnivelAndCodconteudo(Integer.parseInt(codnivel),codConteudo);
		ConteudoDTO conteudoDTO = new ConteudoDTO(conteudo);
		return conteudoDTO;
	}
	
	@Transactional(readOnly = true)
	public List<ConteudoDTO> findByCodnivelAndCodconteudoContainingOrderByIndice(String codnivel, String codConteudo) {
		List<Conteudo> list = repository.findByCodnivelAndCodconteudoContainingOrderByIndice(Integer.parseInt(codnivel),codConteudo);
		
		List<Conteudo> list2 = new ArrayList<>();
		for (Conteudo item : list) {
	        if (item.getCodconteudo().contains("_")) {
	        	list2.add(item);
	           
	        }
	    }
		
		return list2.stream().map(x -> new ConteudoDTO(x)).collect(Collectors.toList());
	}
	
	
	
}
