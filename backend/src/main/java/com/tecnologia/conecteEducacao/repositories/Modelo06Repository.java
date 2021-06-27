package com.tecnologia.conecteEducacao.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tecnologia.conecteEducacao.entities.Modelo06;

@Repository
public interface Modelo06Repository extends JpaRepository<Modelo06, Long>{
	
	List<Modelo06> findAll();
	
	List<Modelo06> findByCodconteudoAndBloco(String codConteudo, String bloco);
	//Modelo06 findByCodconteudoAndBloco(String codConteudo, String bloco);

}