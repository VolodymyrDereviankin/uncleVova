package pageObject;

import org.openqa.selenium.WebDriver;

public class RozetkaPageHelper extends RozetkaPageElements{
    public RozetkaPageHelper(WebDriver driver){
        super(driver);
    }

    public void getRozetka(){
        driver.get("https://rozetka.com.ua/");
    }
}
