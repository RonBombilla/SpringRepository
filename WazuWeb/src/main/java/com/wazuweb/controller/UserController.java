package com.wazuweb.controller;

import java.io.IOException;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.wazuweb.model.UsuarioSecurity;
import com.wazuweb.service.UserService;

@Controller
@RequestMapping(value="/registro") 
public class UserController {
/*
		@Autowired
		private UserService userService;
		
		@RequestMapping(value="/registrar")
		public @ResponseBody int ajaxGet(HttpServletRequest req, HttpServletResponse res) {
			int rows = 0;
			try {
				String requestData = req.getReader().lines().collect(Collectors.joining());
				UsuarioSecurity usuario = new Gson().fromJson(requestData, UsuarioSecurity.class);
				usuario = userService.save(usuario);
				if (usuario != null) {
					rows = 1;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			return rows;
		}

	
*/
}
