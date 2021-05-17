package com.tecnologia.conecteEducacao.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tecnologia.conecteEducacao.dto.DisciplinaDTO;
import com.tecnologia.conecteEducacao.services.DisciplinaService;

@RestController
@RequestMapping(value = "/disciplinas")
public class DisciplinaController {
	
	@Autowired
	private DisciplinaService service;
	
	@GetMapping
	public ResponseEntity<List<DisciplinaDTO>> findAll(){
		List<DisciplinaDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
		
	}

}
