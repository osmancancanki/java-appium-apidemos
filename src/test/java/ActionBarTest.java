import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.Test;
import pages.ActionBarPage;

public class ActionBarTest extends BaseTest{

    ActionBarPage actionBarPage;

    @Test
    public void actionBarTest(){
        actionBarPage = new ActionBarPage(driver);
        actionBarPage.goToActionBar();
        actionBarPage.checkToggleModeIsOff();
        actionBarPage.testBarActions();
    }
}
