package com.tecnologia.conecteEducacao.dto;

import java.util.List;

import com.tecnologia.conecteEducacao.entities.SubModulo;
import com.tecnologia.conecteEducacao.entities.SubSubModulo;

public class ObjSubsubModuloDTO {
	
	
	private String subSubmodulo;
	private String codsubsubModulo;
	
	public ObjSubsubModuloDTO() {}

	public String getCodsubsubModulo() {
		return codsubsubModulo;
	}

	public void setCodsubsubModulo(String codsubsubModulo) {
		this.codsubsubModulo = codsubsubModulo;
	}

	public String getSubSubmodulo() {
		return subSubmodulo;
	}

	public void setSubSubmodulo(String subSubmodulo) {
		this.subSubmodulo = subSubmodulo;
	}
	
}
