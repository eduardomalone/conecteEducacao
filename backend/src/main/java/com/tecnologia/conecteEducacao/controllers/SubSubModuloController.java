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

import com.tecnologia.conecteEducacao.dto.SubModuloDTO;
import com.tecnologia.conecteEducacao.dto.SubSubModuloDTO;
import com.tecnologia.conecteEducacao.services.SubSubModuloService;

@RestController
@RequestMapping(value = "/subsubmodulo")
public class SubSubModuloController {
	
	@Autowired
	private SubSubModuloService service;
	
	@GetMapping
	public ResponseEntity<List<SubSubModuloDTO>> findAll(){
		List<SubSubModuloDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("/codSubSubModulo/{subsubcodmodulo}")
	public ResponseEntity<List<SubSubModuloDTO>> findByCodModulo(@PathVariable String codsubsubmodulo){
		List<SubSubModuloDTO> list = service.findByCodSubSubModulo(codsubsubmodulo);
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("/codNivel/{codnivel}")
	public ResponseEntity<List<SubSubModuloDTO>> findByCodNivel(@PathVariable Integer codnivel){
		List<SubSubModuloDTO> list = service.findByCodNivel(codnivel);
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("/CodSubSubModuloCodNivel")
	public ResponseEntity<List<SubSubModuloDTO>> findByCodsubsubmoduloAndCodnivel(@RequestParam Map<String, String> params){
		List<SubSubModuloDTO> list = service.findByCodsubsubmoduloAndCodnivel(params.get("codsubsubmodulo"), params.get("codNivel"));
		return ResponseEntity.ok().body(list);
	}
	
	
	@GetMapping("/codsubsubModuloLike/{codsubsubmodulo}")
	public ResponseEntity<List<SubSubModuloDTO>> findByCodmoduloContaining(@PathVariable String codsubsubmodulo){
		List<SubSubModuloDTO> list = service.findByCodsubsubmoduloContaining(codsubsubmodulo);
		return ResponseEntity.ok().body(list);
	}

}
