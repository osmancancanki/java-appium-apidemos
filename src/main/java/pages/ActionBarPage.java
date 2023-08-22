package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class ActionBarPage extends BasePage {

    public ActionBarPage(AndroidDriver driver) {
        super(driver);
    }

    By appMenuItem = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[3]");
    By actionBarMenuItem = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[1]");
    By actionBarTabMenuItem = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[2]");
    By currentTab = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView");
    By toggleTabButton = By.id("com.hmh.api:id/btn_toggle_tabs");
    By addTabButton = By.id("com.hmh.api:id/btn_add_tab");
    By removeTabButton = By.id("com.hmh.api:id/btn_remove_tab");
    By removeAllTabsButton = By.id("com.hmh.api:id/btn_remove_all_tabs");


    public void firstScenario() {
        //scenario steps should be seperated step by step
        //create spesific method to check tabs with array (
        ///hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.app.ActionBar.Tab[i])
        clickToElement(appMenuItem);
        clickToElement(actionBarMenuItem);
        clickToElement(actionBarTabMenuItem);
        isElementDisplayed(currentTab);
        clickToElement(toggleTabButton);
        clickToElement(addTabButton);
        clickToElement(removeTabButton);
        clickToElement(removeAllTabsButton);
    }
}