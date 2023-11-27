package exercises.Fluent;


import exercises.Fluent.pages.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class BasicTestClass  {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeSuite
    public void startUpBrowser() {
        driver = DriverFactory.getChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        wait = DriverFactory.getWebdriverWait();
    }


    @BeforeMethod
        public void goToHome() {
         driver.get("https://www.pluralsight.com/");
        }

    @AfterSuite(alwaysRun = true)
        public void closeBrowser() {driver.quit();}

}
