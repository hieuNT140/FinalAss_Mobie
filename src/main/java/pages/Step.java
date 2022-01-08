package pages;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static core.AppiumBase.driver;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class Step {
    AndroidDriver driver;
    WebDriverWait wait;

    public Step(AndroidDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public void click(By element) {
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public void verifyElementPresent(By element) {
        int check = 0;
        if (wait.until(ExpectedConditions.visibilityOfElementLocated(element)).isDisplayed()) {
            check = 1;
        }
        Assert.assertEquals(check, 1);
    }

    public void verifyElementPresent(String xpath) {
        int check = 0;
        if (wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).isDisplayed()) {
            check = 1;
        }
        Assert.assertEquals(check, 1);
    }



    public void swipeDownElement(By element) {
        Dimension size = driver.manage().window().getSize();
        int starty = (int) (size.height * 0.8);
        int endy = (int) (size.height * 0.2);
        int startx = size.width / 2;

        TouchAction action = new TouchAction(driver);

        while (true) {
            action.longPress(PointOption.point(startx, starty)).moveTo(PointOption.point(startx, endy)).release().perform();
            if (driver.findElements(element).size() != 0) {
                break;
            }else{
                action.longPress(PointOption.point(startx, starty)).moveTo(PointOption.point(startx, endy)).release().perform();
            }
        }
    }

    public void TapToElement(By element) throws InterruptedException {
        Thread.sleep(5000);
        TouchAction action = new TouchAction(driver);
        //action.tap(TapOptions.tapOptions().withElement(ElementOption.element(wait.until(ExpectedConditions.visibilityOfElementLocated(element))))).perform();
        action.tap(tapOptions().withElement(element((driver.findElement(element))))).perform();
    }

}
