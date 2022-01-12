package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ViyarPageHelper extends ViyarPageElements {
    public ViyarPageHelper(WebDriver driver) {
        super(driver);
    }

    public void openViyar() {
        driver.get("https://viyar.ua/");
    }

    public void clickInput() {
        getInput().click();

    }

    public void fillUserLogin() {
        getUserLogin().sendKeys("huster.net@gmail.com");
    }

    public void fillUserPassword() {
        getUserPassword().sendKeys("418444");
    }

    public void clickEnter() {
        getEnter().click();
        refreshPage();
    }

    public void clickConstructor() {
        waitForElementToBeClickable(driver.findElements(By.xpath("//button[@class='button-vp']")).get(1));

        getConstructor().click();
    }

    public void clickDsp() {
        getDsp().click();
    }

    public void clickMaterial() {
        getMaterial().click();
    }

    public boolean isTitleContains(String title) {
        return driver.getTitle().contains(title);
    }

    public boolean isTextDisplayed() {
        return getViyarText().isDisplayed();

    }

    public void clickFurnitura(){
        getFurnitura().click();
    }

    public void clickNapravlyayuchie(){
        getNapravlyayuchie().click();
    }

    public void clickNapravlyayuchieP2O_350(){
        getNapravlyayuchieP2O_350().click();
    }

    public boolean isTextDisplayedNapravlyayuchie() {
        return getViyarTextNapravlyayuchie().isDisplayed();
}}



