package testNG;

import holders.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.PatonPageHelper;

public class TestPaton extends TestInit {
    @Test
    public void patonStandardTIG200(){
        String userManualStandardTIG200 = "Руководство пользователя StandardTIG-200 (2.03MB)";
        String url = "https://paton.ua/ru/svarochnoe-oborudovanie/argonodugovye-apparaty/zvaryuvalniy-aparat-paton-standardtig-200/";
        String weldungMachinePatonStandardTIG200 = "Сварочный аппарат PATON™ StandardTIG-200";
        String addWeldingToBookmarks = "Вы добавили Сварочный аппарат PATON™ StandardTIG-200 в Закладки!";

        PatonPageHelper paton =new PatonPageHelper(driver);

        paton.getPaton();
        paton.searchForItem(weldungMachinePatonStandardTIG200);
        paton.searchPatonStandardTIG200();
        paton.addToBookmarks();
        System.out.println(paton.getHeadLine().getText());
        Assert.assertTrue(paton.isHeadLineContains(addWeldingToBookmarks));
        Assert.assertEquals(paton.getUserManualStandardTIG200().getText(), userManualStandardTIG200);
        Assert.assertEquals(driver.getCurrentUrl(), url);

    }




}
