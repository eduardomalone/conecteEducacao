package com.tecnologia.conecteEducacao.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subsubmodulo")
public class SubSubModulo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer indica;
	private Integer codnivel;
	private String codsubsubmodulo;
	private String subsubmodulo;
	private Integer status;
	
	public SubSubModulo() {}

	public SubSubModulo(Integer indica, Integer codnivel, String codsubsubmodulo, String subsubmodulo, Integer status) {
		super();
		this.indica = indica;
		this.codnivel = codnivel;
		this.codsubsubmodulo = codsubsubmodulo;
		this.subsubmodulo = subsubmodulo;
		this.status = status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((indica == null) ? 0 : indica.hashCode());
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
		SubSubModulo other = (SubSubModulo) obj;
		if (indica == null) {
			if (other.indica != null)
				return false;
		} else if (!indica.equals(other.indica))
			return false;
		return true;
	}

	public Integer getIndica() {
		return indica;
	}

	public void setIndica(Integer indica) {
		this.indica = indica;
	}

	public Integer getCodnivel() {
		return codnivel;
	}

	public void setCodnivel(Integer codnivel) {
		this.codnivel = codnivel;
	}

	public String getCodsubsubmodulo() {
		return codsubsubmodulo;
	}

	public void setCodsubsubmodulo(String codsubsubmodulo) {
		this.codsubsubmodulo = codsubsubmodulo;
	}

	public String getSubsubmodulo() {
		return subsubmodulo;
	}

	public void setSubsubmodulo(String subsubmodulo) {
		this.subsubmodulo = subsubmodulo;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}
