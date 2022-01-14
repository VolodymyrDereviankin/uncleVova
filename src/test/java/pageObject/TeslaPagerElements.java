package pageObject;

import holders.DriverHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TeslaPagerElements extends DriverHolder {
    public TeslaPagerElements(WebDriver driver) {
        super(driver);
    }

    public WebElement getModelX() {
        return driver.findElements(By.xpath("//*[@class='tds-site-nav-item-text']")).get(2);
    }

    public WebElement getOrderNow() {
        return driver.findElements(By.xpath("//*[contains(text(),'Order Now')]")).get(0);
    }
}
