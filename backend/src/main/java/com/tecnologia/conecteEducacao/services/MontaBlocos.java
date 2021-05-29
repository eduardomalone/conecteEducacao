package com.tecnologia.conecteEducacao.services;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecnologia.conecteEducacao.dto.MontaPaginaDTO;
import com.tecnologia.conecteEducacao.entities.Conteudo;
import com.tecnologia.conecteEducacao.entities.Modelo01;
import com.tecnologia.conecteEducacao.entities.Modelo02;
import com.tecnologia.conecteEducacao.entities.Modelo03;
import com.tecnologia.conecteEducacao.entities.Modelo04;
import com.tecnologia.conecteEducacao.entities.Modelo05;
import com.tecnologia.conecteEducacao.entities.Modelo06;
import com.tecnologia.conecteEducacao.entities.Modelo07;
import com.tecnologia.conecteEducacao.entities.Modelo08;
import com.tecnologia.conecteEducacao.entities.Modelo09;
import com.tecnologia.conecteEducacao.entities.Modelo10;
import com.tecnologia.conecteEducacao.repositories.Modelo01Repository;
import com.tecnologia.conecteEducacao.repositories.Modelo02Repository;
import com.tecnologia.conecteEducacao.repositories.Modelo03Repository;
import com.tecnologia.conecteEducacao.repositories.Modelo04Repository;
import com.tecnologia.conecteEducacao.repositories.Modelo05Repository;
import com.tecnologia.conecteEducacao.repositories.Modelo06Repository;
import com.tecnologia.conecteEducacao.repositories.Modelo07Repository;
import com.tecnologia.conecteEducacao.repositories.Modelo08Repository;
import com.tecnologia.conecteEducacao.repositories.Modelo09Repository;
import com.tecnologia.conecteEducacao.repositories.Modelo10Repository;

@Service
public class MontaBlocos {
	
	@Autowired
	private Modelo01Repository repositoryModelo01;
	@Autowired
	private Modelo02Repository repositoryModelo02;
	@Autowired
	private Modelo03Repository repositoryModelo03;
	@Autowired
	private Modelo04Repository repositoryModelo04;
	@Autowired
	private Modelo05Repository repositoryModelo05;
	@Autowired
	private Modelo06Repository repositoryModelo06;
	@Autowired
	private Modelo07Repository repositoryModelo07;
	@Autowired
	private Modelo08Repository repositoryModelo08;
	@Autowired
	private Modelo09Repository repositoryModelo09;
	@Autowired
	private Modelo10Repository repositoryModelo10;
	
	
	public MontaPaginaDTO buscaBlocos(String codConteudo, Conteudo listConteudoLike, MontaPaginaDTO montaPaginaDTO) throws JSONException {

		JSONObject obj = new JSONObject(listConteudoLike);

		
		if(obj.has("bloco01") && (obj.getString("bloco01") != null && !obj.getString("bloco01").equals(""))) {
			montaPaginaDTO = buscaModelo(codConteudo, "bloco01",  obj.getString("bloco01"), montaPaginaDTO);
			
		}
		if(obj.has("bloco02") && (obj.getString("bloco02") != null && !obj.getString("bloco02").equals(""))) {
			montaPaginaDTO = buscaModelo(codConteudo, "bloco02",  obj.getString("bloco02"), montaPaginaDTO);
			
		}
		if(obj.has("bloco03") && (obj.getString("bloco03") != null && !obj.getString("bloco03").equals(""))) {
			montaPaginaDTO = buscaModelo(codConteudo, "bloco03",  obj.getString("bloco03"), montaPaginaDTO);
			
		}
		if(obj.has("bloco04") && (obj.getString("bloco04") != null && !obj.getString("bloco04").equals(""))) {
			montaPaginaDTO = buscaModelo(codConteudo, "bloco04",  obj.getString("bloco04"), montaPaginaDTO);
			
		}
		if(obj.has("bloco05") && (obj.getString("bloco05") != null && !obj.getString("bloco05").equals(""))) {
			montaPaginaDTO = buscaModelo(codConteudo, "bloco05",  obj.getString("bloco05"), montaPaginaDTO);
			
		}
		if(obj.has("bloco06") && (obj.getString("bloco06") != null && !obj.getString("bloco06").equals(""))) {
			montaPaginaDTO = buscaModelo(codConteudo, "bloco06",  obj.getString("bloco06"), montaPaginaDTO);
			
		}
		if(obj.has("bloco07") && (obj.getString("bloco07") != null && !obj.getString("bloco07").equals(""))) {
			montaPaginaDTO = buscaModelo(codConteudo, "bloco07",  obj.getString("bloco07"), montaPaginaDTO);
			
		}
		if(obj.has("bloco08") && (obj.getString("bloco08") != null && !obj.getString("bloco08").equals(""))) {
			montaPaginaDTO = buscaModelo(codConteudo, "bloco08",  obj.getString("bloco08"), montaPaginaDTO);
			
		}
		if(obj.has("bloco09") && (obj.getString("bloco09") != null && !obj.getString("bloco09").equals(""))) {
			montaPaginaDTO = buscaModelo(codConteudo, "bloco09",  obj.getString("bloco09"), montaPaginaDTO);
			
		}
		if(obj.has("bloco10") && (obj.getString("bloco10") != null && !obj.getString("bloco10").equals(""))) {
			montaPaginaDTO = buscaModelo(codConteudo, "bloco10",  obj.getString("bloco10"), montaPaginaDTO);
		}

		return montaPaginaDTO;
	}
	
