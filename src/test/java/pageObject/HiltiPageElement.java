package pageObject;

import holders.DriverHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HiltiPageElement extends DriverHolder {
    public HiltiPageElement(WebDriver driver){
        super(driver);
    }

    public WebElement getProductsButton(){
        return driver.findElement(By.xpath("//a[contains(text(),'Продукция')]"));
    }

    public WebElement getRemovalAndVacuumCleaner(){
        return driver.findElements(By.xpath("//*[contains(@class, 'category-name')]")).get(2);
    }

    public WebElement getVcAndAccessories(){
        return driver.findElements(By.xpath("//*[contains(@class, 'nav-button-text-label')]")).get(0);
    }

    public WebElement getVacuumCleaner(){
        return driver.findElement(By.xpath("//span[text()='Пылесосы']"));
    }

    public WebElement getVc20LX(){
        return driver.findElement(By.xpath("//a[contains(text(),' VC 20L-X Компактный промышленный пылесос для сухой/влажной уборки ')]"));
    }

    public WebElement getCoshic(){
        return driver.findElement(By.xpath("//span[text()='Добавить в корзину']"));
    }

    public WebElement getDoNotShowAgain(){
        return driver.findElement(By.xpath("//span[text()='Больше не показывать']"));
    }

    public WebElement getDontShowAgain(){
        return driver.findElement(By.xpath("//*[contains(@class,'a-link--arrow a-link--medium a-smartbar-link js-banner-close-forever')]"));
    }

    public WebElement getHeadLine(){
        return driver.findElement(By.xpath("//*[contains(@class, 'heading-md bl-lh-2 d-inline text-uppercase truncate-2 truncate-md-1')]"));
    }
}
