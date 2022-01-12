package pageObject;

import holders.DriverHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.nio.file.WatchEvent;

public class IronMaidenPageElements extends DriverHolder {
    public IronMaidenPageElements(WebDriver driver){
        super(driver);
    }

    public WebElement getStudioAlbums(){
        return driver.findElements(By.xpath("//a[@href='https://www.ironmaiden.com/discography/studio-albums']")).get(0);
    }

    public WebElement getKillers(){
        return driver.findElement(By.xpath("//a[@href='https://www.ironmaiden.com/discography/details/killers']"));
    }

    public WebElement getTheNumberOfTheBest(){
        return driver.findElement(By.xpath("//a[@href='https://www.ironmaiden.com/discography/details/the-number-of-the-beast-album']"));

    }
}
