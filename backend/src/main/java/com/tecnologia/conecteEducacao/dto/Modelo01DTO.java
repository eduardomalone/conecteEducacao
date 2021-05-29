package com.tecnologia.conecteEducacao.dto;

import java.io.Serializable;

import com.tecnologia.conecteEducacao.entities.Modelo01;

public class Modelo01DTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer indice;
	private Long codnivel;
	private String codconteudo;
	private String bloco;
	private String texto;
	
	public Modelo01DTO() {}

	
	public Modelo01DTO(Integer indice, Long codnivel, String codconteudo, String bloco, String texto) {
		this.indice = indice;
		this.codnivel = codnivel;
		this.codconteudo = codconteudo;
		this.bloco = bloco;
		this.texto = texto;
	}


	public Modelo01DTO(Modelo01 entity) {
		indice = entity.getIndice();
		codnivel = entity.getCodnivel();
		codconteudo = entity.getCodconteudo();
		bloco = entity.getBloco();
		texto = entity.getTexto();
	}


	public Integer getIndice() {
		return indice;
	}


	public void setIndice(Integer indice) {
		this.indice = indice;
	}


	public Long getCodnivel() {
		return codnivel;
	}


	public void setCodnivel(Long codnivel) {
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


	public String getTexto() {
		return texto;
	}


	public void setTexto(String texto) {
		this.texto = texto;
	}

}
