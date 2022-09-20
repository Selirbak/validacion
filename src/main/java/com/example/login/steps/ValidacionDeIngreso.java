package com.example.login.steps;

import business.BusinessController;
import com.example.login.page.PageLogin;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class ValidacionDeIngreso {
    WebDriver d;
    BusinessController businessController = new BusinessController();


    @Before
    public void ini() {

    }

    @After
    public void finalizar() {
        //d.quit();
    }

    @Given("Un usuario activo que cuenta con un correo electronico valido")
    public void unUsuarioActivoQueCuentaConUnCorreoElectronicoValido() {
        d = businessController.abrirapp();
        businessController=new BusinessController(d);
    }

    @When("ingresa el correo electronico y  contraseña validos en los campos correspondientes")
    public void ingresaElCorreoElectronicoYContraseñaValidosEnLosCamposCorrespondientes() {
        businessController.llenarCajaCorreo("VALIDO");
        businessController.llenarCajaPass("VALIDO");
        businessController.clickBotonLogin();
    }

    @Then("el sistema me da ingreso a la aplicación mostrando aviso en color verde de operacion exitosa")
    public void elSistemaMeDaIngresoALaAplicaciónMostrandoAvisoEnColorVerdeDeOperacionExitosa() {
        businessController.validacionEntradaCorrecta();
    }

    @Given("Un usuario activo que desea ingresar a la app")
    public void unUsuarioActivoQueDeseaIngresarALaApp() {
        d = businessController.abrirapp();
    }


    @Then("el sistema no me da ingreso a la aplicación")
    public void elSistemaNoMeDaIngresoALaAplicación() {
        if (identificadorArgumento0.equals("VALIDO") & identificadorArg1.equals("INVALIDO")) {
            businessController.validacionIcorrectaPass();
        }
        if (identificadorArgumento0.equals("INVALIDO") & identificadorArg1.equals("VALIDO")) {
            businessController.validacionIcorrectaLogin();
        }
        if (identificadorArgumento0.equals("INVALIDO") & identificadorArg1.equals("INVALIDO")) {
            businessController.validacionIcorrectaPass();
            businessController.validacionIcorrectaLogin();
        }
    }

    String identificadorArgumento0 ;
    String identificadorArg1;

    @When("ingresa el correo electronico {string} y el password es {string} en el campo correspondiente")
    public void ingresaElCorreoElectronicoYElPasswordEsEnElCampoCorrespondiente(String arg0, String arg1) {
        this.identificadorArgumento0=arg0;
        this.identificadorArg1=arg1;

        businessController.llenarCajaCorreo(arg0);

        businessController.llenarCajaPass(arg1);

        businessController.clickBotonLogin();



    }
}