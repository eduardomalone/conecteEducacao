package com.tecnologia.conecteEducacao.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MontaPaginaDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer indice;
	private Integer codnivel;
	private List<String>codconteudo;
	private String titulo;
	/*private String bloco01Conteudo; 
	private String bloco02Conteudo; 
	private String bloco03Conteudo; 
	private String bloco04Conteudo; 
	private String bloco05Conteudo; 
	private String bloco06Conteudo; 
	private String bloco07Conteudo;
	private String bloco08Conteudo;
	private String bloco09Conteudo;
	private String bloco10Conteudo;*/
	private List<String> listaBlocoConteudo = new ArrayList<String>();
	
	
	public List<String> getListaBlocoConteudo() {
		return listaBlocoConteudo;
	}




	public void setListaBlocoConteudo(List<String> listaBlocoConteudo) {
		this.listaBlocoConteudo = listaBlocoConteudo;
	}




	private String tipo;
	
	public MontaPaginaDTO(){}

	
	

	/*public MontaPaginaDTO(Conteudo entity) {
		indice = entity.getIndice();
		codnivel = entity.getCodnivel();
		codconteudo = entity.getCodconteudo();
		titulo = entity.getTitulo();
		bloco01 = entity.getBloco01();
		bloco02 = entity.getBloco02();
		bloco03 = entity.getBloco03();
		bloco04 = entity.getBloco04();
		bloco05 = entity.getBloco05();
		bloco06 = entity.getBloco06();
		bloco07 = entity.getBloco07();
		bloco08 = entity.getBloco08();
		bloco09 = entity.getBloco09();
		bloco10 = entity.getBloco10();
		statustt = entity.getStatustt();
		status01 = entity.getStatus01();
		status02 = entity.getStatus02();
		status03 = entity.getStatus03();
		status04 = entity.getStatus04();
		status05 = entity.getStatus05();
		status06 = entity.getStatus06();
		status07 = entity.getStatus07();
		status08 = entity.getStatus08();
		status09 = entity.getStatus09();
		status10 = entity.getStatus10();
		status = entity.getStatus();
		statusrd = entity.getStatusrd();
		rodpro = entity.getRodpro();
		rodant = entity.getRodant();
		codescola = entity.getCodescola();
		codusuario = entity.getCodusuario();
		tipo = entity.getTipo();
	}*/


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


	public List<String>  getCodconteudo() {
		return codconteudo;
	}


	public void setCodconteudo(List<String> codigosConteudo) {
		this.codconteudo = codigosConteudo;
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
	
}
