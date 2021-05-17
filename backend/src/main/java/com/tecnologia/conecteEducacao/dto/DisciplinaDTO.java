package com.tecnologia.conecteEducacao.dto;

import java.io.Serializable;

import com.tecnologia.conecteEducacao.entities.Disciplina;

public class DisciplinaDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	
	public DisciplinaDTO() {}

	public DisciplinaDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public DisciplinaDTO(Disciplina entity) {
		id = entity.getId();
		name = entity.getName();
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
