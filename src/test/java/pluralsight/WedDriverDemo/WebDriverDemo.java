package pluralsight.WedDriverDemo;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class WebDriverDemo {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","src/main/resources/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/");

        WebDriverWait wait = new WebDriverWait(driver,(Duration.ofSeconds(10)));

        WebElement searchField = driver.findElement(By.cssSelector("input[class~='gLFyf']"));
        //WebElement searchField2 = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        searchField.sendKeys("pluralsight");
        searchField.submit();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Grafika")));

        List<WebElement> imagesLink = driver.findElements(By.linkText("Grafika"));
        imagesLink.get(0).click();

    }
    @Test
    public void WebDriverDemo_2() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        WebElement searchField = driver.findElement(By.cssSelector("input[class~='gLFyf']"));
        searchField.sendKeys("pluralsight");
        searchField.submit();

        WebElement imagesLink = driver.findElements(By.linkText("Grafika")).get(0);
        imagesLink.click();

        WebElement imageElement = driver.findElements(By.cssSelector("img[class~=rg_i")).get(0);
        imageElement.click();
    }
    }

