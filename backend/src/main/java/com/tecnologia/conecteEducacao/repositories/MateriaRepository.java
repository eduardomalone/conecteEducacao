package com.tecnologia.conecteEducacao.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tecnologia.conecteEducacao.entities.Disciplina;
import com.tecnologia.conecteEducacao.entities.Materia;


public interface MateriaRepository extends JpaRepository<Materia, Long>{
	
	List<Materia> findAllByOrderByMateriaAsc();

}