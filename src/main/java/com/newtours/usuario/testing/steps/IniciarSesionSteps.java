package com.newtours.usuario.testing.steps;

import com.newtours.usuario.testing.pageobjects.IniciarSesionPageObject;

import net.thucydides.core.annotations.Step;

public class IniciarSesionSteps {

	IniciarSesionPageObject usuarioPOM = new IniciarSesionPageObject();
	
	@Step
	public void abrirApp() {
		usuarioPOM.open();
	}
	
	@Step
	public void escribirUsuario(String userName) {
		usuarioPOM.escribirUsuario(userName);
	}
	
	@Step
	public void escribirContrasena(String password) {
		usuarioPOM.escribirContrasena(password);
	}
	
	@Step
	public void clickLogin() {
		usuarioPOM.clickLogin();
	}
	
	@Step
	public void sucessfulConfirm() {

		usuarioPOM.sucessfulConfirm();
	}
	
	@Step
	public void failedConfirm() {
		usuarioPOM.failedConfirm();
	}
}

	

