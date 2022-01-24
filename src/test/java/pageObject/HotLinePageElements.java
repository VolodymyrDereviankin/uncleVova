package pageObject;

import holders.DriverHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HotLinePageElements extends DriverHolder {
    public HotLinePageElements(WebDriver driver){
        super(driver);
    }

    public WebElement getSearchField(){
       return driver.findElement(By.xpath("//input[@type='text']"));
    }

    public WebElement getMoreResultsButton(){
        return driver.findElement(By.xpath("//*[contains(text(), 'Показати всі результати пошуку ')]"));
    }

    public WebElement getMacBook(){
        return driver.findElement(By.xpath("//*[@href='/computer-noutbuki-netbuki/apple-macbook-pro-16-space-gray-2021-mk183/']"));
    }

    public WebElement getHeadLine(){
        return driver.findElement(By.xpath("//*[contains(@class, 'title__main')]"));
    }

    public WebElement getPhilips(){
        return driver.findElements(By.xpath("//*[@href='/av-televizory/philips-32pfs6805/']")).get(0);
    }

}





