package com.tecnologia.conecteEducacao.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tecnologia.conecteEducacao.entities.Modulo;

@Repository
public interface ModuloRepository extends JpaRepository<Modulo, Integer>{
	
	
	List<Modulo> findByCodmoduloOrderByIndice(String codmodulo);
	List<Modulo> findByCodnivelOrderByIndice(Integer codnivel);
	List<Modulo> findAll();
	List<Modulo> findByCodmoduloAndCodnivelOrderByIndice(String codmodulo, Integer codnivel);
	List<Modulo> findByCodmoduloContainingOrderByIndice(String codmodulo);
	List<Modulo> findByCodnivelAndCodmoduloContainingOrderByIndice(Integer codnivel, String codmodulo);
	
	
}