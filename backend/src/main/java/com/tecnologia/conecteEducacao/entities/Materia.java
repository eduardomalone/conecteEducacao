package com.tecnologia.conecteEducacao.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "materia")
public class Materia implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long indice;
	private Long codnivel;
	private String codmateria;
	private String materia;
	
	
	public Materia() {}


	public Materia(Long indice, Long codnivel, String codmateria, String materia) {
		super();
		this.indice = indice;
		this.codnivel = codnivel;
		this.codmateria = codmateria;
		this.materia = materia;
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
		Materia other = (Materia) obj;
		if (indice == null) {
			if (other.indice != null)
				return false;
		} else if (!indice.equals(other.indice))
			return false;
		return true;
	}


	public Long getIndice() {
		return indice;
	}


	public void setIndice(Long indice) {
		this.indice = indice;
	}


	public Long getCodnivel() {
		return codnivel;
	}


	public void setCodnivel(Long codnivel) {
		this.codnivel = codnivel;
	}


	public String getCodmateria() {
		return codmateria;
	}


	public void setCodmateria(String codmateria) {
		this.codmateria = codmateria;
	}


	public String getMateria() {
		return materia;
	}


	public void setMateria(String materia) {
		this.materia = materia;
	}

}
