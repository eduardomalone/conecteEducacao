package com.tecnologia.conecteEducacao.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tecnologia.conecteEducacao.entities.Modelo01;
import com.tecnologia.conecteEducacao.entities.Modelo07;


public interface Modelo07Repository extends JpaRepository<Modelo07, Long>{
	
	List<Modelo07> findAll();
	
	Modelo07 findByCodconteudoAndBloco(String codConteudo, String bloco);

}