package com.tecnologia.conecteEducacao.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tecnologia.conecteEducacao.entities.Modelo01;
import com.tecnologia.conecteEducacao.entities.Modelo10;


public interface Modelo10Repository extends JpaRepository<Modelo10, Long>{
	
	List<Modelo10> findAll();
	
	Modelo10 findByCodconteudoAndBloco(String codConteudo, String bloco);

}