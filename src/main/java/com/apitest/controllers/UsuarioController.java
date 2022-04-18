package com.apitest.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.apitest.services.UsuarioService;
import com.apitest.models.UsuarioModel;


@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;
	
	@GetMapping()
	public ArrayList<UsuarioModel> getUsers(){
		return usuarioService.getUsers();			
	}
	
	@PostMapping()
	public UsuarioModel saveUser(@RequestBody UsuarioModel usuario){
		return usuarioService.saveUser(usuario);			
	}
	
	@GetMapping(path = "/{id}")
	public Optional<UsuarioModel> getUserById(@PathVariable("id") Long Id){
		return usuarioService.getById(Id);			
	}
	
	@GetMapping(path = "/query")
	public ArrayList<UsuarioModel> getUsersByPriority(@RequestParam("prioridad") Integer prioridad){
		return usuarioService.getByPriority(prioridad);			
	}
	
	@DeleteMapping(path = "/{id}")
	public String deleteUserById(@PathVariable("id") Long Id){
		boolean ok = usuarioService.deleteUser(Id);
		if (ok) {
			return "Se elimino el usuario: "+Id;
		}else {
			return "Error al eliminar el usuario: "+Id;
		}
			
	}
	
}
