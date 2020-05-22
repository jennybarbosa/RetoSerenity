package com.newtours.usuario.testing.stepdefinitions;

import java.util.List;

import com.newtours.usuario.testing.models.Usuario;
import com.newtours.usuario.testing.steps.IniciarSesionSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class IniciarUsuarioStepDefinitions {
	
	@Steps
	IniciarSesionSteps iniciarSesionSteps;
	
	@Given("^I am in home newtours$")
	public void iAmInHomeNewtours() {
		iniciarSesionSteps.abrirApp();
	}


	@When("^I enter my credentials$")
	public void iEnterMyCredentials(List<Usuario> listaUsuario) {
		iniciarSesionSteps.escribirUsuario(listaUsuario.get(0).getUserName());
		   iniciarSesionSteps.escribirContrasena(listaUsuario.get(0).getPassword());
		   iniciarSesionSteps.clickLogin();
	}

	@Then("^I validate the \"([^\"]*)\" text$")
	public void iValidateTheText(String arg1) {
		iniciarSesionSteps.sucessfulConfirm();
	}

	@When("^I enter my wrong credentials$")
	public void iEnterMyWrongCredentials(List<Usuario> listaUsuario) {
		iniciarSesionSteps.escribirUsuario(listaUsuario.get(0).getUserName());
		   iniciarSesionSteps.escribirContrasena(listaUsuario.get(0).getPassword());
		   iniciarSesionSteps.clickLogin();
	}

	@Then("^I validate the \"([^\"]*)\" text confirm$")
	public void iValidateTheTextConfirm(String arg1) {
	  iniciarSesionSteps.failedConfirm();
	}
	
	
}
