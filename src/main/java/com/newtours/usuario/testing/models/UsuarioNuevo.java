package com.newtours.usuario.testing.models;

public class UsuarioNuevo {
	String firstName;
	String lastName;
	String phone;
	String mail;
	String address;
	String city;
	String state;
	String postalCode;
	String userName;
	String password;
	String passwordConfirm;
	
	//Metodo constructor
	
	public UsuarioNuevo(String firstName, String lastName, String phone, String mail, String address, String city,
			String state, String postalCode, String userName, String password, String passwordConfirm) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.mail = mail;
		this.address = address;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.userName = userName;
		this.password = password;
		this.passwordConfirm = passwordConfirm;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPhone() {
		return phone;
	}

	public String getMail() {
		return mail;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public String getPasswordConfirm() {
		return passwordConfirm;
	}
	
		
	
}
