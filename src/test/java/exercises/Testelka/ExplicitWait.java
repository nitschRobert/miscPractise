package exercises.Testelka;

import junit.framework.AssertionFailedError;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {
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
    public void ExWait() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String baseUrl = "https://demowebshop.tricentis.com/";
        driver.get(baseUrl);
        Assertions.assertEquals(baseUrl, driver.getCurrentUrl(), "Url is not OK");

        wait.until(ExpectedConditions.titleIs("Demo Web Shop"));
// correct id="small-searchterms"
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#small-searchterms")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("small-searchterms")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@id,'searchterms')]")));

// WebElement searchStore = driver.findElement(By.id("small-searchterm"));
// WebElement searchStore2 = driver.findElement(By.cssSelector("#small-searchterms"));

        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("small-searchterm")));
        } catch (TimeoutException e){
            throw new AssertionFailedError("item cannot be located " + e.getMessage());
        }

// Explicit Wait ma już zupełnie inną implementację: musimy utworzyć obiekt klasy WebDriverWait
// przekazując mu WebDrivera oraz wartość timeoutu, a następnie wywołać na niej metodę until,
// w której podajemy warunek jaki musi być spełniony.
// Selenium w Javie dostarczane jest wraz z klasą ExpectedConditions, która zawiera predefiniowane metody z warunkami.

//https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/support/ui/ExpectedConditions.html

// w przeciwieństwie do Implicit Wait, który w przypadku niedoczekania się na element
// w jakimś określonym czasie rzuca NoSuchElementException, Explicit Wait rzuca TimeoutException.
// Ta informacja jest istotna na przykład w przypadku obsługi wyjątków, jak w teście powyżej.
    }
}