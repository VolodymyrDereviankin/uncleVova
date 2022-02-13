package testNG;

import holders.TestInit;
import org.testng.annotations.Test;
import pageObject.RozetkaPageHelper;

public class TestRozetkaLogin extends TestInit {
    @Test
    public void rozetkaTestLogin(){
        RozetkaPageHelper rozetka = new RozetkaPageHelper(driver);
        rozetka.getRozetka();
    }
}
