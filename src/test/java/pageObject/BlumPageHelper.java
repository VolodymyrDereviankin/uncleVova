package pageObject;

import org.openqa.selenium.WebDriver;

public class BlumPageHelper extends BlumPageElements {
    public BlumPageHelper(WebDriver driver){
        super(driver);
    }

    public void getBlum(){
        driver.get("https://www.blum.com/ua/ru/");
        waitForPageLoad();
    }

    public void getEService(){
        driver.get("https://e-services.blum.com/main/");
        waitForPageLoad();
    }

    public void cookieAcceptAll(){
        waitSeconds(2);
        getCookie().click();
    }

    public void inputEServices(){
        getInput().click();
    }

    public void fillUserLogin() {
        getUserLogin().sendKeys("US41YF25");
    }

    public void fillUserPassword() {
        getUserPassword().sendKeys("LvkZew94");
    }

    public void clickEnter(){
        getEnter().click();
    }


}
