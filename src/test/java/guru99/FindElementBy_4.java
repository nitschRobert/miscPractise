package guru99;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementBy_4 {
    @Test
    public void findElements() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://demo.guru99.com/test/ajax.html");

// Find the radio button for “No” using its ID and click on it
        driver.findElement(By.id("no")).click();

//Click on Check Button
        driver.findElement(By.id("buttoncheck")).click();

        //
        List<WebElement> elements = driver.findElements(By.name("name"));
        System.out.println("Number of elements:" +elements.size());

        for (int i=0; i<elements.size();i++) {
            System.out.println("Radio button text:" + elements.get(i).getAttribute("value"));
        }

        driver.close();


        //Find Element command takes in the By object as the parameter and returns an object of type WebElement.
// WebElement elementName = driver.findElement(By.LocatorStrategy("LocatorValue"));

        // Locator Value is the unique value using which a web element can be identified.
        // WebElement loginLink = driver.findElement(By.linkText("Login"));


        // Find Elements command takes in By object as the parameter and returns a list of web elements.
// List<WebElement> elementName = driver.findElements(By.LocatorStrategy("LocatorValue"));

        // Example:
        // List<WebElement> listOfElements = driver.findElements(By.xpath("//div"));
    }
}
