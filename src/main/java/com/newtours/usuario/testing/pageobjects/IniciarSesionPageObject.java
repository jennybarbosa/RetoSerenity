package com.newtours.usuario.testing.pageobjects;

import static org.junit.Assert.assertThat;

import org.hamcrest.Matchers;
import org.jruby.ir.instructions.defined.GetDefinedConstantOrMethodInstr;
import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://newtours.demoaut.com/mercurywelcome.php")
public class IniciarSesionPageObject extends PageObject {
	By txtUserName = By.name("userName");
	By txtPassword = By.name("password");
	By btnLogin = By.name("login");
	By successfulConfirm = By.xpath("//a[@href='mercurysignoff.php']");
	By failedConfirm = By.xpath("//a[@href='mercurysignon.php']");
	
	public void escribirUsuario(String userName) {
		getDriver().findElement(txtUserName).sendKeys(userName);
	}
	public void escribirContrasena(String password) {
		getDriver().findElement(txtPassword).sendKeys(password);
	}
	
	public void clickLogin() {
		getDriver().findElement(btnLogin).click();;
	}
	
	
	public void sucessfulConfirm() {
	
		assertThat(getDriver().findElement(successfulConfirm).isDisplayed(), Matchers.is(true));
		
		}
	
	public void failedConfirm() {
		assertThat(getDriver().findElement(failedConfirm).isDisplayed(), Matchers.is(true));
	}
}
