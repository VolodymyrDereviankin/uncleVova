package pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class PatonPageHelper extends PatonPageElement{
    public PatonPageHelper(WebDriver driver){
        super(driver);
    }

    public void getPaton(){
        driver.get("https://paton.ua/ru/");
    }

    public void searchForItem(String item){
        getSearchField().sendKeys(item, Keys.ENTER);
    }

    public void searchPatonStandardTIG200(){
        getStandardTIG200().click();
    }

    public void addToBookmarks(){
        getToBookmarks().click();
        waitSeconds(2);
    }

    public boolean isHeadLineContains(String name){
        return getHeadLine().getText().contains(name);
    }
}
