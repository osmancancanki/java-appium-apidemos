package pages;

import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class ActivityPage extends BasePage {

    public ActivityPage(AndroidDriver driver) {
        super(driver);
    }

    By appMenuItem = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[3]");
    By activityMenuItem = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[2]");
    By customTitleMenuItem = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[3]");
    By leftEditInput = By.id("com.hmh.api:id/left_text_edit");
    By leftEditButton = By.id("com.hmh.api:id/left_text_button");
    By leftTitle = By.id("com.hmh.api:id/left_text");
    By rightEditInput = By.id("com.hmh.api:id/right_text_edit");
    By rightEditButton = By.id("com.hmh.api:id/right_text_button");
    By rightTitle = By.id("com.hmh.api:id/right_text");

    public void goToActivity() {
        clickToElement(appMenuItem);
        clickToElement(activityMenuItem);
    }

    public void checkDefaultTitles() {
        clickToElement(customTitleMenuItem);
        assertionForElement(leftTitle, "Left is best");
        assertionForElement(rightTitle, "Right is always right");
    }

    public void changeTitlesAndCheck() {
        sendKeysToElement(leftEditInput, "?");
        clickToElement(leftEditButton);
        assertionForElement(leftTitle, "Left is best?");
        sendKeysToElement(rightEditInput, "?");
        clickToElement(rightEditButton);
        assertionForElement(rightTitle, "Right is always right?");
    }
}
