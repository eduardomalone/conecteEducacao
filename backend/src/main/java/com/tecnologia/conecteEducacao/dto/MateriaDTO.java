package com.tecnologia.conecteEducacao.dto;

import java.io.Serializable;

import com.tecnologia.conecteEducacao.entities.Materia;

public class MateriaDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long indice;
	private Long codnivel;
	private String codmateria;
	private String materia;
	
	public MateriaDTO() {}

	public MateriaDTO(Long indice, Long codnivel, String codmateria, String materia) {
		this.indice = indice;
		this.codnivel = codnivel;
		this.codmateria = codmateria;
		this.materia = materia;
	}
	public MateriaDTO(Materia entity) {
		indice = entity.getIndice();
		codnivel = entity.getCodnivel();
		codmateria = entity.getCodmateria();
		materia = entity.getMateria();
	}



	public Long getIndice() {
		return indice;
	}



	public void setIndice(Long indice) {
		this.indice = indice;
	}



	public Long getCodnivel() {
		return codnivel;
	}



	public void setCodnivel(Long codnivel) {
		this.codnivel = codnivel;
	}



	public String getCodmateria() {
		return codmateria;
	}



	public void setCodmateria(String codmateria) {
		this.codmateria = codmateria;
	}



	public String getMateria() {
		return materia;
	}



	public void setMateria(String materia) {
		this.materia = materia;
	}




}
