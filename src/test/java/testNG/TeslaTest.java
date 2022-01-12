package testNG;

import holders.TestInit;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TeslaTest extends TestInit {


    @Test
    public void checkTesla() {
        fullSkreen();
        navigateTesla();
        searctModelX();
        orderNow();


    }

    private void orderNow() {

        driver.findElements(By.xpath("//span[text()='Order Now']")).get(0).click();
    }

    private void searctModelX() {
        driver.findElements(By.xpath(".//span[@class='tds-site-nav-item-text']")).get(2).click();
    }

    private void navigateTesla() {

        driver.get("https://www.tesla.com");
    }

    private void fullSkreen() {

        driver.manage().window().maximize();
    }


}
