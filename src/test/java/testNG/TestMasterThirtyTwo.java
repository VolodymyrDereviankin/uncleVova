package testNG;

import holders.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.MasterPageHelper;

public class TestMasterThirtyTwo extends TestInit {
    @Test
    public void masterThirtyTwo(){
        String url ="https://master32mm.ru/%D0%9A%D0%B0%D1%82%D0%B0%D0%BB%D0%BE%D0%B3/%D0%9D%D0%B0%D0%B1%D0%BE%D1%80%D1%8B/%D0%9D%D0%B0%D0%B1%D0%BE%D1%80-%D0%A1%D1%82%D0%B0%D1%80%D1%82-%D0%BF%D0%BB%D1%8E%D1%81";
        MasterPageHelper master = new MasterPageHelper(driver);

        master.getMasterThirtyTwo();
        master.searchCatalog();
        master.searchSets();
        master.searchSetsStartPlus();
        Assert.assertEquals(driver.getCurrentUrl(),url);

    }

}
