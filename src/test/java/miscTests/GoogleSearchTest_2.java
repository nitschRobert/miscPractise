package miscTests;


import base.TestBase_2;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class GoogleSearchTest_2 extends TestBase_2 {

    @Test
    public void googleSearch_2() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.manage().window().setSize(new Dimension(1295, 750));
        driver.navigate().to("https://www.google.com/");

        String title = "QWERTY – Wikipedia, wolna encyklopedia";

        WebElement acceptBtn = driver.findElement(By.id("L2AGLb"));
        acceptBtn.click();
        WebElement searchField = driver.findElement(By.cssSelector("[title='Szukaj"));
        searchField.sendKeys("qwerty");
        searchField.submit();

        driver.findElement(By.xpath("//*[text()='" + title + "']")).click();
        wait.until(ExpectedConditions.titleIs(title));
    }
}