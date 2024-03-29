package cucumberTests.stepDefinitions;

import cucumber.pages.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import cucumber.settings.Configuration;

import static cucumber.pages.BaseClass.cleanUp;
import static cucumber.pages.BaseClass.setDriver;

public class Hooks {
    WebDriver driver = BaseClass.getDriver();
    private static Logger log = LogManager.getLogger();


    @Before(value = "@selenium")                //executed before each single scenario
    public void init(Scenario scenario) {
        setDriver(Configuration.HEADLESS_BROWSER_MODE, Configuration.BROWSER);
        log.info("START. SCENARIO NAME = " + scenario.getName());
    }


    @After(value = "@selenium")                              //executed after each single scenario
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
//            SeleniumOperations.makeScreenshot();  //screenshot is taken only if scenario is failed.
//            log.error("AFTER. SCENARIO NAME =  " + scenario.getName() + ". STATUS =  " + scenario.getStatus());
        }
        cleanUp();
//        log.info("AFTER. SCENARIO NAME =  " + scenario.getName() + ". STATUS =  " + scenario.getStatus());
    }
}