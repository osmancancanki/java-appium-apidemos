package pages;

import io.appium.java_client.android.AndroidDriver;

public class TabsMenuPage extends BasePage {

    public TabsMenuPage(AndroidDriver driver) {
        super(driver);
    }

    public void lastScenario() {
         driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[11]").click();
         driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[12]").click();
         driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[5]").click();
         driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.TabHost/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.TabWidget/android.widget.LinearLayout[6]").click();
         driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.TabHost/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView").click();
    }
}