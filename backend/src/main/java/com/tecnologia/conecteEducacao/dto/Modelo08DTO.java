package com.tecnologia.conecteEducacao.dto;

import java.io.Serializable;

import com.tecnologia.conecteEducacao.entities.Modelo06;
import com.tecnologia.conecteEducacao.entities.Modelo08;

public class Modelo08DTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer indice;
	private int codnivel;
	private String codconteudo;
	private String bloco;
	private String titulo;
	private String texto;
	private String imagem;
	private String largura;
	private String altura;
	private String link;
	private int codimagem;
	
	public Modelo08DTO() {}

	public Modelo08DTO(Integer indice, int codnivel, String codconteudo, String bloco, String titulo, String texto,
			String imagem, String largura, String altura, String link, int codimagem) {
		this.indice = indice;
		this.codnivel = codnivel;
		this.codconteudo = codconteudo;
		this.bloco = bloco;
		this.titulo = titulo;
		this.texto = texto;
		this.imagem = imagem;
		this.largura = largura;
		this.altura = altura;
		this.link = link;
		this.codimagem = codimagem;
	}

	public Modelo08DTO(Modelo08 entity) {
		indice = entity.getIndice();
		codnivel = entity.getCodnivel();
		codconteudo = entity.getCodconteudo();
		bloco = entity.getBloco();
		titulo = entity.getTitulo();
		texto = entity.getTexto();
		imagem = entity.getImagem();
		largura = entity.getLargura();
		altura = entity.getAltura();
		link = entity.getLink();
		codimagem = entity.getCodimagem();
		
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

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
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

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public int getCodimagem() {
		return codimagem;
	}

	public void setCodimagem(int codimagem) {
		this.codimagem = codimagem;
	}

	
}
