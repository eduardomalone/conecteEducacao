package com.tecnologia.conecteEducacao.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.tecnologia.conecteEducacao.dto.ConteudoDTO;
import com.tecnologia.conecteEducacao.services.ConteudoService;


@RestController
@RequestMapping(value = "/conteudos")
public class ConteudoController {
	
	@Autowired
	private ConteudoService service;
	
	@GetMapping
	public ResponseEntity<List<ConteudoDTO>> findAll(){
		List<ConteudoDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@PostMapping
	public ResponseEntity<ConteudoDTO> insert(@RequestBody ConteudoDTO dto){
		dto = service.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(dto.getId()).toUri();
		return ResponseEntity.created(uri).body(dto);
	}
	
	//@PutMapping("/{id}/delivered")
	//public ResponseEntity<OrderDTO> setDelivered (@PathVariable Long id){
	//	OrderDTO dto = service.setDelivered(id);
	//	return ResponseEntity.ok().body(dto);
	//}


}
