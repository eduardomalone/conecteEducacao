package com.tecnologia.conecteEducacao.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tecnologia.conecteEducacao.entities.Modelo01;

@Repository
public interface Modelo01Repository extends JpaRepository<Modelo01, Long>{
	
	List<Modelo01> findAll();
	
	//Modelo01 findByCodconteudoAndBloco(String codConteudo, String bloco);
	
	List<Modelo01> findByCodconteudoAndBloco(String codConteudo, String bloco);
	
	Modelo01 findByCodconteudo(String codConteudo);
	

}