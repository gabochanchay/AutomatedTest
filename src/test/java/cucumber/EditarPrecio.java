package cucumber;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.logging.Level;
import java.util.logging.Logger;

public class EditarPrecio {

    private static WebDriver driver;

//    private final String URL = "http://35.246.35.236";
    private final String URL = "http://localhost:8080/FacturaWeb";

    @Before
    public void setUp()  {
//        Logger.getLogger("").setLevel(Level.OFF);
//        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
//        driver = new ChromeDriver(options);
        System.setProperty("webdriver.chrome.driver",
                "drivers//chromedriver");
        driver = new ChromeDriver();

    }


    @Then("^Selecciono el menu de convenios$")
    public void seleccionoElMenuDeConvenios() {
        driver.get(URL);


        driver.findElement(By.id("j_username")).click();
        driver.findElement(By.id("contenido")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='¿Olvidaste tu contraseña?'])[1]/preceding::button[1]")).click();
        driver.get("http://localhost:8080/FacturaWeb/pages/index.jsf");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='SAVIASOFT'])[1]/preceding::button[1]")).click();
        driver.findElement(By.linkText("Administración de Convenios")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Efectivo'])[1]/following::i[4]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Plan 10 facturas'])[1]/following::i[4]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='CAJA GENERAL'])[2]/following::i[2]")).click();
        driver.findElement(By.name("j_idt98:j_idt113:4:j_idt123")).click();
        driver.findElement(By.name("j_idt98:j_idt113:4:j_idt123")).clear();
        driver.findElement(By.name("j_idt98:j_idt113:4:j_idt123")).sendKeys("121");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='CAJA GENERAL'])[2]/following::i[4]")).click();


    }

    @Then("^Selecciono el conveio que voy a editar$")
    public void seleccionoElConveioQueVoyAEditar() {

    }

    @Then("^Selecciono el plan de precios qeu voy a editar$")
    public void seleccionoElPlanDePreciosQeuVoyAEditar() {

    }

    @Then("^Selecciono y edito el precio que deseo\\.$")
    public void seleccionoYEditoElPrecioQueDeseo() {
    }
}
