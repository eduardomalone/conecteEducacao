package com.tecnologia.conecteEducacao.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tecnologia.conecteEducacao.dto.DisciplinaDTO;
import com.tecnologia.conecteEducacao.entities.Disciplina;
import com.tecnologia.conecteEducacao.repositories.DisciplinaRepository;

@Service
public class DisciplinaService {
	
	@Autowired
	private DisciplinaRepository repository;
	
	@Transactional(readOnly = true)
	public List<DisciplinaDTO> findAll() {
		List<Disciplina> list = repository.findAll();
		return list.stream().map(x -> new DisciplinaDTO(x)).collect(Collectors.toList());
	}
}