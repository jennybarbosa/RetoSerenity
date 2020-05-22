package com.newtours.usuario.testing.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/com/newtours/usuario/testing/features/IniciarUsuario.feature",
glue="com.newtours.usuario.testing.stepdefinitions",
snippets=SnippetType.CAMELCASE)
public class IniciarUsuarioRunner {

}
