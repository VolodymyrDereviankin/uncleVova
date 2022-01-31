package testNG;

import holders.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.PatonPageHelper;

public class TestPaton extends TestInit {
    @Test
    public void patonStandardTIG200(){
        String userManualStandardTIG200 = "Руководство пользователя StandardTIG-160, StandardTIG-200 (1.06MB)";
        String weldungMachinePatonStandardTIG200 = "Сварочный аппарат PATON™ StandardTIG-200";
        PatonPageHelper paton =new PatonPageHelper(driver);

        paton.getPaton();
        paton.searchForItem(weldungMachinePatonStandardTIG200);
        paton.searchPatonStandardTIG200();
        Assert.assertEquals(paton.getUserManualStandardTIG200().getText(), userManualStandardTIG200);

    }




}
