package com.tecnologia.conecteEducacao.dto;

import java.io.Serializable;

import com.tecnologia.conecteEducacao.entities.Modulo;

public class ModuloDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer indice;
	private Integer codnivel;
	private String codmodulo;
	private String modulo;
	private Integer status;
	
	public ModuloDTO() {}

	public ModuloDTO(Integer indice, Integer codnivel, String codmodulo, String modulo, Integer status) {
		super();
		this.indice = indice;
		this.codnivel = codnivel;
		this.codmodulo = codmodulo;
		this.modulo = modulo;
		this.status = status;
	}

	public ModuloDTO(Modulo entity) {
		indice = entity.getIndice();
		codnivel = entity.getCodnivel();
		codmodulo = entity.getCodmodulo();
		modulo = entity.getModulo();
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
