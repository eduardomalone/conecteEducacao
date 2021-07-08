package com.tecnologia.conecteEducacao.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tecnologia.conecteEducacao.entities.Modelo05;

@Repository
public interface Modelo05Repository extends JpaRepository<Modelo05, Long>{
	
	List<Modelo05> findAll();
	
	List<Modelo05>findByCodconteudoAndBloco(String codConteudo, String bloco);
	//Modelo05 findByCodconteudoAndBloco(String codConteudo, String bloco);

}