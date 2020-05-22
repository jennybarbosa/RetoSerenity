package com.newtours.usuario.testing.pageobjects;

import static org.junit.Assert.assertThat;

import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://newtours.demoaut.com/mercurywelcome.php")
public class RegistroUsuarioPageObject extends PageObject{
	//Localizadores
	By registryLink = By.xpath("//a[text()='REGISTER']");
	By txtFirstName = By.name("firstName");
	By txtlastTName = By.name("lastName");
	By txtPhone = By.name("phone");
	By txtMail = By.name("userName");
	By txtAddress = By.name("address1");
	By txtCity = By.name("city");
	By txtState = By.name("state");
	By txtpostalCode = By.name("postalCode");
	By listCountry = By.name("country");
	By txtUserName = By.name("email");
	By txtPassword = By.name("password");
	By txtConfirmPassword = By.name("confirmPassword");
	By btnSubmit = By.name("register");
	By txtConfirmText = By.xpath("//*[contains(text(),\" Thank you for registering\")]");
	
	//Metodos
	public void irARegistro(){
		getDriver().findElement(registryLink).click();
	}
	public void escribirPrimerNombre(String firstName) {
		getDriver().findElement(txtFirstName).sendKeys(firstName);
	}
	public void escribirApellido(String lastName) {
		getDriver().findElement(txtlastTName).sendKeys(lastName);
	}
	public void escribirTelefono(String phone) {
		getDriver().findElement(txtPhone).sendKeys(phone);
	}
	public void escribirEmail(String mail) {
		getDriver().findElement(txtMail).sendKeys(mail);
	}
	public void escribirDireccion(String address) {
		getDriver().findElement(txtAddress).sendKeys(address);
	}
	public void escribirCiudad(String city) {
		getDriver().findElement(txtCity).sendKeys(city);
	}
	public void escribirEstado(String state) {
		getDriver().findElement(txtState).sendKeys(state);
	}
	public void escribirCodigoPostal(String postalCode) {
		getDriver().findElement(txtpostalCode).sendKeys(postalCode);
	}
	public void seleccionarPais() {
		Select country = new Select(getDriver().findElement(listCountry));
		country.selectByValue("42");
	}
	public void escribirUsuario(String userName) {
		getDriver().findElement(txtUserName).sendKeys(userName);
	}
	public void escribirContrasena(String password) {
		getDriver().findElement(txtPassword).sendKeys(password);
	}
	public void confirmarContrasena(String confirmPassword) {
		getDriver().findElement(txtConfirmPassword).sendKeys(confirmPassword);
	}
	public void clickEnRegistrar() {
		getDriver().findElement(btnSubmit).click();
	}
	public void confirmarTexto() {
		assertThat(getDriver().findElement(txtConfirmText).isDisplayed(), Matchers.is(true));
	}
}
