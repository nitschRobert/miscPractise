package miscTests;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SeleniumEasy_1 {

    @Test
    public void test() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");

        WebElement singleInputFieldPanelHeading = driver.findElement(By.xpath("//*[text()='Single Input Field']"));

        List<WebElement> panelHeadings = driver.findElements(By.className("panel-heading"));

        Assertions.assertEquals(singleInputFieldPanelHeading,panelHeadings.get(1));

        WebElement enterMessageField = driver.findElement(By.xpath("//input[@id='user-message']"));

        enterMessageField.sendKeys("new message");

        driver.close();
    }
}