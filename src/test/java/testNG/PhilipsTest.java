package testNG;

import holders.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.PhilipsPageHelper;

public class PhilipsTest extends TestInit {

    @Test
    public void checkPhilipsAudio() {
        PhilipsPageHelper philips = new PhilipsPageHelper(driver);
        philips.openPhilips();
        philips.clickCatalog();
        philips.clickSoundAndImage();
        philips.clickAudioForHome();
        philips.clickAudioM8905();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.philips.ua/c-m-so/home-audio");
        Assert.assertTrue(philips.isTitleContainsPhilips("Домашні аудіосистеми"));
        Assert.assertTrue(philips.isTextDisplayd());


    }

    @Test
    public void checkPhilipsTV() {
        PhilipsPageHelper philips = new PhilipsPageHelper(driver);
        philips.openPhilips();
        philips.clickCatalog();
        philips.getSoundAndImage();
        philips.clickTV();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.philips.ua/c-m-so/tv");
    }
}
