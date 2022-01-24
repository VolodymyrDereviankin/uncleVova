package testNG;

import holders.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.HotLinePageHelper;

public class TestHotLineSearchMacBook extends TestInit {
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
}
