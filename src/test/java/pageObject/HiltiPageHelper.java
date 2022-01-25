package pageObject;

import org.openqa.selenium.WebDriver;


public class HiltiPageHelper extends HiltiPageElement{
    public HiltiPageHelper(WebDriver driver){
        super(driver);
    }

    public void getHilti(){
        driver.get("https://www.hilti.ua/ru");
        waitForPageLoad();
    }

    public void openProduct(){
        getProductsButton().click();
    }

    public void openDustRemovalAndVacuumCleaner(){
        getRemovalAndVacuumCleaner().click();
    }

    public void openVcAndAccessories(){
        getVcAndAccessories().click();
    }

    public void openVacuumCleaner(){
        getVacuumCleaner().click();
    }

    public void openVc20LX(){
        getVc20LX().click();
    }

    public void openCoshic(){
        getCoshic().click();
    }

    public void closeCookieModal(){
        getDoNotShowAgain().click();
    }

    public void closetDontShowAgain(){
        getDontShowAgain().click();
    }

    public boolean isHeadLineContains(String name){
        return getHeadLine().getText().contains(name);
    }

}
