package miscTests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class GoogleSearchTest {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/");

        WebDriverWait wait = new WebDriverWait(driver,(Duration.ofSeconds(10)));

//        accept before you go to Google
        WebElement acceptBtn = driver.findElement(By.id("L2AGLb"));
        acceptBtn.click();

        WebElement searchField = driver.findElement(By.className("gLFyf"));
        //WebElement searchField2 = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        searchField.sendKeys("pluralsight");
        searchField.submit();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Grafika")));

        List<WebElement> imagesLink = driver.findElements(By.linkText("Grafika"));
        imagesLink.get(0).click();
    }
    @Test
    public void googleSearch() {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        WebElement acceptBtn = driver.findElement(By.id("L2AGLb"));
        acceptBtn.click();

        WebElement searchField = driver.findElement(By.className("gLFyf"));
        searchField.sendKeys("pluralsight");
        searchField.submit();
    }
    }