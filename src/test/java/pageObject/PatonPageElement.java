package pageObject;

import holders.DriverHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PatonPageElement extends DriverHolder {
    public PatonPageElement(WebDriver driver){
        super(driver);
    }

    public WebElement getSearchField(){
    return driver.findElement(By.xpath("//input[@type='text']"));
    }

    public WebElement getStandardTIG200(){
        return driver.findElements(By.xpath("//*[contains(@class, 'category-products__card')]")).get(1);
    }

    public WebElement getUserManualStandardTIG200(){
        return driver.findElements(By.xpath("//*[contains(text(),'Руковолство пользователя StandardTIG-160, StandardTIG-200')]")).get(0);
    }


}