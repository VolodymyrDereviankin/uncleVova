package testNG;

import holders.TestInit;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pageObject.TeslaPagerHelper;

public class TeslaTest extends TestInit {


    @Test
    public void checkTesla() {
        TeslaPagerHelper tesla = new TeslaPagerHelper(driver);
        tesla.openTesla();
        tesla.clickModelX();
        tesla.clickOrderNow();


    }
 }



