package pageObject;

import org.openqa.selenium.WebDriver;

public class TeslaPagerHelper extends TeslaPagerElements {
    public TeslaPagerHelper(WebDriver driver) {
        super(driver);
    }

    public void openTesla() {
        driver.get("https://www.tesla.com/");
    }

    public void clickModelX() {
        getModelX().click();
    }

    public void clickOrderNow() {
        getOrderNow().click();
    }
}
