package holders;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverHolder {
    protected WebDriver driver;

    public DriverHolder(WebDriver driver) {
        this.driver = driver;
    }

    public void waitForElementToBeClickable(WebElement element) {
        new WebDriverWait(driver, 15)
                .until(ExpectedConditions.elementToBeClickable(element));
    }

    public void refreshPage() {
        driver.navigate().refresh();
        waitForPageLoad();
    }

    public void waitForPageLoad() {
        new WebDriverWait(driver, 30).until((ExpectedCondition<Boolean>) wd ->
                ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
    }


}
