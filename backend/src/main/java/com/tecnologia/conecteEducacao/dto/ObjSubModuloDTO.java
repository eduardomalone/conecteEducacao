package com.tecnologia.conecteEducacao.dto;

import java.util.List;

import com.tecnologia.conecteEducacao.entities.SubModulo;
import com.tecnologia.conecteEducacao.entities.SubSubModulo;

public class ObjSubModuloDTO {
	
	
	private String submodulo;
	private List<ObjSubsubModuloDTO> subsubModulo;
	
	public ObjSubModuloDTO() {}

	public String getSubmodulo() {
		return submodulo;
	}

	public void setSubmodulo(String submodulo) {
		this.submodulo = submodulo;
	}

	public List<ObjSubsubModuloDTO> getSubsubModulo() {
		return subsubModulo;
	}

	public void setSubsubModulo(List<ObjSubsubModuloDTO> subsubModulo) {
		this.subsubModulo = subsubModulo;
	}

	

}
