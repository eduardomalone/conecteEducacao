package com.tecnologia.conecteEducacao.dto;

import java.io.Serializable;

import com.tecnologia.conecteEducacao.entities.Modelo05;

public class Modelo05DTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer indice;
	private int codnivel;
	private String codconteudo;
	private String bloco;
	private String som;
	private String legenda;
	
	public Modelo05DTO() {}

	public Modelo05DTO(Integer indice, int codnivel, String codconteudo, String bloco, String som, String legenda) {
		super();
		this.indice = indice;
		this.codnivel = codnivel;
		this.codconteudo = codconteudo;
		this.bloco = bloco;
		this.som = som;
		this.legenda = legenda;
	}



	public Modelo05DTO(Modelo05 entity) {
		indice = entity.getIndice();
		codnivel = entity.getCodnivel();
		codconteudo = entity.getCodconteudo();
		bloco = entity.getBloco();
		legenda = entity.getLegenda();
	}

	public Integer getIndice() {
		return indice;
	}

	public void setIndice(Integer indice) {
		this.indice = indice;
	}

	public int getCodnivel() {
		return codnivel;
	}

	public void setCodnivel(int codnivel) {
		this.codnivel = codnivel;
	}

	public String getCodconteudo() {
		return codconteudo;
	}

	public void setCodconteudo(String codconteudo) {
		this.codconteudo = codconteudo;
	}

	public String getBloco() {
		return bloco;
	}

	public void setBloco(String bloco) {
		this.bloco = bloco;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public String getLegenda() {
		return legenda;
	}

	public void setLegenda(String legenda) {
		this.legenda = legenda;
	}


}
