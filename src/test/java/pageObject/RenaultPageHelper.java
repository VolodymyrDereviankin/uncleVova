package pageObject;

import org.openqa.selenium.WebDriver;

public class RenaultPageHelper extends RenaultPageElements {
    public RenaultPageHelper(WebDriver driver) {
        super(driver);
    }

    public void openRenault() {
        driver.get("https://www.renault.com.ua/");
    }

    public void clickOnModels() {
        getModelsTab().click();
    }

    public void clickPassengerCar() {
        getPassengerCar().click();
    }

    public void clickMegane() {
        getMegane().click();
    }

    public void clickCommercialVehicles() {
        getCommercialVehicles().click();
    }

    public void clickMaster() {
        getMaster().click();
    }

    public void clickPriceMaster() {
        getPriceMaster().click();
    }

    public boolean isTitleContains(String title) {
        return driver.getTitle().contains(title);
    }

    public boolean isTextDisplayed() {
        return getMeganeText().isDisplayed();
    }


}
