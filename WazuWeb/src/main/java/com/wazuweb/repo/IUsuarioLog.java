package com.wazuweb.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wazuweb.model.UsuarioSecurity;

public interface IUsuarioLog extends JpaRepository <UsuarioSecurity, Integer> {
	
	UsuarioSecurity findById (String nombre);

}
