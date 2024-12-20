package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;

public class PracticeFormTest {

    public WebDriver driver;

    @Test
    public void automationMethod(){
        //deschidem un browser de Chrome
        driver = new ChromeDriver();

        //accesam o pagina web
        driver.get("https://demoqa.com/");

        //facem browserul in modul maximize
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");

        WebElement FormsField = driver.findElement(By.xpath("//h5[.='Forms']"));
        FormsField.click();
        WebElement RegistrationFormField = driver.findElement(By.xpath("//span[.='Practice Form']"));
        RegistrationFormField.click();

        //Student Registration Form
        WebElement FirstNameField = driver.findElement(By.id("firstName"));
        String firstNameValue = "John";
        WebElement LastNameField = driver.findElement(By.id("lastName"));
        String lastNameValue = "Wick";
        WebElement EmailField = driver.findElement(By.id("userEmail"));
        String emailValue = "johnwick90@email.com";
        WebElement MobileNumberField = driver.findElement(By.cssSelector("input[placeholder='Mobile Number']"));
        String mobileNumberValue = "0759631256";
        WebElement UploadPictureField = driver.findElement(By.id("uploadPicture"));
        File pictureFile = new File("src/test/resources/testpicture.avif");



        FirstNameField.sendKeys(firstNameValue);
        LastNameField.sendKeys(lastNameValue);
        EmailField.sendKeys(emailValue);
        MobileNumberField.sendKeys(mobileNumberValue);
        UploadPictureField.sendKeys(pictureFile.getAbsolutePath());

    }
}
