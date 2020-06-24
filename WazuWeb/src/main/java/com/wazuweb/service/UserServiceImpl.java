package com.wazuweb.service;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.wazuweb.model.UsuarioSecurity;
import com.wazuweb.repo.IUsuarioLog;

public class UserServiceImpl implements UserService {
	
	@Autowired
	private IUsuarioLog log;
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public UsuarioSecurity save(UsuarioSecurity usuarioSecurity) {
		usuarioSecurity.setClave(bCryptPasswordEncoder.encode(usuarioSecurity.getClave()));
		//usuarioSecurity.setRoles(usuarioSecurity.getRoles());
		return log.save(usuarioSecurity);
	}

	@Override
	public UsuarioSecurity findByNombre(String nombre) {
		// TODO Auto-generated method stub
		return log.findByNombre(nombre);
	}

}
