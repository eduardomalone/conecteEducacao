package com.tecnologia.conecteEducacao.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tecnologia.conecteEducacao.dto.ConteudoDTO;
import com.tecnologia.conecteEducacao.dto.MateriaDTO;
import com.tecnologia.conecteEducacao.entities.Conteudo;
import com.tecnologia.conecteEducacao.entities.Materia;
import com.tecnologia.conecteEducacao.repositories.MateriaRepository;

@Service
public class MateriaService {
	
	@Autowired
	private MateriaRepository repository;
	
	@Transactional(readOnly = true)
	public List<MateriaDTO> findAll() {
		List<Materia> list = repository.findAll();
		return list.stream().map(x -> new MateriaDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public List<MateriaDTO> findCodNivel(Long codnivel) {
		List<Materia> list = repository.findByCodnivelOrderByMateriaAsc(codnivel);
		return list.stream().map(x -> new MateriaDTO(x)).collect(Collectors.toList());
	}
	
}