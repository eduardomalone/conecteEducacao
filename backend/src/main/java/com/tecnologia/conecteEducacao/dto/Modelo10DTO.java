package com.tecnologia.conecteEducacao.dto;

import java.io.Serializable;

import com.tecnologia.conecteEducacao.entities.Modelo10;

public class Modelo10DTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer indice;
	private int codnivel;
	private String codconteudo;
	private String bloco;
	private String titulo;
	private String linha;
	private String coluna;
	private String tipo;
	private String tabela;
	
	public Modelo10DTO() {}



	public Modelo10DTO(Integer indice, int codnivel, String codconteudo, String bloco, String titulo, String linha,
			String coluna, String tipo, String tabela) {
		this.indice = indice;
		this.codnivel = codnivel;
		this.codconteudo = codconteudo;
		this.bloco = bloco;
		this.titulo = titulo;
		this.linha = linha;
		this.coluna = coluna;
		this.tipo = tipo;
		this.tabela = tabela;
	}

	public Modelo10DTO(Modelo10 entity) {
		indice = entity.getIndice();
		codnivel = entity.getCodnivel();
		codconteudo = entity.getCodconteudo();
		bloco = entity.getBloco();
		titulo = entity.getTitulo();
		linha = entity.getLinha();
		coluna = entity.getColuna();
		tipo = entity.getTipo();
		tabela = entity.getTabela();
		
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



	public String getColuna() {
		return coluna;
	}



	public void setColuna(String coluna) {
		this.coluna = coluna;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public String getTabela() {
		return tabela;
	}



	public void setTabela(String tabela) {
		this.tabela = tabela;
	}

	
}
