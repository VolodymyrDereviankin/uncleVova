package testNG;

import holders.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.ViyarPageHelper;

public class TestVIYAR extends TestInit {
    @Test
    public void checkVIYAR(){
        ViyarPageHelper viyar = new ViyarPageHelper(driver);
        viyar.openViyar();
        viyar.clickInput();
        viyar.fillUserLogin();
        viyar.fillUserPassword();
        viyar.clickEnter();
        viyar.clickConstructor();
        viyar.clickDsp();
        viyar.clickMaterial();
        viyar.clickUploadfile();
        Assert.assertEquals(driver.getCurrentUrl(),"https://vp.viyar.ua/service/");
        Assert.assertTrue(viyar.isTitleContains("Веб-сервисы компании ВиЯр"));
        Assert.assertTrue(viyar.isTextDisplayed());

    }

    @Test
    public void checkFurnitura(){
        ViyarPageHelper viyar = new ViyarPageHelper(driver);
        viyar.openViyar();
        viyar.clickInput();
        viyar.fillUserLogin();
        viyar.fillUserPassword();
        viyar.clickEnter();
        viyar.clickFurnitura();
        viyar.clickNapravlyayuchie();
        viyar.clickNapravlyayuchieP2O_350();
        Assert.assertEquals(driver.getCurrentUrl(),"https://viyar.ua/catalog/komplekt_napravlyayushchikh_quadro_chast_v_p2o_l_350_eb_23_dsp_do_19_mm/");
        Assert.assertTrue(viyar.isTitleContains("Комплект направляющих Quadro част/в P2O L=350 EB=23 (ДСП до 19 мм)"));
        Assert.assertTrue(viyar.isTextDisplayedNapravlyayuchie());

    }
}
