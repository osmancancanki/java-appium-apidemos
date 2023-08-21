package pages;

import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.Assertions;

public class ActivityPage extends BasePage {

    public ActivityPage(AndroidDriver driver) {
        super(driver);
    }

    public void secondScenario() {
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[3]").click();
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[2]").click();
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[3]").click();
        driver.findElementById("com.hmh.api:id/left_text_edit").sendKeys("?");//sendKeys(Textbox)
        driver.findElementById("com.hmh.api:id/left_text_button").click();
        String leftTextExpected = "Left is best?";
        String leftTextActual = driver.findElementById("com.hmh.api:id/left_text").getText();//getText(Navigation)
        Assertions.assertEquals(leftTextExpected, leftTextActual);
        driver.findElementById("com.hmh.api:id/right_text_edit").sendKeys("?");//sendKeys(Textbox)
        driver.findElementById("com.hmh.api:id/right_text_button").click();
        String rightTextExpected = "Right is always right?";
        String rightTextActual = driver.findElementById("com.hmh.api:id/right_text").getText();//getText(Navigation)
        Assertions.assertEquals(rightTextExpected, rightTextActual);
    }
}
