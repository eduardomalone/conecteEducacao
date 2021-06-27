package com.tecnologia.conecteEducacao.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "submodulo")
public class SubModulo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer indice;
	private Integer codnivel;
	private String codsubmodulo;
	private String submodulo;
	private Integer status;
	
	public SubModulo() {}

	public SubModulo(Integer indice, Integer codnivel, String codsubmodulo, String submodulo, Integer status) {
		super();
		this.indice = indice;
		this.codnivel = codnivel;
		this.codsubmodulo = codsubmodulo;
		this.submodulo = submodulo;
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
		SubModulo other = (SubModulo) obj;
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

	public String getCodsubmodulo() {
		return codsubmodulo;
	}

	public void setCodsubmodulo(String codsubmodulo) {
		this.codsubmodulo = codsubmodulo;
	}

	public String getSubmodulo() {
		return submodulo;
	}

	public void setSubmodulo(String submodulo) {
		this.submodulo = submodulo;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}
