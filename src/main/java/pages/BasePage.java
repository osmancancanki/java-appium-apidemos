package pages;

import io.appium.java_client.android.AndroidDriver;

public class BasePage {//selenium methods should be here to use in page classes

    AndroidDriver driver;

    public BasePage(AndroidDriver driver) {
        this.driver = driver;
    }
}
