package com.tecnologia.conecteEducacao.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "modelo05")
public class Modelo05 implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer indice;
	private int codnivel;
	private String codconteudo;
	private String bloco;
	private String som;
	private String legenda;
	
	public Modelo05() {}

	public Modelo05(Integer indice, int codnivel, String codconteudo, String bloco, String som, String legenda) {
		super();
		this.indice = indice;
		this.codnivel = codnivel;
		this.codconteudo = codconteudo;
		this.bloco = bloco;
		this.som = som;
		this.legenda = legenda;
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
		Modelo05 other = (Modelo05) obj;
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
