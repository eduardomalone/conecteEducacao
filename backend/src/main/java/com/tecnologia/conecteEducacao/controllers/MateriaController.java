package com.tecnologia.conecteEducacao.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tecnologia.conecteEducacao.dto.MateriaDTO;
import com.tecnologia.conecteEducacao.services.MateriaService;

@RestController
@RequestMapping(value = "/materias")
public class MateriaController {
	
	@Autowired
	private MateriaService service;
	
	@GetMapping
	public ResponseEntity<List<MateriaDTO>> findAll(){
		List<MateriaDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
		
	}

}
