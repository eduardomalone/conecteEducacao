package com.tecnologia.conecteEducacao.dto;

import java.io.Serializable;

import com.tecnologia.conecteEducacao.entities.SubModulo;

public class SubModuloDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer indice;
	private Integer codnivel;
	private String codsubmodulo;
	private String submodulo;
	private Integer status;
	
	public SubModuloDTO() {}

	public SubModuloDTO(Integer indice, Integer codnivel, String codsubmodulo, String submodulo, Integer status) {
		super();
		this.indice = indice;
		this.codnivel = codnivel;
		this.codsubmodulo = codsubmodulo;
		this.submodulo = submodulo;
		this.status = status;
	}

	public SubModuloDTO(SubModulo entity) {
		indice = entity.getIndice();
		codnivel = entity.getCodnivel();
		codsubmodulo = entity.getCodsubmodulo();
		submodulo = entity.getSubmodulo();
		status = entity.getStatus();
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
