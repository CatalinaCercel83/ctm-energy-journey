package com.ctm_energy_journey.utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import java.net.MalformedURLException;

public class BrowserUtils {

    public static void hover(WebElement element) throws MalformedURLException {
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(element).perform();
    }

    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void scrollToElement(WebElement element) throws MalformedURLException {
        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].scrollIntoView(true);", element);
    }
}