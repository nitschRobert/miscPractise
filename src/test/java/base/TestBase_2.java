package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase_2 {

    // declare WebDriver
    public WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // set directory to your chromedriver -> obsolete (?)
//        System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");

        // create chrome options and add argument to run it maximized
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        // initialize chromedriver with previously specified options and open browser
        driver = new ChromeDriver(options);
    }

    @AfterMethod
    public void tearDown() {
        // close chromedriver and browser
        driver.quit();
    }
}