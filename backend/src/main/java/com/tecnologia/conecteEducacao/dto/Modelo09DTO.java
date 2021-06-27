package com.tecnologia.conecteEducacao.dto;

import java.io.Serializable;

import com.tecnologia.conecteEducacao.entities.Modelo09;

public class Modelo09DTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer indice;
	private int codnivel;
	private String codconteudo;
	private String bloco;
	private String titulo;
	private String linha;
	private String lista;
	private String link;
	
	public Modelo09DTO() {}


	public Modelo09DTO(Integer indice, int codnivel, String codconteudo, String bloco, String titulo, String linha,
			String lista, String link) {
		this.indice = indice;
		this.codnivel = codnivel;
		this.codconteudo = codconteudo;
		this.bloco = bloco;
		this.titulo = titulo;
		this.linha = linha;
		this.lista = lista;
		this.link = link;
	}

	public Modelo09DTO(Modelo09 entity) {
		indice = entity.getIndice();
		codnivel = entity.getCodnivel();
		codconteudo = entity.getCodconteudo();
		bloco = entity.getBloco();
		titulo = entity.getTitulo();
		linha = entity.getLinha();
		lista = entity.getLista();
		link = entity.getLink();
		
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


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getLinha() {
		return linha;
	}


	public void setLinha(String linha) {
		this.linha = linha;
	}


	public String getLista() {
		return lista;
	}


	public void setLista(String lista) {
		this.lista = lista;
	}


	public String getLink() {
		return link;
	}


	public void setLink(String link) {
		this.link = link;
	}
	
}
