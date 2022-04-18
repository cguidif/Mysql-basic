package com.apitest.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apitest.repositories.UsuarioRepository;
import com.apitest.models.UsuarioModel;


@Service
public class UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	public ArrayList<UsuarioModel> getUsers(){		
		return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
	}
	
	public UsuarioModel saveUser(UsuarioModel user){		
		return usuarioRepository.save(user);
	}
	
	public Optional<UsuarioModel> getById(Long id){		
		return usuarioRepository.findById(id);
	}
	
	public ArrayList<UsuarioModel> getByPriority(Integer prioridad){		
		//return (ArrayList<UsuarioModel>) usuarioRepository.findByByPrioridad(prioridad);
		return null;
	}
	
	public boolean deleteUser(Long id) {
		
		try {
			usuarioRepository.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
