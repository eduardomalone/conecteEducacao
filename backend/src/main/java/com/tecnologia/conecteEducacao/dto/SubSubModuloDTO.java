package com.tecnologia.conecteEducacao.dto;

import java.io.Serializable;

import com.tecnologia.conecteEducacao.entities.SubSubModulo;

public class SubSubModuloDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer indica;
	private Integer codnivel;
	private String codsubsubmodulo;
	private String subsubmodulo;
	private Integer status;
	
	public SubSubModuloDTO() {}

	
	public SubSubModuloDTO(Integer indica, Integer codnivel, String codsubsubmodulo, String subsubmodulo,
			Integer status) {
		this.indica = indica;
		this.codnivel = codnivel;
		this.codsubsubmodulo = codsubsubmodulo;
		this.subsubmodulo = subsubmodulo;
		this.status = status;
	}


	public SubSubModuloDTO(SubSubModulo entity) {
		indica = entity.getIndica();
		codnivel = entity.getCodnivel();
		codsubsubmodulo = entity.getCodsubsubmodulo();
		subsubmodulo = entity.getSubsubmodulo();
		status = entity.getStatus();
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
