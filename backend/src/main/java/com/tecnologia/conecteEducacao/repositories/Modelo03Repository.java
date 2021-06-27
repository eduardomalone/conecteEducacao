package com.tecnologia.conecteEducacao.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tecnologia.conecteEducacao.entities.Modelo03;

@Repository
public interface Modelo03Repository extends JpaRepository<Modelo03, Long>{
	
	List<Modelo03> findAll();
	
	List<Modelo03>  findByCodconteudoAndBloco(String codConteudo, String bloco);
	//Modelo03 findByCodconteudoAndBloco(String codConteudo, String bloco);

}