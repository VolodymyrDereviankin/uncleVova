package testNG;

import holders.TestInit;
import org.testng.annotations.Test;
import pageObject.BlumPageHelper;

public class TestBlumEServices extends TestInit {

    @Test
    public void blumEServices(){
        BlumPageHelper blum = new BlumPageHelper(driver);

        blum.getEService();
        blum.cookieAcceptAll();
        blum.inputEServices();
        blum.fillUserLogin();
        blum.fillUserPassword();
        blum.clickEnter();
    }
}
 checkout