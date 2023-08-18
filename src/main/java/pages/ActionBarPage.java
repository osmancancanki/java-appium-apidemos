package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ActionBarPage extends BasePage{

    public ActionBarPage(AndroidDriver driver) {
        super(driver);
    }

    public void firstScenario(){
        //scenario steps should be seperated step by step
        //locators must be created out of method and called when needed
            MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[3]");
            el1.click();
            MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[1]");
            el2.click();
            MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[2]");
            el3.click();
            MobileElement el6 = (MobileElement) driver.findElementById("com.hmh.api:id/btn_toggle_tabs");
            el6.click();
            MobileElement el4 = (MobileElement) driver.findElementById("com.hmh.api:id/btn_add_tab");
            el4.click();
            el4.click();
            el4.click();
            MobileElement el5 = (MobileElement) driver.findElementById("com.hmh.api:id/btn_remove_tab");
            el5.click();
            MobileElement el10 = (MobileElement) driver.findElementById("com.hmh.api:id/btn_remove_all_tabs");
            el10.click();
        }
    }