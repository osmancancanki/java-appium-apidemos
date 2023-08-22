package pages;

import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class BasePage {

    AndroidDriver driver;

    public BasePage(AndroidDriver driver) {
        this.driver = driver;
    }

    public boolean isElementDisplayed(By _by) {
        driver.findElement(_by).isDisplayed();
        return true;
    }

    public String getTextFromElement(By _by) {
        String text = driver.findElement(_by).getText();
        return text;
    }

    public boolean assertionForElement(By _by, String expectedValue) {
        String actualValue = getTextFromElement(_by);
        Assertions.assertEquals(expectedValue, actualValue);
        return true;
    }

    public void clickToElement(By _by) {
        driver.findElement(_by).click();
    }

    public void sendKeysToElement(By _by, String value) {
        driver.findElement(_by).sendKeys(value);
    }
}
