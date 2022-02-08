package pageObject;

import org.openqa.selenium.WebDriver;

public class MasterPageHelper extends MasterPageElements{
    public MasterPageHelper(WebDriver driver){
        super(driver);
    }

    public void getMasterThirtyTwo(){
        driver.get("https://master32mm.ru");
        waitForPageLoad();
    }

    public void searchCatalog(){
        getCatalog().click();
    }

    public void searchSets(){
        getSets().click();
    }

    public void searchSetsStartPlus(){
        getSetsStartPlus().click();
    }

}
