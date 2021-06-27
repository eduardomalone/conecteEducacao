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

import com.tecnologia.conecteEducacao.dto.ModuloDTO;
import com.tecnologia.conecteEducacao.dto.SubModuloDTO;
import com.tecnologia.conecteEducacao.services.SubModuloService;

@RestController
@RequestMapping(value = "/submodulo")
public class SubModuloController {
	
	@Autowired
	private SubModuloService service;
	
	@GetMapping
	public ResponseEntity<List<SubModuloDTO>> findAll(){
		List<SubModuloDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("/codSubModulo/{subcodmodulo}")
	public ResponseEntity<List<SubModuloDTO>> findByCodModulo(@PathVariable String codsubmodulo){
		List<SubModuloDTO> list = service.findByCodSubModulo(codsubmodulo);
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("/codNivel/{codnivel}")
	public ResponseEntity<List<SubModuloDTO>> findByCodNivel(@PathVariable Integer codnivel){
		List<SubModuloDTO> list = service.findByCodNivel(codnivel);
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("/CodSubModuloCodNivel")
	public ResponseEntity<List<SubModuloDTO>> findByCodmoduloAndCodnivel(@RequestParam Map<String, String> params){
		List<SubModuloDTO> list = service.findByCodsubmoduloAndCodnivel(params.get("codsubModulo"), params.get("codNivel"));
		return ResponseEntity.ok().body(list);
	}
	
	
	@GetMapping("/codsubModuloLike/{codsubmodulo}")
	public ResponseEntity<List<SubModuloDTO>> findByCodmoduloContaining(@PathVariable String codsubmodulo){
		List<SubModuloDTO> list = service.findByCodmoduloContaining(codsubmodulo);
		return ResponseEntity.ok().body(list);
	}

	@GetMapping("/codsubmoduloAndCodnivel")
	public ResponseEntity<List<SubModuloDTO>> findByCodnivelAndCodmoduloContaining(@RequestParam Map<String, String> params){
		List<SubModuloDTO> list = service.findByCodnivelAndCodsubmoduloContaining(params.get("codNivel"), params.get("codModulo"));
		return ResponseEntity.ok().body(list);
	}
	
}
