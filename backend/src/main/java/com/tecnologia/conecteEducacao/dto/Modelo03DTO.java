package com.tecnologia.conecteEducacao.dto;

import java.io.Serializable;

import com.tecnologia.conecteEducacao.entities.Modelo03;

public class Modelo03DTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer indice;
	private Long codnivel;
	private String codconteudo;
	private String bloco;
	private String texto;
	private String imagem;
	private String legenda;
	private String largura;
	private String altura;
	private int codimagem;
	private String apopup;
	private String borda;
	
	public Modelo03DTO() {}

	public Modelo03DTO(Integer indice, Long codnivel, String codconteudo, String bloco, String texto, String imagem,
			String legenda, String largura, String altura, int codimagem, String apopup, String borda) {
		this.indice = indice;
		this.codnivel = codnivel;
		this.codconteudo = codconteudo;
		this.bloco = bloco;
		this.texto = texto;
		this.imagem = imagem;
		this.legenda = legenda;
		this.largura = largura;
		this.altura = altura;
		this.codimagem = codimagem;
		this.apopup = apopup;
		this.borda = borda;
	}


	public Modelo03DTO(Modelo03 entity) {
		indice = entity.getIndice();
		codnivel = entity.getCodnivel();
		codconteudo = entity.getCodconteudo();
		bloco = entity.getBloco();
		texto = entity.getTexto();
		imagem = entity.getImagem();
		legenda = entity.getLegenda();
		largura = entity.getLargura();
		altura = entity.getAltura();
		codimagem = entity.getCodimagem();
		apopup = entity.getApopup();
		borda = entity.getBord();
	}


	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public String getLegenda() {
		return legenda;
	}

	public void setLegenda(String legenda) {
		this.legenda = legenda;
	}

	public String getLargura() {
		return largura;
	}

	public void setLargura(String largura) {
		this.largura = largura;
	}

	public String getAltura() {
		return altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}

	public int getCodimagem() {
		return codimagem;
	}

	public void setCodimagem(int codimagem) {
		this.codimagem = codimagem;
	}

	public String getApopup() {
		return apopup;
	}

	public void setApopup(String apopup) {
		this.apopup = apopup;
	}

	public String getBord() {
		return borda;
	}

	public void setBord(String borda) {
		this.borda = borda;
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
