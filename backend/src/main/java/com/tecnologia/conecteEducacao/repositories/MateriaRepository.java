package com.tecnologia.conecteEducacao.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tecnologia.conecteEducacao.entities.Materia;

@Repository
public interface MateriaRepository extends JpaRepository<Materia, Long>{
	
	List<Materia> findAll();
	
	List<Materia> findByCodnivelOrderByMateriaAsc(Long codnivel);

}