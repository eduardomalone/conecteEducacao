package com.tecnologia.conecteEducacao.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tecnologia.conecteEducacao.entities.Modelo01;
import com.tecnologia.conecteEducacao.entities.Modelo06;


public interface Modelo06Repository extends JpaRepository<Modelo06, Long>{
	
	List<Modelo06> findAll();
	
	Modelo06 findByCodconteudoAndBloco(String codConteudo, String bloco);

}