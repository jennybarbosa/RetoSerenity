package com.newtours.usuario.testing.steps;

import com.newtours.usuario.testing.pageobjects.RegistroUsuarioPageObject;

import net.thucydides.core.annotations.Step;

public class RegistroUsuarioSteps {

	RegistroUsuarioPageObject registroPOM = new RegistroUsuarioPageObject();
	
	//Metodos
	
	@Step
	public void abrirApp() {
		registroPOM.open();
	}
	
	@Step
	public void irARegistro() {
		registroPOM.irARegistro();
	}
	
	@Step
	public void escribirPrimerNombre(String firstName) {
		registroPOM.escribirPrimerNombre(firstName);
	}
	
	@Step 
	public void escribirApellido(String lastName) {
		registroPOM.escribirApellido(lastName);
	}
	
	@Step
	public void escribirTelefono(String phone) {
		registroPOM.escribirTelefono(phone);
	}
	
	@Step
	public void escribirEmail(String mail) {
		registroPOM.escribirEmail(mail);
	}
	
	@Step
	public void escribirDireccion(String address) {
		registroPOM.escribirDireccion(address);
	}
	
	@Step 
	public void escribirCiudad(String city) {
		registroPOM.escribirCiudad(city);
	}
	
	@Step
	public void escribirEstado(String state) {
		registroPOM.escribirEstado(state);
	}
	
	@Step
	public void escribirCodigoPostal(String postalCode) {
		registroPOM.escribirCodigoPostal(postalCode);
	}
	
	@Step
	public void seleccionarPais() {
		registroPOM.seleccionarPais();
	}
	
	@Step
	public void escribirUsuario(String userName) {
		registroPOM.escribirUsuario(userName);
	}
	
	@Step
	public void escribirContrasena(String password) {
		registroPOM.escribirContrasena(password);
	}
	
	@Step
	public void confirmarContrasena(String confirmPassword) {
		registroPOM.confirmarContrasena(confirmPassword);
	}
	
	@Step 
	public void clickEnRegistrar() {
		registroPOM.clickEnRegistrar();
	}
	
	@Step 
	public void confirmarTexto() {
		registroPOM.confirmarTexto();
	}
}
