import org.junit.jupiter.api.Test;
import pages.ActionBarPage;
import pages.ActivityPage;

public class ActivityPageTest extends BaseTest{

    ActivityPage activityPage;

    @Test
    public void secondTest(){
        activityPage = new ActivityPage(driver);
        activityPage.secondScenario();
    }
}
