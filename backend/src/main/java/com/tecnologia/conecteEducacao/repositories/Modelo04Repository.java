package com.tecnologia.conecteEducacao.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tecnologia.conecteEducacao.entities.Modelo01;
import com.tecnologia.conecteEducacao.entities.Modelo04;


public interface Modelo04Repository extends JpaRepository<Modelo04, Long>{
	
	List<Modelo04> findAll();
	
	Modelo04 findByCodconteudoAndBloco(String codConteudo, String bloco);

}