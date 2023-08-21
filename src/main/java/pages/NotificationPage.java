package pages;

import io.appium.java_client.android.AndroidDriver;

public class NotificationPage extends BasePage {

    public NotificationPage(AndroidDriver driver) {
        super(driver);
    }

    public void seventhScenario() {
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[3]").click();
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[10]").click();
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[1]").click();
        driver.findElementById("com.hmh.api:id/notify").click();
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView").click();
        driver.findElementById("com.hmh.api:id/notify").click();
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[1]").click();

    }
}