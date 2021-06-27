package com.tecnologia.conecteEducacao.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tecnologia.conecteEducacao.entities.SubModulo;

@Repository
public interface SubModuloRepository extends JpaRepository<SubModulo, Integer>{
	
	
	List<SubModulo> findByCodsubmoduloOrderByIndice(String subcodmodulo);
	List<SubModulo> findByCodnivelOrderByIndice(Integer codnivel);
	List<SubModulo> findAll();
	List<SubModulo> findByCodsubmoduloAndCodnivelOrderByIndice(String codsubmodulo, Integer codnivel);
	List<SubModulo> findByCodsubmoduloContainingOrderByIndice(String codsubmodulo);
	List<SubModulo> findByCodnivelAndCodsubmoduloContainingOrderByIndice(Integer codnivel, String codsubmodulo);
	
}