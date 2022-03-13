package Appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.android.GesturePage;
import utilities.ConfigReader;
import utilities.Driver;

import java.net.MalformedURLException;
import java.net.URL;
import java.security.Key;

public class AppiumInspector02{
    @Test
    public void test() throws InterruptedException, MalformedURLException {

    /*
    * lunch GestureTool app
    * click addGesture buton
    * send text to name box "testing"
    * click done
    * verify testing gesture is created*/
        GesturePage gesturePage=new GesturePage();
        AppiumDriver driver = Driver.getAppiumDriver();
        Thread.sleep(3000);
        gesturePage.addButon.click();
        Thread.sleep(2000);
        gesturePage.nameBox.sendKeys("testing");
        gesturePage.DoneButon.click();


    }
}
