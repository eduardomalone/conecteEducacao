package com.tecnologia.conecteEducacao.dto;

import java.io.Serializable;

import com.tecnologia.conecteEducacao.entities.Modelo07;

public class Modelo07DTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer indice;
	private int codnivel;
	private String codconteudo;
	private String bloco;
	private String texto;
	private String destaque;
	
	public Modelo07DTO() {}


	public Modelo07DTO(Integer indice, int codnivel, String codconteudo, String bloco, String texto, String destaque) {
		this.indice = indice;
		this.codnivel = codnivel;
		this.codconteudo = codconteudo;
		this.bloco = bloco;
		this.texto = texto;
		this.destaque = destaque;
	}

	public Modelo07DTO(Modelo07 entity) {
		indice = entity.getIndice();
		codnivel = entity.getCodnivel();
		codconteudo = entity.getCodconteudo();
		bloco = entity.getBloco();
		texto = entity.getTexto();
		destaque = entity.getDestaque();
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


	public String getDestaque() {
		return destaque;
	}


	public void setDestaque(String destaque) {
		this.destaque = destaque;
	}


	public String getTexto() {
		return texto;
	}


	public void setTexto(String texto) {
		this.texto = texto;
	}

}
