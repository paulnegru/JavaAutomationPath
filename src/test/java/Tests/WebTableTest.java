package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class WebTableTest {

    public WebDriver driver;

    @Test
    public void automationMethod(){

        //deschidem un browser de Chrome
        driver = new ChromeDriver();

        //accesam o pagina web
        driver.get("https://demoqa.com/");

        //facem browserul in modul maximize
        driver.manage().window().maximize();

        //Am adaugat un scroll pentru a evita eroare de ElementClickIntercepted din cauza ca aveam o reclama care aparea peste butonul nostru
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollBy(0,400)");

        //xpathul e de doua feluri: Absolut si Relativ
        //Xpath Absolut: incepe de la prima linie pana la linia la care avem nevoie sa ajungem. incepe cu / (Nu ne intereseaza!)
        //Xpath Relativ: Cel mai important! Se focuseaza doar pe ce ne intereseaza incepe cu //
        //Declarare de elemente:
        WebElement ElementsField = driver.findElement(By.xpath("//h5[.='Elements']"));
        ElementsField.click();
        WebElement WebTableField = driver.findElement(By.xpath("//span[.='Web Tables']"));
        WebTableField.click();
        WebElement AddButton = driver.findElement(By.id("addNewRecordButton"));
        AddButton.click();

        //Regisrtation form
        WebElement FirstNameField = driver.findElement(By.id("firstName"));
        String firstNameValue = "John";
        WebElement LastNameField = driver.findElement(By.id("lastName"));
        String lastNameValue = "Wick";
        WebElement EmailField = driver.findElement(By.id("userEmail"));
        String emailValue = "johnwick90@email.com";
        WebElement AgeField = driver.findElement(By.id("age"));
        String ageValue = "29";
        WebElement SalaryField = driver.findElement(By.id("salary"));
        String salaryValue = "8500";
        WebElement DepartamentField = driver.findElement(By.id("department"));
        String departamentValue = "AutomationQA";
        WebElement SubmitField = driver.findElement(By.id("submit"));

        FirstNameField.sendKeys(firstNameValue);
        LastNameField.sendKeys(lastNameValue);
        EmailField.sendKeys(emailValue);
        AgeField.sendKeys(ageValue);
        SalaryField.sendKeys(salaryValue);
        DepartamentField.sendKeys(departamentValue);
        SubmitField.click();


    }


}
