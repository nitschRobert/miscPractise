import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test3Ela {

    @Test
    public void test3() {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.manage().window().setSize(new Dimension(1295, 750));

        String title = "QWERTY – Wikipedia, wolna encyklopedia";


        driver.navigate().to("https://www.google.com/");
        WebElement searchField = driver.findElement(By.cssSelector("[title='Szukaj"));

        searchField.sendKeys("qwerty");
        searchField.submit();

        driver.findElement(By.xpath("//*[text()='" + title + "']")).click();
        wait.until(ExpectedConditions.titleIs(title));
    }
}
