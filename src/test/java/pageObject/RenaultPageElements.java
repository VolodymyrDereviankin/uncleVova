package pageObject;

import holders.DriverHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RenaultPageElements extends DriverHolder {
    public RenaultPageElements(WebDriver driver) {
        super(driver);
    }

    public WebElement getModelsTab(){
        return driver.findElements(By.xpath("//*[@class='nav-dropdown-toggle link-style']")).get(0);
    }


    public WebElement getPassengerCar(){
        return driver.findElements(By.xpath("//a[@href='https://www.renault.com.ua/uk/models?cslug=passenger']")).get(0);
    }

    public WebElement getMegane(){
        return driver.findElements(By.xpath("//a[@href='https://www.renault.com.ua/uk/models/megane-sedan']")).get(1);
    }

    public WebElement getCommercialVehicles(){
        return driver.findElements(By.xpath("//a[@href='https://www.renault.com.ua/uk/models?cslug=commercial']")).get(0);
    }

    public WebElement getMaster(){
        return driver.findElements(By.xpath("//a[@href='https://www.renault.com.ua/uk/models/master-f62-ph2-master']")).get(1);
    }

    public WebElement getPriceMaster(){
        return driver.findElements(By.xpath("//*[@class='label']")).get(3);
    }

    public WebElement getMeganeText(){
        return driver.findElement(By.xpath("//*[text()='Новий Renault Megane Sedan']"));
    }
}
