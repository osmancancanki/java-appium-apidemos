package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ActionBarPage extends BasePage {

    public ActionBarPage(AndroidDriver driver) {
        super(driver);
    }

    public void firstScenario() {
        //scenario steps should be seperated step by step
        //locators must be created out of method and called when needed
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[3]").click();
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[1]").click();
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[2]").click();
        driver.findElementById("com.hmh.api:id/btn_toggle_tabs").click();
        driver.findElementById("com.hmh.api:id/btn_add_tab").click();
        driver.findElementById("com.hmh.api:id/btn_add_tab").click();
        driver.findElementById("com.hmh.api:id/btn_add_tab").click();
        driver.findElementById("com.hmh.api:id/btn_remove_tab").click();
        driver.findElementById("com.hmh.api:id/btn_remove_all_tabs").click();
    }
}