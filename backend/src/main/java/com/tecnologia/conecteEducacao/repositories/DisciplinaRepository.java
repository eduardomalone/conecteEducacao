package com.tecnologia.conecteEducacao.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tecnologia.conecteEducacao.entities.Disciplina;

@Repository
public interface DisciplinaRepository extends JpaRepository<Disciplina, Long>{
	
	List<Disciplina> findAll();
	

}