package com.wazuweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wazuweb.model.Usuario;
import com.wazuweb.repo.IUsuario;

@Controller
public class WazuWebController {
	
	@Autowired
	private IUsuario user;
	
	@GetMapping("/inicio")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		
		Usuario u = new Usuario();
		u.setIdUsuario(1);
		u.setNombre("Aaron");
		u.setCorreo("aaron.ubij@gmail.com");
		u.setContraseña("12345678");
		user.save(u);
		
		model.addAttribute("nombre", name);
		return "inicio";
		
	}
	@RequestMapping("/Login")
    public String getLogin() {
        return "Login";
    }
    
    @RequestMapping("/registro")
    public String getregistro() {
        return "registro";
    }

}
