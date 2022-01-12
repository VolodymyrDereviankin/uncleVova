package PlaiWithConstructor;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestPageObjectBasics {
    WebDriver driver;

    @BeforeMethod
    public void before() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
    }

    @Test
    public void checkLoginURL() {

        fullSkrin();
        navigateEskada();
        vizovProduct();
        Assert.assertEquals(getURL(), "https://eskada-m.com/download/produkti.html");

        vizovInstrukcii();
        Assert.assertEquals(getURL(), "https://eskada-m.com/download/korisna-informaciya.html");
        System.out.println(getTittle());
        Assert.assertEquals(getTittle(), "Eskada-M - Виробник шпонованих плит №1");


    }

    private String getTittle(){
        return driver.getTitle();

    }

    private  String getURL(){
       return driver.getCurrentUrl();
    }

    private void fullSkrin() {
        driver.manage().window().maximize();
    }

    private void navigateEskada() {
        driver.get("https://eskada-m.com");
    }

    private void vizovInstrukcii() {
        driver.findElement(By.xpath("//a[@href='https://eskada-m.com/download/korisna-informaciya.html']")).click();
    }

    private void vizovProduct() {
        driver.findElements(By.xpath("//a[@href='https://eskada-m.com/download/produkti.html']")).get(0).click();
    }

    @AfterMethod
    public void after() {
        //driver.quit();
    }
}
