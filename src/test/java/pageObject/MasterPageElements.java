package pageObject;

import holders.DriverHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MasterPageElements extends DriverHolder {
    public MasterPageElements(WebDriver driver){
        super(driver);
    }

    public WebElement getCatalog(){
        return driver.findElements(By.xpath("//a[text()='КАТАЛОГ']")).get(0);

    }

    public WebElement getSets(){
        return driver.findElement(By.xpath("//a[text()='Наборы инструментов']"));
    }

    public WebElement getSetsStartPlus(){
        return driver.findElements(By.xpath("//a[text()='Набор «Старт плюс»']")).get(0);
    }
}
