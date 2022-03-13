package stepdefinitions;

import io.cucumber.java.en.Given;
import utilities.Driver;

import java.net.MalformedURLException;

public class LunchApp {
    @Given("aplikasyonu telefona kur")
    public void aplikasyonu_telefona_kur() throws MalformedURLException {
        Driver.getAppiumDriver();
    }
}
