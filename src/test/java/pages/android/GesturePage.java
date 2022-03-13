package pages.android;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.net.MalformedURLException;
import java.time.Duration;

public class GesturePage {
    public GesturePage() throws MalformedURLException {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(30)),this);
    }
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Preference']")
    public MobileElement preference;

    @AndroidFindBy(id ="com.davemac327.gesture.tool:id/addButton" )
    public MobileElement addButon;

    @AndroidFindBy(id = "com.davemac327.gesture.tool:id/gesture_name")
    public MobileElement nameBox;

    @AndroidFindBy(id = "com.davemac327.gesture.tool:id/done")
    public MobileElement DoneButon;
}
