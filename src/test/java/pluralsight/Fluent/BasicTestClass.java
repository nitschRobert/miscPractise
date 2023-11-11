package pluralsight.Fluent;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import pluralsight.Fluent.pages.DriverFactory;

import java.util.concurrent.TimeUnit;

import static pluralsight.Fluent.pages.DriverFactory.getChromeDriver;
import static pluralsight.Fluent.pages.DriverFactory.getWebdriverWait;

public class BasicTestClass  {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeSuite
    public void startUpBrowser() {
        driver = getChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        wait = getWebdriverWait();
    }


    @BeforeMethod
        public void goToHome() {
         driver.get("https://www.pluralsight.com/");
        }

    @AfterSuite(alwaysRun = true)
        public void closeBrowser() {driver.quit();}

}
