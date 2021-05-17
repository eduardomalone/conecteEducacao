package com.tecnologia.conecteEducacao.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tecnologia.conecteEducacao.entities.Disciplina;


public interface DisciplinaRepository extends JpaRepository<Disciplina, Long>{
	
	List<Disciplina> findAllByOrderByNameAsc();

}