	public MontaPaginaDTO buscaModelo(String codConteudo, String bloco, String modelo, MontaPaginaDTO montaPaginaDTO) {
		
		switch (modelo) {
		  case "modelo01":
			  Modelo01 modeloConteudo = repositoryModelo01.findByCodconteudoAndBloco(codConteudo, bloco);
			  montaPaginaDTO.getListaBlocoConteudo().add(modeloConteudo.getTexto());
		    break;
		  case "modelo02":
			  Modelo02 modeloConteudo2 = repositoryModelo02.findByCodconteudoAndBloco(codConteudo, bloco);
			  montaPaginaDTO.getListaBlocoConteudo().add(modeloConteudo2.getImagem());
		    break;
		  case "modelo03":
			  Modelo03 modeloConteudo3 = repositoryModelo03.findByCodconteudoAndBloco(codConteudo, bloco);
			  montaPaginaDTO.getListaBlocoConteudo().add(modeloConteudo3.getTexto());
			  break;
		  case "modelo04":
			  Modelo04 modeloConteudo4 = repositoryModelo04.findByCodconteudoAndBloco(codConteudo, bloco);
			  montaPaginaDTO.getListaBlocoConteudo().add(modeloConteudo4.getTexto());
		    break;
		  case "modelo05":
			  Modelo05 modeloConteudo5 = repositoryModelo05.findByCodconteudoAndBloco(codConteudo, bloco);
			  montaPaginaDTO.getListaBlocoConteudo().add(modeloConteudo5.getSom());
		    break;
		  case "modelo06":
			  Modelo06 modeloConteudo6 = repositoryModelo06.findByCodconteudoAndBloco(codConteudo, bloco);
			  montaPaginaDTO.getListaBlocoConteudo().add(modeloConteudo6.getTexto());
		    break;
		  case "modelo07":
			  Modelo07 modeloConteudo7 = repositoryModelo07.findByCodconteudoAndBloco(codConteudo, bloco);
			  montaPaginaDTO.getListaBlocoConteudo().add(modeloConteudo7.getTexto());
		    break;
		  case "modelo08":
			  Modelo08 modeloConteudo8 = repositoryModelo08.findByCodconteudoAndBloco(codConteudo, bloco);
			  montaPaginaDTO.getListaBlocoConteudo().add(modeloConteudo8.getTexto());
			    break;
		  case "modelo09":
			  Modelo09 modeloConteudo9 = repositoryModelo09.findByCodconteudoAndBloco(codConteudo, bloco);
			  montaPaginaDTO.getListaBlocoConteudo().add(modeloConteudo9.getTitulo());
			    break;
		  case "modelo10":
			  Modelo10 modeloConteudo10 = repositoryModelo10.findByCodconteudoAndBloco(codConteudo, bloco);
			  montaPaginaDTO.getListaBlocoConteudo().add(modeloConteudo10.getTabela());
			    break;
		}
		return montaPaginaDTO;
		
	}
	
}
