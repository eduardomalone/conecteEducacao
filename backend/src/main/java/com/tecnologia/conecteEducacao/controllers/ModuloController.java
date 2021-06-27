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

import com.tecnologia.conecteEducacao.dto.Modelo01DTO;
import com.tecnologia.conecteEducacao.dto.ModuloDTO;
import com.tecnologia.conecteEducacao.services.ModuloService;

@RestController
@RequestMapping(value = "/modulo")
public class ModuloController {
	
	@Autowired
	private ModuloService service;
	
	@GetMapping
	public ResponseEntity<List<ModuloDTO>> findAll(){
		List<ModuloDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("/codModulo/{codmodulo}")
	public ResponseEntity<List<ModuloDTO>> findByCodModulo(@PathVariable String codmodulo){
		List<ModuloDTO> list = service.findByCodModulo(codmodulo);
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("/codNivel/{codnivel}")
	public ResponseEntity<List<ModuloDTO>> findByCodNivel(@PathVariable Integer codnivel){
		List<ModuloDTO> list = service.findByCodNivel(codnivel);
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("/CodModuloCodNivel")
	public ResponseEntity<List<ModuloDTO>> findByCodmoduloAndCodnivel(@RequestParam Map<String, String> params){
		List<ModuloDTO> list = service.findByCodmoduloAndCodnivel(params.get("codModulo"), params.get("codNivel"));
		return ResponseEntity.ok().body(list);
	}
	
	
	@GetMapping("/codModuloLike/{codmodulo}")
	public ResponseEntity<List<ModuloDTO>> findByCodmoduloContaining(@PathVariable String codmodulo){
		List<ModuloDTO> list = service.findByCodmoduloContaining(codmodulo);
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("/codmoduloAndCodnivel")
	public ResponseEntity<List<ModuloDTO>> findByCodnivelAndCodmoduloContaining(@RequestParam Map<String, String> params){
		List<ModuloDTO> list = service.findByCodnivelAndCodmoduloContaining(params.get("codNivel"), params.get("codModulo"));
		return ResponseEntity.ok().body(list);
	}
	
	

}
