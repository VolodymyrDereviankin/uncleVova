package pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HotLinePageHelper extends HotLinePageElements{
    public HotLinePageHelper(WebDriver driver){
        super(driver);
    }


    public void getHotLine(){
        driver.get("https://hotline.ua/");
        waitForPageLoad();
    }

    public void searchForItem(String item){
        getSearchField().sendKeys(item, Keys.ENTER);
//        getSearchField().sendKeys(Keys.ENTER);
    }

    public void showMoreResults(){
        waitSeconds(3);
        getMoreResultsButton().click();
    }

    public void searchMacBook(){
        getMacBook().click();
    }

    //Просто проверка
    public void printHeadLine(String name){
        System.out.println("Head line text (" +getHeadLine().getText() + ") --- Expected headline (" + name +")");
    }
    public boolean isHeadLineContains(String name){
        return getHeadLine().getText().contains(name);
    }

    public void searchPhilips(){
        getPhilips().click();
    }


}
