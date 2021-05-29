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
@Table(name = "conteudo")
public class Conteudo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer indice;
	private Integer codnivel;
	private String codconteudo;
	private String titulo;
	private String bloco01; 
	private String bloco02; 
	private String bloco03; 
	private String bloco04; 
	private String bloco05; 
	private String bloco06; 
	private String bloco07;
	private String bloco08;
	private String bloco09;
	private String bloco10;
	private Integer statustt;
	private Integer status01;
	private Integer status02;
	private Integer status03;
	private Integer status04;
	private Integer status05;
	private Integer status06;
	private Integer status07;
	private Integer status08;
	private Integer status09;
	private Integer status10;
	private Integer status;
	private Integer statusrd;
	private Integer rodpro;
	private Integer rodant;
	private Integer codescola;
	private Integer codusuario;
	private String tipo;
	
	
	public Conteudo(){}

	public Conteudo(Integer indice, Integer codnivel, String codconteudo, String titulo, String bloco01, String bloco02,
			String bloco03, String bloco04, String bloco05, String bloco06, String bloco07, String bloco08,
			String bloco09, String bloco10, Integer statustt, Integer status01, Integer status02, Integer status03,
			Integer status04, Integer status05, Integer status06, Integer status07, Integer status08, Integer status09,
			Integer status10, Integer status, Integer statusrd, Integer rodpro, Integer rodant, Integer codescola,
			Integer codusuario, String tipo) {
		super();
		this.indice = indice;
		this.codnivel = codnivel;
		this.codconteudo = codconteudo;
		this.titulo = titulo;
		this.bloco01 = bloco01;
		this.bloco02 = bloco02;
		this.bloco03 = bloco03;
		this.bloco04 = bloco04;
		this.bloco05 = bloco05;
		this.bloco06 = bloco06;
		this.bloco07 = bloco07;
		this.bloco08 = bloco08;
		this.bloco09 = bloco09;
		this.bloco10 = bloco10;
		this.statustt = statustt;
		this.status01 = status01;
		this.status02 = status02;
		this.status03 = status03;
		this.status04 = status04;
		this.status05 = status05;
		this.status06 = status06;
		this.status07 = status07;
		this.status08 = status08;
		this.status09 = status09;
		this.status10 = status10;
		this.status = status;
		this.statusrd = statusrd;
		this.rodpro = rodpro;
		this.rodant = rodant;
		this.codescola = codescola;
		this.codusuario = codusuario;
		this.tipo = tipo;
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

	public String getCodconteudo() {
		return codconteudo;
	}

	public void setCodconteudo(String codconteudo) {
		this.codconteudo = codconteudo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getBloco01() {
		return bloco01;
	}

	public void setBloco01(String bloco01) {
		this.bloco01 = bloco01;
	}

	public String getBloco02() {
		return bloco02;
	}

	public void setBloco02(String bloco02) {
		this.bloco02 = bloco02;
	}

	public String getBloco03() {
		return bloco03;
	}

	public void setBloco03(String bloco03) {
		this.bloco03 = bloco03;
	}

	public String getBloco04() {
		return bloco04;
	}

	public void setBloco04(String bloco04) {
		this.bloco04 = bloco04;
	}

	public String getBloco05() {
		return bloco05;
	}

	public void setBloco05(String bloco05) {
		this.bloco05 = bloco05;
	}

	public String getBloco06() {
		return bloco06;
	}

	public void setBloco06(String bloco06) {
		this.bloco06 = bloco06;
	}

	public String getBloco07() {
		return bloco07;
	}

	public void setBloco07(String bloco07) {
		this.bloco07 = bloco07;
	}

	public String getBloco08() {
		return bloco08;
	}

	public void setBloco08(String bloco08) {
		this.bloco08 = bloco08;
	}

	public String getBloco09() {
		return bloco09;
	}

	public void setBloco09(String bloco09) {
		this.bloco09 = bloco09;
	}

	public String getBloco10() {
		return bloco10;
	}

	public void setBloco10(String bloco10) {
		this.bloco10 = bloco10;
	}

	public Integer getStatustt() {
		return statustt;
	}

	public void setStatustt(Integer statustt) {
		this.statustt = statustt;
	}

	public Integer getStatus01() {
		return status01;
	}

	public void setStatus01(Integer status01) {
		this.status01 = status01;
	}

	public Integer getStatus02() {
		return status02;
	}

	public void setStatus02(Integer status02) {
		this.status02 = status02;
	}

	public Integer getStatus03() {
		return status03;
	}

	public void setStatus03(Integer status03) {
		this.status03 = status03;
	}

	public Integer getStatus04() {
		return status04;
	}

	public void setStatus04(Integer status04) {
		this.status04 = status04;
	}

	public Integer getStatus05() {
		return status05;
	}

	public void setStatus05(Integer status05) {
		this.status05 = status05;
	}

	public Integer getStatus06() {
		return status06;
	}

	public void setStatus06(Integer status06) {
		this.status06 = status06;
	}

	public Integer getStatus07() {
		return status07;
	}

	public void setStatus07(Integer status07) {
		this.status07 = status07;
	}

	public Integer getStatus08() {
		return status08;
	}

	public void setStatus08(Integer status08) {
		this.status08 = status08;
	}

	public Integer getStatus09() {
		return status09;
	}

	public void setStatus09(Integer status09) {
		this.status09 = status09;
	}

	public Integer getStatus10() {
		return status10;
	}

	public void setStatus10(Integer status10) {
		this.status10 = status10;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getStatusrd() {
		return statusrd;
	}

	public void setStatusrd(Integer statusrd) {
		this.statusrd = statusrd;
	}

	public Integer getRodpro() {
		return rodpro;
	}

	public void setRodpro(Integer rodpro) {
		this.rodpro = rodpro;
	}

	public Integer getRodant() {
		return rodant;
	}

	public void setRodant(Integer rodant) {
		this.rodant = rodant;
	}

	public Integer getCodescola() {
		return codescola;
	}

	public void setCodescola(Integer codescola) {
		this.codescola = codescola;
	}

	public Integer getCodusuario() {
		return codusuario;
	}

	public void setCodusuario(Integer codusuario) {
		this.codusuario = codusuario;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((indice == null) ? 0 : indice.hashCode());
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
		if (indice == null) {
			if (other.indice != null)
				return false;
		} else if (!indice.equals(other.indice))
			return false;
		return true;
	}

	
}
