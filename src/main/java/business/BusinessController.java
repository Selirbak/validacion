package business;

import com.example.login.page.BasePage;
import com.example.login.page.PageLogin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BusinessController  {

    private WebDriver driver;
    PageLogin pageLogin;
    public BusinessController() {
    }

    public BusinessController(WebDriver driver) {
        this.driver = driver;
    }









    public WebDriver abrirapp() {
        String dpath = "C:\\Users\\Usuario\\Downloads\\chromedriver_win32\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", dpath);
        driver = new ChromeDriver();
        driver.get("https://semantic-ui.com/examples/login.html");
        return driver;
    }

    String validEmail = "correo@valido.com";
    String invalidEmail = "invalidocorreo";
    String passValid = "4455ggNN*";
    String invalidPass = "nnnmm";


    public void llenarCajaCorreo(String ident) {
pageLogin = new PageLogin(driver);
        String correo;
        if (ident.equals("VALIDO")) {
            correo = validEmail;}
        else {
            correo = invalidEmail;
        }
        pageLogin.campoEmail().sendKeys(correo);


    }

    public void llenarCajaPass(String ident) {
        String password;
        if (ident.equals("VALIDO")){
            password = passValid;}
        else {
            password = invalidPass;
        }
        pageLogin.getCampoPass().sendKeys(password);
    }


    public void clickBotonLogin() {
        pageLogin.botonLogin().click();
    }

    public void validacionEntradaCorrecta() {
        pageLogin.getTextoValidacionExitosa().isDisplayed();
    }

    public void validacionIcorrectaPass() {
        driver.findElement(By.xpath("//*[contains(text(),'Your password must be at least 6 characters')]"));
    }

    public void validacionIcorrectaLogin() {
        driver.findElement(By.xpath("//*[contains(text(),'Please enter a valid e-mail')]"));
    }


}


