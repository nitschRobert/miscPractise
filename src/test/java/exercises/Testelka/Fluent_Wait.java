package exercises.Testelka;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class Fluent_Wait {
    WebDriver driver;

    @Before
    public void SetUpDriver(){
//        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
    }
    @After
    public void QuitDriver(){
        driver.close();
        driver.quit();
    }

    @Test
    public void FltWait() {
        String baseUrl = "https://demowebshop.tricentis.com/";

        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

        driver.get(baseUrl);

// correct id="small-searchterms"
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#small-searchterms")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@id,'searchterms')]")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("small-searchterm")));

// https://www.guru99.com/implicit-explicit-waits-selenium.html
// The fluent wait is used to tell the web driver to wait for a condition,
// as well as the frequency with which we want to check the condition before throwing an "ElementNotVisibleException" exception.
    }
}
