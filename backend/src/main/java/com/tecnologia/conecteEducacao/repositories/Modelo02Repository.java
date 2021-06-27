package com.tecnologia.conecteEducacao.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tecnologia.conecteEducacao.entities.Modelo02;

@Repository
public interface Modelo02Repository extends JpaRepository<Modelo02, Long>{
	
	List<Modelo02> findAll();
	
	Modelo02 findByCodconteudoAndBloco(String codConteudo, String bloco);
	
	//List<Modelo02> findByCodconteudoAndBloco(String codConteudo, String bloco);

}