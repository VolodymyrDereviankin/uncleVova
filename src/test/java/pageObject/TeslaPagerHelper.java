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

    public void clickMenu() {
        getMenu().click();
    }

    public void clickCybertrack() {
        getCybertrack().click();
    }

    public boolean isTetleContaince(String title) {
        return driver.getTitle().contains(title);
    }


    public boolean isTextDisplayedCybertrack() {
        return getTextDisplayedCybertrack().isDisplayed();
    }
}
