package pageObject;

import holders.DriverHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.nio.file.WatchEvent;

public class BlumPageElements extends DriverHolder {
    public BlumPageElements(WebDriver driver){
        super((driver));
    }

    public WebElement getCookie(){
        return driver.findElements(By.xpath("//button[text()='Принять все']")).get(1);

    }

    public WebElement getInput(){
        return driver.findElement(By.xpath("//*[text()='Войти']"));
    }

    public WebElement getUserLogin() {
        return driver.findElement(By.xpath("//input[@name='username']"));
    }

    public WebElement getUserPassword() {
        return driver.findElement(By.xpath("//input[@name='password']"));
    }

    public WebElement getEnter() {
        return driver.findElement(By.xpath("//input[@type='submit']"));
    }


}
