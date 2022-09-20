package com.example.login.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ValidacionDeCampos {
    @Given("Un usuario activo que posee un correo electronico que tiene diferentes tipos de caracteres")
    public void unUsuarioActivoQuePoseeUnCorreoElectronicoQueTieneDiferentesTiposDeCaracteres() {

    }

    @Given("un usuario que quiere ingresar a la app")
    public void unUsuarioQueQuiereIngresarALaApp() {

    }

    @When("ingresa el correo electronico con {string} y seleccione el boton login")
    public void ingresaElCorreoElectronicoConYSeleccioneElBotonLogin(String arg0) {
    }

    @Then("el sistema no muestra error de e-mail en pantalla")
    public void elSistemaNoMuestraErrorDeEMailEnPantalla() {
    }

    @When("ingrese una contraseña con menos de {int} caracteres y seleccione el boton login")
    public void ingreseUnaContraseñaConMenosDeCaracteresYSeleccioneElBotonLogin(int arg0) {
    }

    @Then("el sistema muestra mensaje de error por contraseña menor a {int} caracteres")
    public void elSistemaMuestraMensajeDeErrorPorContraseñaMenorACaracteres(int arg0) {
    }

    @When("ingresa la contraseña  igual o mayor a {int} caracteres y seleccione el boton login")
    public void ingresaLaContraseñaIgualOMayorACaracteresYSeleccioneElBotonLogin(int arg0) {
    }

    @Then("el sistema no muestra mensaje de error por contraseña")
    public void elSistemaNoMuestraMensajeDeErrorPorContraseña() {
    }

    @When("ingresa el correo electronico {string} y el password {string} en el campo correspondiente")
    public void ingresaElCorreoElectronicoYElPasswordEnElCampoCorrespondiente(String arg0, String arg1) {
    }

    @Then("el sistema muestra el mensaje de error de ingreso correspondiente al campo faltante")
    public void elSistemaMuestraElMensajeDeErrorDeIngresoCorrespondienteAlCampoFaltante() {
    }
}
