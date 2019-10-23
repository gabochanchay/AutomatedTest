package cucumber;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.Assert.*;


public class ContactManagerStepDefs {

    private static WebDriver driver;

//    private final String URL = "http://localhost:4200/";
    private final String URL = "http://35.246.35.236";
    private String contactName = "";
    private ArrayList<String> contactFirstPage= null;
    private ArrayList<String> contactSecondPage= null;
    private ArrayList<String> contactDuplicatedFirstPage= null;
    private ArrayList<String> contactDuplicatedSecondPage= null;

    @Before
    public void setUp()  {
        Logger.getLogger("").setLevel(Level.OFF);
//        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
    }

    @After
    public void tearDown() {
        driver.close();
    }


    @Given("^I access the landing page of COS$")
    public void iAccessTheLandingPageOfCOS() {
        driver.get(URL);
    }


    @Then("^the title of the window should be \"([^\"]*)\"$")
    public void theTitleOfTheWindowShouldBe(String title) {
        assertEquals(title, driver.getTitle());
    }

    @And("^The tab \"([^\"]*)\" should be selected$")
    public void theTabShouldBeSelected(String tabTitle)  {
        WebElement tab = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Duplicate Free'])[1]/preceding::div[2]"));
        assertEquals(tabTitle, tab.getText());
    }

    @Given("^The \"([^\"]*)\" tab is selected$")
    public void theTabIsSelected(String tabTitle) {
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement tab = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Duplicate Free'])[1]/preceding::div[2]"));
        assertEquals(tabTitle, tab.getText());
    }

    @Then("^I can see the text \"([^\"]*)\"$")
    public void iCanSeeTheText(String text)  {
        WebElement titleElement = driver.findElement(By.id("contactsTitle"));
        assertEquals(text, titleElement.getText());
    }

    @And("^The contacts data sources should be displayed$")
    public void theContactsDataSourcesShouldBeDisplayed() {
        WebElement contactSourcesElement = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Contacts'])[2]/following::div[3]"));
        assertTrue(contactSourcesElement.getText().contains("Contact Sources"));
    }

