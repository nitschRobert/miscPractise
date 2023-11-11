package pluralsight.Fluent.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DriverFactory {

    private static WebDriver driver;
    private static WebDriverWait wait;

    private DriverFactory() {
        //prevent instantiation
    }

    public static WebDriver getChromeDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }


    public static WebDriverWait getWebdriverWait() {
        if (wait == null) {
            wait = new WebDriverWait(getChromeDriver(), (Duration.ofSeconds(10)));
        }
        return wait;
    }
}
