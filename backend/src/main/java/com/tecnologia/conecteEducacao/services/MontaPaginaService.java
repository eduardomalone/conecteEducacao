package com.tecnologia.conecteEducacao.services;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecnologia.conecteEducacao.dto.MontaPaginaDTO;
import com.tecnologia.conecteEducacao.entities.Conteudo;
import com.tecnologia.conecteEducacao.repositories.ConteudoRepository;

@Service
public class MontaPaginaService {

	// pego as informacoes das paginas c o like

	// pego as informacoes com where

	// consulta cada modelo e comoco a montar os conteudos

	@Autowired
	private ConteudoRepository repositoryConteudo;
	
	@Autowired
	private MontaBlocos montaBlocos;
	
	private MontaPaginaDTO montaPaginaDTO;

	public MontaPaginaDTO montarInformacoes(String codConteudo) {

		List<Conteudo> listConteudoLike = repositoryConteudo.findByCodconteudoContaining((codConteudo.substring(0, codConteudo.length()-2)));
		List<String> codigosConteudo = new ArrayList();
		for (Conteudo cont : listConteudoLike) {
			codigosConteudo.add(cont.getCodconteudo().trim());
		}
		MontaPaginaDTO montaPaginaDTO = new MontaPaginaDTO();
		montaPaginaDTO.setCodconteudo(codigosConteudo);
		
		Conteudo conteudo = repositoryConteudo.findByCodconteudo(codConteudo);
		
		try {
			montaBlocos.buscaBlocos(codConteudo,conteudo,montaPaginaDTO).getListaBlocoConteudo();
			//montaPaginaDTO.setCodconteudo( montaBlocos.buscaBlocos(codConteudo,conteudo,montaPaginaDTO).getListaBlocoConteudo() );
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return montaPaginaDTO;
		
	}

	

}