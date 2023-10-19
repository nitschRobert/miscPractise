package Testelka;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWait {
    WebDriver driver;

    @Before
    public void SetUpDriver(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
    }
    @After
    public void QuitDriver(){
        driver.close();
        driver.quit();
    }

    @Test
    public void ImplWait() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String baseUrl = "https://demowebshop.tricentis.com/";
        String expectedTitle = "Demo Web Shop";
        driver.get(baseUrl);

// correct id="small-searchterms"
        WebElement searchStore = driver.findElement(By.id("small-searchterm"));

// Od tej pory każde wywołanie metody findElement(By by), będzie miało zaszyty timeout na wypadek,
// gdyby element nie był widoczny dla WebDrivera od razu. Oznacza to, że gdy WebDriver nie znajdzie takiego elementu,
// będzie odpytywał DOM przez 10 sekund aż go znajdzie. Jeżeli nie znajdzie go w ciągu zadanego czasu,
// sypnie wyjątkiem NoSuchElementException a więc poinformuje, że szukany element nie został odnaleziony na stronie.

// Implicit Wait ma naturalnie także wady: obejmuje tylko metodę findElement(By by).

        WebElement searchStore2 = driver.findElement(By.cssSelector("#small-searchterms"));
        Assertions.assertEquals(baseUrl, driver.getCurrentUrl(), "Url is not OK");
        Assertions.assertEquals(expectedTitle, driver.getTitle(), "Title is not OK");
        Assertions.assertEquals(searchStore, searchStore2);
    }
}
