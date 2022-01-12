package pageObject;

import org.openqa.selenium.WebDriver;

public class IronMaidenPageHelper extends IronMaidenPageElements {
    public IronMaidenPageHelper(WebDriver driver) {
        super(driver);
    }

    public void openIronMaiden() {
        driver.get("https://www.ironmaiden.com");

    }

    public void clickStudioAlbums() {
        getStudioAlbums().click();
    }

    public void clickKillers() {
        getKillers().click();
    }

    public void clickTheNumberOfTheBest() {
        getTheNumberOfTheBest().click();
    }

    public void getClip() {
        driver.get("https://www.youtube.com/watch?v=5eVZ9OnKR4c&ab_channel=CmteDuarte");
    }
}
