package com.tecnologia.conecteEducacao.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tecnologia.conecteEducacao.entities.Conteudo;


public interface ConteudoRepository extends JpaRepository<Conteudo, Long>{
	
	@Query("SELECT DISTINCT obj FROM Conteudo obj JOIN FETCH obj.disciplinas "
			+ " ORDER BY obj.titulo ASC")
	List<Conteudo> findOrdersWithConteudos();
}