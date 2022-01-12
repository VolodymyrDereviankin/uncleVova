package pageObject;

import org.openqa.selenium.WebDriver;

public class YouTubePageHelper extends YouTubePageElement {
    public YouTubePageHelper(WebDriver driver) {
        super(driver);
    }

    public void openYouTube() {
        driver.get("https://www.youtube.com/results?search_query=%D0%B2%D0%B2%D1%81+%D0%B0%D1%81%D1%81%D0%B0");
    }

    public void playAssa() {
        getAssa().click();
    }
}
