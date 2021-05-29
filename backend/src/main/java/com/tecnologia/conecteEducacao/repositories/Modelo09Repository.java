package com.tecnologia.conecteEducacao.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tecnologia.conecteEducacao.entities.Modelo01;
import com.tecnologia.conecteEducacao.entities.Modelo09;


public interface Modelo09Repository extends JpaRepository<Modelo09, Long>{
	
	List<Modelo09> findAll();
	
	Modelo09 findByCodconteudoAndBloco(String codConteudo, String bloco);

}