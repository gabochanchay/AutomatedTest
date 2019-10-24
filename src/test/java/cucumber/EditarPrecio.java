package cucumber;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EditarPrecio {

    private static WebDriver driver;

    private final String URL = "http://186.4.252.247:8888/FacturaWeb/pages/index.jsf";
//    private final String URL = "http://localhost:8080/FacturaWeb/pages/index.jsf";

    @Before
    public void setUp()  {
        Logger.getLogger("").setLevel(Level.OFF);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);


//                System.setProperty("webdriver.chrome.driver",
//                "drivers//chromedriver-2");
//        driver = new ChromeDriver();

    }


    @Then("^Selecciono el menu de convenios$")
    public void seleccionoElMenuDeConvenios() {
        driver.get(URL);
//        driver.get("http://localhost:8080/FacturaWeb/pages/index.jsf");
        driver.findElement(By.id("j_username")).clear();
        driver.findElement(By.id("j_username")).sendKeys("marcia.almagro@saviasoft.com");
        driver.findElement(By.id("j_password")).clear();
        driver.findElement(By.id("j_password")).sendKeys("12345678");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='¿Olvidaste tu contraseña?'])[1]/preceding::button[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='SAVIASOFT'])[1]/preceding::i[2]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Venta'])[2]/preceding::a[2]")).click();

    }

    @Then("^Selecciono el conveio que voy a editar$")
    public void seleccionoElConveioQueVoyAEditar() {
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Efectivo'])[1]/following::i[4]")).click();

    }

    @Then("^Selecciono el plan de precios qeu voy a editar$")
    public void seleccionoElPlanDePreciosQeuVoyAEditar() {

        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Plan 10 facturas'])[1]/following::i[4]")).click();


    }

    @Then("^Selecciono y edito el precio que deseo\\.$")
    public void seleccionoYEditoElPrecioQueDeseo() {

        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='CAJA GENERAL'])[2]/following::i[2]")).click();
        driver.findElement(By.name("j_idt98:j_idt113:4:j_idt123")).click();
        driver.findElement(By.name("j_idt98:j_idt113:4:j_idt123")).clear();
        driver.findElement(By.name("j_idt98:j_idt113:4:j_idt123")).sendKeys("121");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='CAJA GENERAL'])[2]/following::i[4]")).click();

    }
}
