package pageObject;

import holders.DriverHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PhilipsPageElements extends DriverHolder {
    public PhilipsPageElements(WebDriver driver){
        super(driver);
    }

    public WebElement getCatalog(){
        return driver.findElements(By.xpath("//span[@class='p-n02v3__m1item pv-heading pv-body--s pv-bold']")).get(0);
    }

    public WebElement getAudioForHome(){
        return  driver.findElement(By.xpath("//*[text()='Домашні аудіопристрої']"));
    }


    public WebElement getM8905(){
        return driver.findElement(By.xpath("//*[text()='Насиченіше звучання усіх ваших мелодій']"));
    }

    public WebElement getSoundAndImage(){
        return driver.findElement(By.xpath("//*[text()='Звук та зображення']"));
    }




    }




