package com.tecnologia.conecteEducacao.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tecnologia.conecteEducacao.entities.Modelo08;

@Repository
public interface Modelo08Repository extends JpaRepository<Modelo08, Long>{
	
	List<Modelo08> findAll();
	
	List<Modelo08> findByCodconteudoAndBloco(String codConteudo, String bloco);
	//Modelo08 findByCodconteudoAndBloco(String codConteudo, String bloco);

}