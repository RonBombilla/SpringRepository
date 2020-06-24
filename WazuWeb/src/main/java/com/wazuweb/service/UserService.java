package com.wazuweb.service;

import com.wazuweb.model.UsuarioSecurity;

public interface UserService {

	public UsuarioSecurity save(UsuarioSecurity usuarioSecurity);
	
	UsuarioSecurity findByNombre(String nombre);
	
}
