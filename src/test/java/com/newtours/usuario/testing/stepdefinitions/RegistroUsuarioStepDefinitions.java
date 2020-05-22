package com.newtours.usuario.testing.stepdefinitions;

import java.util.List;

import com.newtours.usuario.testing.models.UsuarioNuevo;
import com.newtours.usuario.testing.steps.RegistroUsuarioSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RegistroUsuarioStepDefinitions {
	
	@Steps
	RegistroUsuarioSteps registrarStep;
	
	@Given("^I am in registry page$")
	public void iAmInRegistryPage() {
	    registrarStep.abrirApp();
	    registrarStep.irARegistro();
	}


	@When("^I insert data$")
	public void iInsertData(List<UsuarioNuevo> usuarioNuevoLista) {
	  //Metodos para insertar
		registrarStep.escribirPrimerNombre(usuarioNuevoLista.get(0).getFirstName());
		registrarStep.escribirApellido(usuarioNuevoLista.get(0).getLastName());
		registrarStep.escribirTelefono(usuarioNuevoLista.get(0).getPhone());
		registrarStep.escribirEmail(usuarioNuevoLista.get(0).getMail());
		registrarStep.escribirDireccion(usuarioNuevoLista.get(0).getAddress());
		registrarStep.escribirCiudad(usuarioNuevoLista.get(0).getCity());
		registrarStep.escribirEstado(usuarioNuevoLista.get(0).getState());
		registrarStep.escribirCodigoPostal(usuarioNuevoLista.get(0).getPostalCode());
		registrarStep.seleccionarPais();
		registrarStep.escribirUsuario(usuarioNuevoLista.get(0).getUserName());
		registrarStep.escribirContrasena(usuarioNuevoLista.get(0).getPassword());
		registrarStep.confirmarContrasena(usuarioNuevoLista.get(0).getPasswordConfirm());
		registrarStep.clickEnRegistrar();
	}

	@Then("^I validate \"([^\"]*)\" message$")
	public void iValidateMessage(String arg1) {
		registrarStep.confirmarTexto();
	}
}
