package com.tecnologia.conecteEducacao.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tecnologia.conecteEducacao.entities.Modelo09;

@Repository
public interface Modelo09Repository extends JpaRepository<Modelo09, Long>{
	
	List<Modelo09> findAll();
	
	List<Modelo09> findByCodconteudoAndBloco(String codConteudo, String bloco);
	//Modelo09 findByCodconteudoAndBloco(String codConteudo, String bloco);

}