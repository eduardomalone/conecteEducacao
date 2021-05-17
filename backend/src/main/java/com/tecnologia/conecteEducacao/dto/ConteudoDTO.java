package com.tecnologia.conecteEducacao.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.tecnologia.conecteEducacao.entities.Conteudo;
import com.tecnologia.conecteEducacao.entities.ConteudoNivel;

public class ConteudoDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String texto;
	private String titulo;
	private String assunto;
	private String imageUri;
	private ConteudoNivel nivel;
	
	private List<DisciplinaDTO> disciplinas = new ArrayList<>();
	
	public ConteudoDTO(){}

	public ConteudoDTO(Conteudo entity) {
		id = entity.getId();
		texto = entity.getTexto();
		titulo = entity.getTitulo();
		assunto = entity.getAssunto();
		imageUri = entity.getImageUri();
		nivel = entity.getNivel();
		disciplinas = entity.getDisciplinas().stream().map(x -> new DisciplinaDTO(x)).collect(Collectors.toList());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getImageUri() {
		return imageUri;
	}

	public void setImageUri(String imageUri) {
		this.imageUri = imageUri;
	}

	public ConteudoNivel getNivel() {
		return nivel;
	}

	public void setNivel(ConteudoNivel nivel) {
		this.nivel = nivel;
	}

	public List<DisciplinaDTO> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<DisciplinaDTO> disciplinas) {
		this.disciplinas = disciplinas;
	}


}
