package com.wazuweb.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wazuweb.model.Usuario;
import com.wazuweb.repo.IUsuario;

@RestController
@RequestMapping("/usuarios")
public class RestControllerClass {
	
	@Autowired
	private IUsuario usr;
	
	@GetMapping
	public List<Usuario> listar(){
		return usr.findAll();	
		}
	
	@PostMapping
	public void insertar (@RequestBody Usuario user){
		usr.save(user);	
		}
	
	@PutMapping
	public void modificar (@RequestBody Usuario user){
		usr.save(user);	
		}
	
	@DeleteMapping (value = "/{id}")
	public void eliminar (@PathVariable ("id") Integer id){
		usr.deleteById(id);	
		}


}
