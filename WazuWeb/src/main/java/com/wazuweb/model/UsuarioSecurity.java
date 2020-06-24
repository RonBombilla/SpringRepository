package com.wazuweb.model;

import javax.persistence.*;

//@Table(name = "USUARIO_SECURITY")
@Entity
public class UsuarioSecurity {
	 
	 //@GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Id
	 private int id;
	 
	 private String nombre;
	 
	 private String clave;
	 /*
	 @Transient
	 private String claveConfirm;
	 
	 @ManyToMany
	 private String roles;
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	/*
	public String getClaveConfirm() {
		return claveConfirm;
	}
	public void setClaveConfirm(String claveConfirm) {
		this.claveConfirm = claveConfirm;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}*/
}
