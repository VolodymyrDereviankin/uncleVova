package testNG;

import holders.TestInit;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pageObject.IronMaidenPageHelper;


public class TestIronMaiden extends TestInit {
    @Test
    public void checkTheNumberOfTheBeast() {
        IronMaidenPageHelper ironMaiden = new IronMaidenPageHelper(driver);
        ironMaiden.openIronMaiden();
        ironMaiden.clickStudioAlbums();
        ironMaiden.clickTheNumberOfTheBest();
    }

    @Test
    public void checkKillers(){
        IronMaidenPageHelper ironMaiden = new IronMaidenPageHelper(driver);
        ironMaiden.openIronMaiden();
        ironMaiden.clickStudioAlbums();
        ironMaiden.clickKillers();
    }

}

