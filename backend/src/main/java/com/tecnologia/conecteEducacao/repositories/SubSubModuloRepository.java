package com.tecnologia.conecteEducacao.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tecnologia.conecteEducacao.entities.SubSubModulo;

@Repository
public interface SubSubModuloRepository extends JpaRepository<SubSubModulo, Integer>{
	
	
	List<SubSubModulo> findByCodsubsubmoduloOrderByIndica(String subsubcodmodulo);
	List<SubSubModulo> findByCodnivelOrderByIndica(Integer codnivel);
	List<SubSubModulo> findAll();
	List<SubSubModulo> findByCodsubsubmoduloAndCodnivelOrderByIndica(String codsubsubmodulo, Integer codnivel);
	List<SubSubModulo> findByCodsubsubmoduloContainingOrderByIndica(String codsubsubmodulo);
	List<SubSubModulo> findByCodnivelAndCodsubsubmoduloContainingOrderByIndica(Integer codnivel, String codsubsubmodulo);
	
}