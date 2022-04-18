package com.apitest.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.apitest.models.UsuarioModel;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel,Long> {
	
	//public abstract ArrayList<UsuarioModel> findByByPrioridad(Integer Prioridad);
	
	//@Query("SELECT * FROM springboot.usuarios where prioridad = ?1")
	//public abstract ArrayList<UsuarioModel> findByByPrioridad(Integer Prioridad);

}
