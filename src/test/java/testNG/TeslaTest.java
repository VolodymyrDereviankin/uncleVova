package testNG;

import holders.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.TeslaPagerHelper;

public class TeslaTest extends TestInit {


    @Test
    public void checkTesla() {
        TeslaPagerHelper tesla = new TeslaPagerHelper(driver);
        tesla.openTesla();
        tesla.clickModelX();
        //tesla.clickOrderNow();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.tesla.com/modelx");
        Assert.assertTrue(tesla.isTetleContaince("Model X | Tesla"));
    }

    @Test
    public void checkCybertruck(){
        TeslaPagerHelper tesla = new TeslaPagerHelper(driver);
        tesla.openTesla();
        tesla.clickMenu();
        tesla.clickCybertrack();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.tesla.com/cybertruck");
        Assert.assertTrue(tesla.isTetleContaince("Cybertruck | Tesla"));
        Assert.assertTrue(tesla.isTextDisplayedCybertrack());
    }
}



