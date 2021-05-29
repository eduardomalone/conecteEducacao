package com.tecnologia.conecteEducacao.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tecnologia.conecteEducacao.dto.ConteudoDTO;
import com.tecnologia.conecteEducacao.dto.MontaPaginaDTO;
import com.tecnologia.conecteEducacao.services.ConteudoService;
import com.tecnologia.conecteEducacao.services.MontaPaginaService;


@RestController
@RequestMapping(value = "/conteudos")
public class ConteudoController {
	
	@Autowired
	private ConteudoService service;
	
	@Autowired
	private MontaPaginaService serviceMontaPagina;
	
	@GetMapping
	public ResponseEntity<List<ConteudoDTO>> findAll(){
		List<ConteudoDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("/{codConteudo}")
	public ResponseEntity<ConteudoDTO> findCodConteudo(@PathVariable String codConteudo){
		ConteudoDTO conteudo = service.findCodConteudo(codConteudo);
		return ResponseEntity.ok().body(conteudo);
	}

	@GetMapping("like/{codConteudo}")
	public ResponseEntity<List<ConteudoDTO>> findByCodconteudoContaining(@PathVariable String codConteudo){
		List<ConteudoDTO> list = service.findByCodconteudoContaining(codConteudo);
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("/montaPagina/{codConteudo}")
	public ResponseEntity<MontaPaginaDTO> montaPagina(@PathVariable String codConteudo){
		MontaPaginaDTO montaPaginaDTO = serviceMontaPagina.montarInformacoes(codConteudo);
		return ResponseEntity.ok().body(montaPaginaDTO);
	}
	
}
