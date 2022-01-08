package core;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumBase {
    public static AndroidDriver driver;

    public static AndroidDriver getDriver() {
        return driver;
    }

    public void createDriver() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");
        capabilities.setCapability("deviceName", "Ip XS MAX");
        capabilities.setCapability("udid", "emulator-5554");
        capabilities.setCapability("platformVersion", "10");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("app", "E:\\Fsoft_Fresher\\Appium_FSoft\\New folder\\Refs\\Shopiness.apk");
        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    public void tearDown(){
        driver.closeApp();
    }
}
