package com.tecnologia.conecteEducacao.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tecnologia.conecteEducacao.entities.Modelo04;

@Repository
public interface Modelo04Repository extends JpaRepository<Modelo04, Long>{
	
	List<Modelo04> findAll();
	
	List<Modelo04> findByCodconteudoAndBloco(String codConteudo, String bloco);
	//Modelo04 findByCodconteudoAndBloco(String codConteudo, String bloco);

}