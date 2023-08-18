import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.Test;
import pages.ActionBarPage;

public class ActionBarTest extends BaseTest{

    ActionBarPage actionBarPage;

    @Test
    public void firstTest(){
        actionBarPage = new ActionBarPage(driver);
        actionBarPage.firstScenario();
    }
}
