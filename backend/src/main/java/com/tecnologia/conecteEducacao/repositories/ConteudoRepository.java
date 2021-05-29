package com.tecnologia.conecteEducacao.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tecnologia.conecteEducacao.entities.Conteudo;


public interface ConteudoRepository extends JpaRepository<Conteudo, Long>{
	
	
	List<Conteudo> findAll();
	
	Conteudo findByCodconteudo(String codconteudo);
	
	List<Conteudo> findByCodconteudoContaining(String codconteudo);

}