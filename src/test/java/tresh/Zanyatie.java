package tresh;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Zanyatie {

    @Test
    public void testSelenium() {
        WebDriverManager.chromedriver().setup();
        WebDriver chromedriver = new ChromeDriver();
        chromedriver.get("https://rozetka.com.ua/");
        chromedriver.findElement(By.xpath("//input")).click();
        chromedriver.findElement(By.xpath("//input")).sendKeys("телефон");
        chromedriver.findElement(By.xpath("//input")).clear();
        chromedriver.findElement(By.xpath("//button[@class='button button_color_green button_size_medium search-form__submit ng-star-inserted']")).click();
        String url = chromedriver.getCurrentUrl();
        chromedriver.quit();

        Assert.assertEquals(url,"https://rozetka.com.ua/search/?text=%D1%82%D0%B5%D0%BB%D0%B5%D1%84%D0%BE%D0%BD");

    }

}

