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

    public WebElement getToBookmarks(){
        return driver.findElements(By.xpath("//button[@data-original-title='В закладки']")).get(0);
    }

    public WebElement getHeadLine(){
//        return driver.findElement(By.xpath("//a[text()='Сварочный аппарат PATON™ StandardTIG-200']"));
        return driver.findElement(By.xpath("//*[text()=' Вы добавили ']"));
    }


}