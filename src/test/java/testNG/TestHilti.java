package testNG;

import holders.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.HiltiPageHelper;

public class TestHilti extends TestInit {
    @Test
    public void hiltiVacuumCleaner(){
        String vacuumCleanerName = "VC 20L-X КОМПАКТНЫЙ ПРОМЫШЛЕННЫЙ ПЫЛЕСОС ДЛЯ СУХОЙ/ВЛАЖНОЙ УБОРКИ";
        HiltiPageHelper hilti = new HiltiPageHelper(driver);

        hilti.getHilti();
        hilti.openProduct();
        hilti.openDustRemovalAndVacuumCleaner();
        hilti.openVcAndAccessories();
        hilti.openVacuumCleaner();
        hilti.openVc20LX();
        hilti.closeCookieModal();
        hilti.closetDontShowAgain();
        hilti.openCoshic();
        Assert.assertTrue(hilti.isHeadLineContains(vacuumCleanerName));
        Assert.assertEquals(hilti.getHeadLine().getText(), vacuumCleanerName);


    }

}
