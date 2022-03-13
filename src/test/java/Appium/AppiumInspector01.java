package Appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import utilities.Driver;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumInspector01{
@Test
    public void test() throws InterruptedException, MalformedURLException {
        AppiumDriver driver = Driver.getAppiumDriver();
        driver.findElementByXPath("(//android.widget.Button)[1]").click();
        Thread.sleep(3000);
        String actualText = driver.findElementById("android:id/title").getText();
        String expectedText = "Create a gesture";
        Assert.assertEquals(actualText, expectedText);
        Thread.sleep(3000);
        driver.findElementByXPath("(//android.widget.Button)[2]").click();



    }

    }

    

