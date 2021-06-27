package com.tecnologia.conecteEducacao.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tecnologia.conecteEducacao.entities.Conteudo;

@Repository
public interface ConteudoRepository extends JpaRepository<Conteudo, Long>{
	
	
	List<Conteudo> findAll();
	
	Conteudo findByCodconteudo(String codconteudo);
	
	List<Conteudo> findByCodconteudoContaining(String codconteudo);
	
	Conteudo findByCodnivelAndCodconteudo(Integer codnivel, String codconteudo);
	
	List<Conteudo> findByCodnivelAndCodconteudoContainingOrderByIndice(Integer codnivel, String codconteudo);

}