package HomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DomashkaSelenium {
    ////////////////////////////////////////


    protected void waitMileSeconds(int mile) {
        try {
            Thread.sleep(mile);
        } catch (InterruptedException e) {

        }
    }
    @Test
    public void testViyar(){
        WebDriverManager.chromedriver().setup();
        WebDriver chrom = new ChromeDriver();
        chrom.manage().window().maximize();
        chrom.get("https://viyar.ua/");
        waitMileSeconds(8500);
        chrom.findElements(By.xpath("//a[text()='Войти']")).get(2).click();
        chrom.findElement(By.xpath("//input[@name='USER_LOGIN']")).sendKeys("huster.net@gmail.com");
        chrom.findElement(By.xpath("//input[@name='USER_PASSWORD']")).sendKeys("418444");
        chrom.findElements(By.xpath("//input[@type='submit']")).get(0).click();
        waitMileSeconds(8500);
        String name = chrom.findElements(By.xpath("//a[@href='/personal/']//p[contains(text(), '')]")).get(1).getText();
        Assert.assertEquals("Володимир",name);
    }


    /////////////////////////
}
