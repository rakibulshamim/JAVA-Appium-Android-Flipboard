package utils;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.*;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidSetup {
    public static AndroidDriver driver;

    public AndroidDriver androidSetupAppium() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("platformVersion", "10");
        capabilities.setCapability("deviceName", "Xiaomi");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("app", System.getProperty("user.dir") + "/src/test/resources/Flipboard-4.2.102.apk");
        capabilities.setCapability("appPackage", "flipboard.app");
        capabilities.setCapability("appActivity", "flipboard.activities.LaunchActivity");
//        capabilities.setCapability("newCommandTimeout", 60 * 5);
//        capabilities.setCapability("deviceReadyTimeout", 100);
//        capabilities.setCapability("appWaitDuration", 1000000);
        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
        return driver;
    }

    /**
     * In case it shows NullPointerException or driver is null,
     * then call the androidSetup.setDriver manually from stepDefinitions Constructors
     */

    public void setDriver() throws MalformedURLException {
        androidSetupAppium();
    }

    public AndroidDriver getDriver() {
        return (AndroidDriver) driver;
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.closeApp();
        }
    }

    /**
     * Note:
     * adb uninstall io.appium.uiautomator2.server
     * adb uninstall io.appium.uiautomator2.server.test
     */
}
