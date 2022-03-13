package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:target/default-cucumber-report"},
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@ilktest",
        dryRun = true
)
public class Runner {
}
