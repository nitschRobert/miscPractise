package cucumberTests.stepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:target/cucumberReport/cucumber.json"},
        monochrome = true,
        features = {"src/main/cucumber/features"},
        strict = true,
        glue = {"cucumberTests.stepDefinitions"},
        tags = "@selenium")
public class RunTest {
}