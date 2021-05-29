package com.tecnologia.conecteEducacao.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tecnologia.conecteEducacao.dto.ConteudoDTO;
import com.tecnologia.conecteEducacao.dto.Modelo01DTO;
import com.tecnologia.conecteEducacao.services.Modelo01Service;

@RestController
@RequestMapping(value = "/modelo01")
public class Modelo01Controller {
	
	@Autowired
	private Modelo01Service service;
	
	@GetMapping
	public ResponseEntity<List<Modelo01DTO>> findAll(){
		List<Modelo01DTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("/codConteudoBloco")
	public ResponseEntity<Modelo01DTO> findCodConteudoBloco(@RequestParam Map<String, String> params){
		Modelo01DTO modeloDTO = service.findCodConteudoBloco(params.get("codConteudo"), params.get("bloco"));
		return ResponseEntity.ok().body(modeloDTO);
	}
	
	//arrumar para retornar uma lista
	@GetMapping("/{codConteudo}")
	public ResponseEntity<Modelo01DTO> findCodConteudo(@PathVariable String codConteudo){
		Modelo01DTO modeloDTO = service.findCodConteudo(codConteudo);
		return ResponseEntity.ok().body(modeloDTO);
	}

}
