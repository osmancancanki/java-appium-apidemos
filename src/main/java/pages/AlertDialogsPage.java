package pages;

import io.appium.java_client.android.AndroidDriver;

public class AlertDialogsPage extends BasePage{

    public AlertDialogsPage(AndroidDriver driver) {
        super(driver);
    }

    public void thirdScenario(){
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[3]").click();
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[4]").click();
        driver.findElementById("com.hmh.api:id/select_button").click();
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[4]").click();
        driver.findElementById("android:id/message").click();
    }
}
