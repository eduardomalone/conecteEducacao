package com.tecnologia.conecteEducacao.dto;

import java.util.List;

import com.tecnologia.conecteEducacao.entities.Modulo;

public class ObjModuloDTO {
	
	
	private String modulo;
	private List<ObjSubModuloDTO> objSubModulo;
	
	public ObjModuloDTO() {}

	public ObjModuloDTO(String modulo, List<ObjSubModuloDTO> objSubModulo) {
		this.modulo = modulo;
		this.objSubModulo = objSubModulo;
	}

	public String getModulo() {
		return modulo;
	}

	public void setModulo(String modulo) {
		this.modulo = modulo;
	}

	public List<ObjSubModuloDTO> getObjSubModulo() {
		return objSubModulo;
	}

	public void setObjSubModulo(List<ObjSubModuloDTO> objSubModulo) {
		this.objSubModulo = objSubModulo;
	} 

}
