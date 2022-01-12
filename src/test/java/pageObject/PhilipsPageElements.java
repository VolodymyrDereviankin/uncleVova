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
        return driver.findElements(By.xpath("//span[@class='p-n02v3__m1item p-body-copy-01 p-heading-light']")).get(0);
    }

    public WebElement getAudioForHome(){
        return  driver.findElements(By.xpath("//span[@class='p-body-copy-01 p-heading-light p-n02v3__m2text']")).get(1);
    }


    public WebElement getM8905(){
        return driver.findElement(By.xpath("//*[text()='Насиченіше звучання усіх ваших мелодій']"));
    }




    }




