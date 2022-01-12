package PlaiWithConstructor;

import holders.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class ZanyatieAndrei extends TestInit {
    @Test
    public void testSelenium() {
        openUrl("https://www.renault.com.ua");

        driver.findElements(By.xpath("//*[@class='nav-dropdown-toggle link-style']")).get(0).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


    }
}
