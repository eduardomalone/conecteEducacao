package com.tecnologia.conecteEducacao.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tecnologia.conecteEducacao.entities.Modelo01;
import com.tecnologia.conecteEducacao.entities.Modelo05;


public interface Modelo05Repository extends JpaRepository<Modelo05, Long>{
	
	List<Modelo05> findAll();
	
	Modelo05 findByCodconteudoAndBloco(String codConteudo, String bloco);

}