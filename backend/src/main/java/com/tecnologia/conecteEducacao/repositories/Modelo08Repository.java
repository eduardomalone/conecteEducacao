package com.tecnologia.conecteEducacao.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tecnologia.conecteEducacao.entities.Modelo01;
import com.tecnologia.conecteEducacao.entities.Modelo08;


public interface Modelo08Repository extends JpaRepository<Modelo08, Long>{
	
	List<Modelo08> findAll();
	
	Modelo08 findByCodconteudoAndBloco(String codConteudo, String bloco);

}