    @And("^I can see a table$")
    public void iCanSeeATable() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.tagName("table"));
    }

    @And("^The table has columns \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
    public void theTableHasColumnsAnd(String name, String phone, String email, String source, String photo, String address) {
        WebElement table = driver.findElement(By.tagName("table"));
        List<WebElement> tableHeaders = table.findElements(By.tagName("th"));
        assertEquals(6, tableHeaders.size());

        assertEquals(tableHeaders.get(0).getText(), name);
        assertEquals(tableHeaders.get(1).getText(), phone);
        assertEquals(tableHeaders.get(2).getText(), email);
        assertEquals(tableHeaders.get(3).getText(), source);
        assertEquals(tableHeaders.get(4).getText(), photo);
        assertEquals(tableHeaders.get(5).getText(), address);
    }

    @And("^I can see the contacts displayed in the table$")
    public void iCanSeeTheContactsDisplayedInTheTable() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement table = driver.findElement(By.tagName("table"));
        List<WebElement> tableRows = table.findElements(By.tagName("tr"));
        assertEquals(6, tableRows.size());
    }

    @And("^I can see the page options$")
    public void iCanSeeThePageOptions() {
        driver.findElement(By.xpath("//mat-tab-body[@id='mat-tab-content-0-0']/div/app-contacts/mat-paginator/div/div"));
    }

    @And("^The selected size of the page is (\\d+)$")
    public void theSelectedSizeOfThePageIs(int size5) {
        WebElement selectPageSizeElement = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Items per page:'])[1]/following::div[5]"));
        assertEquals(size5, Integer.parseInt(selectPageSizeElement.getText()));
    }


    @And("^I can change the size of the page to \"([^\"]*)\", \"([^\"]*)\", or \"([^\"]*)\"$")
    public void iCanChangeTheSizeOfThePageToOr(String size5, String size10, String size20)  {
        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Items per page:'])[1]/following::div[6]")));

        element.click();

        assertEquals(size5, driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Last page'])[1]/following::span[1]")).getText());
        assertEquals(size10, driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Last page'])[1]/following::span[2]")).getText());
        assertEquals(size20, driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Last page'])[1]/following::span[3]")).getText());

        assertEquals(0, driver.findElements(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Last page'])[1]/following::span[4]")).size());
    }

    @Given("^I selected the tab of duplicated free$")
    public void iAmSeeingTheContacts() {
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

//        driver.findElement(By.tagName("table"));
    }

    @And("^I have some contacts in the first page$")
    public void iHaveSomeContactsInTheFirstPage() {
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Contacts'])[1]/following::div[2]")).click();
        WebElement table = driver.findElement(By.xpath("//*[@id=\"mat-tab-content-0-1\"]/div/app-duplicate-free/div/table"));
        List<WebElement> contents = null;
        contactFirstPage = new ArrayList<String>();
        try{
            contents = table.findElements(By.tagName("td"));
//            System.out.println("**************************"+contents.size());
            int i=0;
            int j=0;
            for(WebElement we : contents){
                i++;
                j++;
                if((j%3)==0){
                    i=0;
                }
                if(i==1) {
//                    System.out.println("****************************"+we.getText());
                    contactFirstPage.add(we.getText());
//                assertEquals(we.getText(),);
                }
            }
        }
        catch(org.openqa.selenium.StaleElementReferenceException ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    @And("^I click to go to the next page$")
    public void iClickToGoToTheNextPage() {
        driver.findElement(By.xpath("//*[@id=\"mat-tab-content-0-1\"]/div/app-duplicate-free/mat-paginator/div/div/div[2]/button[3]")).click();
    }

    @And("^I see different contacts$")
    public void iSeeDifferentContacts() {
        WebElement table = driver.findElement(By.xpath("//*[@id=\"mat-tab-content-0-1\"]/div/app-duplicate-free/div/table"));
//        List<WebElement> tableHeaders = table.findElements(By.tagName("th"));
        List<WebElement> contents = null;
        contactSecondPage = new ArrayList<String>();
        try{
            contents = table.findElements(By.tagName("td"));
//            System.out.println("**************************"+contents.size());
            int i=0;
            int j=0;
            for(WebElement we : contents){
                i++;
                j++;
                if((j%3)==0){
                    i=0;
                }
                if(i==1) {
//                    System.out.println("****************************"+we.getText());
                    contactSecondPage.add(we.getText());
//                assertEquals(we.getText(),);
                }
            }
        }
        catch(org.openqa.selenium.StaleElementReferenceException ex)
        {

        }

    }

    @Then("^I should be presented with different contacts$")
    public void iShouldBePresentedWithDifferentContacts() {
        boolean differentContacts=true;
        for (String f: contactFirstPage) {
            for (String s: contactSecondPage) {
                if(f.equals(s)){
                    differentContacts = false;
                    break;
                }
            }
        }
        assertEquals(true, differentContacts);
    }

    @Given("^The source Facebook$")
    public void the_souce_Facebook() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='All (219)'])[1]/following::div[2]")).click();
//        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Twitter (1)'])[1]/following::span[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LinkedIn (145)'])[1]/following::span[1]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.tagName("table"));
    }



    @Then("^I Shuld have just contacts with the source \"([^\"]*)\"$")
    public void i_Shuld_have_just_contacts_with_the_source(String source) throws Throwable {
//        System.out.println("comienzaaaa");

//        WebElement table = driver.findElement(By.className("table"));
        WebElement table = driver.findElement(By.tagName("table"));
        List<WebElement> tableHeaders = table.findElements(By.tagName("th"));
        List<WebElement> contents = table.findElements(By.tagName("td"));
        System.out.println("**************************"+contents.size());
        int i=0;
        int j=0;
        for(WebElement we : contents){
            i++;
            j++;
            if((j%6)==0){
                i=0;
            }
            if(i==4) {
//                System.out.println(we.getText());
                assertEquals(we.getText(),source);
            }
        }
    }


    @Given("^The number of contacts$")
    public void theNumberOfContacts() {
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//mat-select[@id='mat-select-1']/div/div")).click();
        driver.findElement(By.xpath("//mat-option[2]/span")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.tagName("table"));
    }

    @Then("^I should have the number that i select per page$")
    public void iShouldHaveTheNumberThatISelectPerPage() {
        WebElement table = driver.findElement(By.tagName("table"));
        List<WebElement> tableHeaders = table.findElements(By.tagName("th"));
        List<WebElement> contents = table.findElements(By.tagName("td"));
        System.out.println("-------"+contents.size());
        int i=0;
        int j=0;
        int contactNumber= contents.size()/6;
        assertEquals(contactNumber, 10);
    }

    @Given("^I click on the tab$")
    public void iClickOnTheTab() {
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Contacts'])[1]/following::div[2]")).click();
//        assertEquals("Estevan Rodrigues", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Actions'])[1]/following::td[1]")).getText());
//        driver.findElement(By.xpath("//*[@id=\"mat-tab-content-0-1\"]/div/app-duplicate-free/mat-paginator/div/div/div[2]/button[3]")).click();
//        assertEquals("Luis Silva", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Actions'])[1]/following::td[1]")).getText());
    }

    @Given("^I click on the view details button$")
    public void iClickOnTheViewDetailsButton() {
        contactName = "Name: "+driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Actions'])[1]/following::td[1]")).getText();
//        driver.findElement(By.xpath("//mat-tab-body[@id='mat-tab-content-0-1']/div/app-duplicate-free/div/table/tbody/tr/td[3]/button/span")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);

    }

    @Then("^I should get the information of the contact selected$")
    public void iShouldGetTheInformationOfTheContactSelected() {
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Actions'])[1]/following::button[1]")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/app-dialog/div[1]/div/div[1]/div[1]/mat-label"));

    }

    @Given("^I selected the table$")
    public void iSelectedTheTable() {
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @And("^I have some contacts in the first page of contacts duplicated$")
    public void iHaveSomeContactsInTheFirstPageOfContactsDuplicated() {
        WebElement table = driver.findElement(By.xpath("//*[@id=\"mat-tab-content-0-0\"]/div/app-contacts/div/table"));
        List<WebElement> contents = null;
        contactDuplicatedFirstPage = new ArrayList<String>();
        try{
            contents = table.findElements(By.tagName("td"));
//            System.out.println("**************************"+contents.size());
            int i=0;
            int j=0;
            for(WebElement we : contents){
                i++;
                j++;
                if((j%6)==0){
                    i=0;
                }
                if(i==1) {

                    contactDuplicatedFirstPage.add(we.getText());
                }
            }
        }
        catch(org.openqa.selenium.StaleElementReferenceException ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    @And("^I click to go to the next page of duplicated$")
    public void iClickToGoToTheNextPageOfDuplicated() {
        driver.findElement(By.xpath("//*[@id=\"mat-tab-content-0-0\"]/div/app-contacts/mat-paginator/div/div/div[2]/button[3]")).click();
        WebElement table = driver.findElement(By.xpath("//*[@id=\"mat-tab-content-0-0\"]/div/app-contacts/div/table"));
        List<WebElement> contents = null;
        contactDuplicatedSecondPage = new ArrayList<String>();
        try{
            contents = table.findElements(By.tagName("td"));
//            System.out.println("**************************"+contents.size());
            int i=0;
            int j=0;
            for(WebElement we : contents){
                i++;
                j++;
                if((j%6)==0){
                    i=0;
                }
                if(i==1) {

                    contactDuplicatedSecondPage.add(we.getText());
                }
            }
        }
        catch(org.openqa.selenium.StaleElementReferenceException ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    @Then("^I see duplicated contacts$")
    public void iSeeDuplicatedContacts() {
        boolean sameContacts=false;
        for (String f: contactDuplicatedFirstPage) {
            for (String s: contactDuplicatedSecondPage) {
                if(f.equals(s)){
                    sameContacts = true;
                    break;
                }
            }
        }
        assertEquals(true, sameContacts);
    }
}


