package Appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Class01 {
    @Test
    public void test() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();

        //        desiredCapabilities.setCapability(CapabilityType.PLATFORM_NAME,"Android");
        //        desiredCapabilities.setCapability("platformName","Android");

        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"SM N9000Q");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"5.0");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\pc1\\eclipse-workspace\\appiumcucumberframework\\src\\Apps\\GestureTool.apk");
        //desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET,"true");
        desiredCapabilities.setCapability(MobileCapabilityType.FULL_RESET,"true");
        AndroidDriver<WebElement>driver=new AndroidDriver<WebElement>(new URL("http:127.0.0.1:4723/wd/hub"), desiredCapabilities);

        Thread.sleep(5000);


    }
}
