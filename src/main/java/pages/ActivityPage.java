package pages;

import io.appium.java_client.android.AndroidDriver;

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
        driver.findElementById("com.hmh.api:id/left_text").getText();//getText(Navigation)
        driver.findElementById("com.hmh.api:id/right_text_edit").sendKeys("2");//sendKeys(Textbox)
        driver.findElementById("com.hmh.api:id/right_text_button").click();
        driver.findElementById("com.hmh.api:id/right_text").click();//getText(Navigation)
    }
}
