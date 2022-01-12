package pageObject;

import org.openqa.selenium.WebDriver;

public class PhilipsPageHelper extends PhilipsPageElements {
    public PhilipsPageHelper(WebDriver driver) {
        super(driver);
    }

    public void openPhilips() {
        driver.get("https://www.philips.ua");
    }

    public void clickCatalog() {
        getCatalog().click();
    }

    public void clickAudioForHome() {
        getAudioForHome().click();
    }

    public void clickAudioM8905() {
        driver.get("https://www.philips.ua/c-m-so/home-audio");
    }

    public boolean isTitleContainsPhilips(String title) {
        return driver.getTitle().contains(title);
    }

    public void clickTV() {
        driver.get("https://www.philips.ua/c-m-so/tv");
    }

    public boolean isTextDisplayd(){
        return getM8905().isDisplayed();
    }
}
