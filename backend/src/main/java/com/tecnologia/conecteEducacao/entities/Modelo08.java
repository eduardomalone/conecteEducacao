package com.tecnologia.conecteEducacao.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "modelo08")
public class Modelo08 implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	
	public Modelo08() {}

	public Modelo08(Integer indice, int codnivel, String codconteudo, String bloco, String titulo, String texto,
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



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((indice == null) ? 0 : indice.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Modelo08 other = (Modelo08) obj;
		if (indice == null) {
			if (other.indice != null)
				return false;
		} else if (!indice.equals(other.indice))
			return false;
		return true;
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


	public String getTexto() {
		return texto;
	}


	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
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
