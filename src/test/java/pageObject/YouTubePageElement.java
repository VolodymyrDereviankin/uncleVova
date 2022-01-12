package pageObject;

import holders.DriverHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YouTubePageElement extends DriverHolder {
    public YouTubePageElement(WebDriver driver) {
        super(driver);
    }


    public WebElement getAssa() {
        return driver.findElement(By.xpath("//a[@title='В.В.С-АССА']"));


    }
}

