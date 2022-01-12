package testNG;

import holders.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.RenaultPageHelper;


public class TestRenault extends TestInit {
    @Test
    public void checkPassengerCar() {
        RenaultPageHelper renault = new RenaultPageHelper(driver);
        renault.openRenault();
        renault.clickOnModels();
        renault.clickPassengerCar();
        renault.clickMegane();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.renault.com.ua/uk/models/megane-sedan");
        Assert.assertTrue(renault.isTitleContains("Новий MEGANE Sedan "));
        Assert.assertTrue(renault.isTextDisplayed());


    }

    @Test
    public void checkCommercialVehicles() {
        RenaultPageHelper renault = new RenaultPageHelper(driver);
        renault.openRenault();
        renault.clickOnModels();
        renault.clickCommercialVehicles();
        renault.clickMaster();
        renault.clickPriceMaster();
       Assert.assertEquals(driver.getCurrentUrl(),"https://www.renault.com.ua/uk/models/master-f62-ph2-master");
       Assert.assertTrue(renault.isTitleContains("Це не просто еволюція - це революція"));


    }


}
