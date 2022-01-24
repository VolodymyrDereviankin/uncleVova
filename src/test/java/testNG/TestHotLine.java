package testNG;

import holders.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.HotLinePageHelper;

public class TestHotLine extends TestInit {
    @Test
    public void hotLineSearchMacBook() {
        String macBookName = "Apple MacBook Pro 16” Space Gray 2021";
        HotLinePageHelper hotLine = new HotLinePageHelper(driver);
        hotLine.getHotLine();
        hotLine.searchForItem(macBookName);
        hotLine.searchMacBook();
        hotLine.printHeadLine(macBookName);
        Assert.assertTrue(hotLine.isHeadLineContains(macBookName));


    }


        @Test
    public void hotLineSearchPhilips(){
            String philipsName = "Philips 32PFS6805";
            HotLinePageHelper hotLine = new HotLinePageHelper(driver);
            hotLine.getHotLine();
            hotLine.searchForItem(philipsName);
            hotLine.searchPhilips();
            Assert.assertTrue(hotLine.isHeadLineContains(philipsName));
        }
    }

