package com.tecnologia.conecteEducacao.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "tb_conteudo")
public class Conteudo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String texto;
	private String titulo;
	private String assunto;
	private String imageUri;
	private ConteudoNivel nivel;
	
	public Conteudo(){}

	public Conteudo(Long id, String texto, String titulo, String assunto, String imageUri, ConteudoNivel nivel) {
		super();
		this.id = id;
		this.texto = texto;
		this.titulo = titulo;
		this.assunto = assunto;
		this.imageUri = imageUri;
		this.nivel = nivel;
	}



	//n permite as repeticoes
	//ja cria o relacionamento no banco
	
	@ManyToMany
	@JoinTable(name = "tb_conteudo_disciplina",
		joinColumns = @JoinColumn(name="conteudo_id"), 
		inverseJoinColumns = @JoinColumn(name="disciplina_id"))
	private Set<Disciplina> disciplinas = new HashSet<>();

	
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

	public Set<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Conteudo other = (Conteudo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
}
