package com.example.login.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class PageLogin {
    WebDriver driver;
    WebElement campoEmail;
    WebElement botonLogin;
    WebElement textoValidacionExitosa ;
    WebElement campoPass;
    public PageLogin(WebDriver driver) {
        this.driver = driver;
        campoEmail = driver.findElement(By.name("email"));
        botonLogin = driver.findElement(By.xpath("//*[@class='ui fluid large teal submit button']"));
        //textoValidacionExitosa = driver.findElement(By.name("Operación Exitosa"));
        campoPass= driver.findElement(By.name("password"));
    }



    public WebElement campoEmail() {
        return campoEmail;
    }

    public WebElement botonLogin() {
        return botonLogin;

    }

    public WebElement getTextoValidacionExitosa(){
        return textoValidacionExitosa;
    }

    public WebElement getCampoPass() {
        return campoPass;
    }
}


