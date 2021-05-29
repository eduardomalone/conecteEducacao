package com.tecnologia.conecteEducacao.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "modelo10")
public class Modelo10 implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer indice;
	private int codnivel;
	private String codconteudo;
	private String bloco;
	private String titulo;
	private String linha;
	private String coluna;
	private String tipo;
	private String tabela;
	
	public Modelo10() {}



	public Modelo10(Integer indice, int codnivel, String codconteudo, String bloco, String titulo, String linha,
			String coluna, String tipo, String tabela) {
		super();
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
		Modelo10 other = (Modelo10) obj;
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
