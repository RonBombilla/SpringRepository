package com.wazuweb.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wazuweb.model.Usuario;

public interface IUsuario extends JpaRepository <Usuario, Integer> {

}
