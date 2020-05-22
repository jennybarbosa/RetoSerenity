package com.newtours.usuario.testing.models;

public class Usuario {

	String userName;
	String password;
	
	//Constructor
	public Usuario(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	
	//Metodos
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
	
}
