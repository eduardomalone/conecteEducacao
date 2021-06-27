package com.tecnologia.conecteEducacao.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MontaPaginaDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer indice;
	private Integer codnivel;
	private String titulo;
	private String tipo;
	private List<String> codconteudo;
	private List<String> listaBlocoConteudo = new ArrayList<String>();
	private List<Object> blocos = new ArrayList<Object>();
	private List<String> proximasPaginas = new ArrayList<String>();
	

	public MontaPaginaDTO(){}
	
	public MontaPaginaDTO(Integer indice, Integer codnivel, String titulo, String tipo, List<String> codconteudo,
			List<String> listaBlocoConteudo, List<Object> blocos, List<String> proximasPaginas) {
		super();
		this.indice = indice;
		this.codnivel = codnivel;
		this.titulo = titulo;
		this.tipo = tipo;
		this.codconteudo = codconteudo;
		this.listaBlocoConteudo = listaBlocoConteudo;
		this.blocos = blocos;
		this.proximasPaginas = proximasPaginas;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MontaPaginaDTO other = (MontaPaginaDTO) obj;
		if (indice == null) {
			if (other.indice != null)
				return false;
		} else if (!indice.equals(other.indice))
			return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((indice == null) ? 0 : indice.hashCode());
		return result;
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

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<String> getCodconteudo() {
		return codconteudo;
	}

	public void setCodconteudo(List<String> codconteudo) {
		this.codconteudo = codconteudo;
	}

	public List<String> getListaBlocoConteudo() {
		return listaBlocoConteudo;
	}

	public void setListaBlocoConteudo(List<String> listaBlocoConteudo) {
		this.listaBlocoConteudo = listaBlocoConteudo;
	}

	public List<Object> getBlocos() {
		return blocos;
	}

	public void setBlocos(List<Object> blocos) {
		this.blocos = blocos;
	}

	public List<String> getProximasPaginas() {
		return proximasPaginas;
	}

	public void setProximasPaginas(List<String> proximasPaginas) {
		this.proximasPaginas = proximasPaginas;
	}

	
}
