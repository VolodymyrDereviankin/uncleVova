package testNG;

import holders.TestInit;
import org.testng.annotations.Test;
import pageObject.YouTubePageHelper;

public class YouTubeTest extends TestInit {
    @Test
    public void chekAssa(){
        YouTubePageHelper youTube = new YouTubePageHelper(driver);
        youTube.openYouTube();
        youTube.playAssa();

    }
}
