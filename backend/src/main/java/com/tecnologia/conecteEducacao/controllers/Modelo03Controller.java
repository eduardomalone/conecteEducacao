package com.tecnologia.conecteEducacao.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tecnologia.conecteEducacao.dto.Modelo03DTO;
import com.tecnologia.conecteEducacao.services.Modelo03Service;

@RestController
@RequestMapping(value = "/modelo03")
public class Modelo03Controller {
	
	@Autowired
	private Modelo03Service service;
	
	@GetMapping
	public ResponseEntity<List<Modelo03DTO>> findAll(){
		List<Modelo03DTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("/codConteudoBloco")
	public ResponseEntity<Modelo03DTO> findCodConteudoBloco(@RequestParam Map<String, String> params){
		Modelo03DTO modeloDTO = service.findCodConteudoBloco(params.get("codConteudo"), params.get("bloco"));
		return ResponseEntity.ok().body(modeloDTO);
	}

}
