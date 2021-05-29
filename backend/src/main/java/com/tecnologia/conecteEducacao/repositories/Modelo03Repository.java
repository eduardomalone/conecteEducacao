package com.tecnologia.conecteEducacao.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tecnologia.conecteEducacao.entities.Modelo03;


public interface Modelo03Repository extends JpaRepository<Modelo03, Long>{
	
	List<Modelo03> findAll();
	
	Modelo03 findByCodconteudoAndBloco(String codConteudo, String bloco);

}