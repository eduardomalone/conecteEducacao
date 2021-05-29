package com.tecnologia.conecteEducacao.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "modelo03")
public class Modelo03 implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	
	public Modelo03() {}

	public Modelo03(Integer indice, Long codnivel, String codconteudo, String bloco, String texto, String imagem,
			String legenda, String largura, String altura, int codimagem, String apopup, String borda) {
		super();
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
		Modelo03 other = (Modelo03) obj;
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

	
}
