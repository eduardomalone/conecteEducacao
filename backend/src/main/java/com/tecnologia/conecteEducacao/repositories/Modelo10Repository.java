package com.tecnologia.conecteEducacao.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tecnologia.conecteEducacao.entities.Modelo10;

@Repository
public interface Modelo10Repository extends JpaRepository<Modelo10, Long>{
	
	List<Modelo10> findAll();
	
	List<Modelo10> findByCodconteudoAndBloco(String codConteudo, String bloco);
	//Modelo10 findByCodconteudoAndBloco(String codConteudo, String bloco);

}