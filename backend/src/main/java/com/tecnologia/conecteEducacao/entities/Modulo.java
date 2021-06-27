package com.tecnologia.conecteEducacao.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "modulo")
public class Modulo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer indice;
	private Integer codnivel;
	private String codmodulo;
	private String modulo;
	private Integer status;
	
	public Modulo() {}

	public Modulo(Integer indice, Integer codnivel, String codmodulo, String modulo, Integer status) {
		this.indice = indice;
		this.codnivel = codnivel;
		this.codmodulo = codmodulo;
		this.modulo = modulo;
		this.status = status;
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
		Modulo other = (Modulo) obj;
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

	public Integer getCodnivel() {
		return codnivel;
	}

	public void setCodnivel(Integer codnivel) {
		this.codnivel = codnivel;
	}

	public String getCodmodulo() {
		return codmodulo;
	}

	public void setCodmodulo(String codmodulo) {
		this.codmodulo = codmodulo;
	}

	public String getModulo() {
		return modulo;
	}

	public void setModulo(String modulo) {
		this.modulo = modulo;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}
