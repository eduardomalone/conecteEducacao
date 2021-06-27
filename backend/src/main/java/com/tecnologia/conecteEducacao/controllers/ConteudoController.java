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
import com.tecnologia.conecteEducacao.dto.MontaPaginaDTO;
import com.tecnologia.conecteEducacao.dto.ObjModuloDTO;
import com.tecnologia.conecteEducacao.dto.SubModuloDTO;
import com.tecnologia.conecteEducacao.services.ConteudoService;
import com.tecnologia.conecteEducacao.services.MontaArvoreService;
import com.tecnologia.conecteEducacao.services.MontaPaginaService;


@RestController
@RequestMapping(value = "/conteudos")
public class ConteudoController {
	
	@Autowired
	private ConteudoService service;
	
	@Autowired
	private MontaPaginaService serviceMontaPagina;
	
	@Autowired
	private MontaArvoreService serviceMontaArvore;
	
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

	@GetMapping("/like/{codConteudo}")
	public ResponseEntity<List<ConteudoDTO>> findByCodconteudoContaining(@PathVariable String codConteudo){
		List<ConteudoDTO> list = service.findByCodconteudoContaining(codConteudo);
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("/codnivelAndCodconteudo")
	public ResponseEntity<ConteudoDTO> findByCodnivelAndCodconteudo(@RequestParam Map<String, String> params){
		ConteudoDTO conteudo = service.findByCodnivelAndCodconteudo(params.get("codNivel"), params.get("codConteudo"));
		return ResponseEntity.ok().body(conteudo);
	}
	
	
	@GetMapping("/montaPagina")
	public ResponseEntity<MontaPaginaDTO> montaPagina(@RequestParam Map<String, String> params){
		MontaPaginaDTO montaPaginaDTO = serviceMontaPagina.montarInformacoes(params.get("codNivel"), params.get("codConteudo"));
		return ResponseEntity.ok().body(montaPaginaDTO);
	}
	
	@GetMapping("/montaArvore/")
	public ResponseEntity<List<ObjModuloDTO>> montaArvore(@RequestParam Map<String, String> params){
		List<ObjModuloDTO> list = serviceMontaArvore.montarArvore(params.get("codNivel"), params.get("codModulo"));
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("/montaArvore/findByCodnivelAndCodconteudoContainingOrderByIndice")
	public ResponseEntity<List<ConteudoDTO>> findByCodnivelAndCodconteudoContainingOrderByIndice(@RequestParam Map<String, String> params){
		List<ConteudoDTO> list = service.findByCodnivelAndCodconteudoContainingOrderByIndice(params.get("codNivel"), params.get("codModulo"));
		return ResponseEntity.ok().body(list);
	}
	
	
	
}
