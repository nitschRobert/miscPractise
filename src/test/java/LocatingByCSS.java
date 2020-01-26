import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingByCSS {
    @Test
    public void locating() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("http://demo.guru99.com/test/facebook.html");
        driver.manage().window().maximize();

        driver.findElement(By.id("email"));

        driver.findElement(By.cssSelector("#email"));
        driver.findElement(By.cssSelector("input#email"));
        driver.findElement(By.xpath("//*[@id='email']"));

        driver.findElement(By.cssSelector(".no_js"));
        driver.findElement(By.cssSelector("html.no_js"));
        driver.findElement(By.xpath("//*[@class='no_js']"));

        driver.findElement(By.cssSelector("[name='email']"));
        driver.findElement(By.cssSelector("input[name='email']"));
        driver.findElement(By.cssSelector("input.inputtext[name='email']"));
        driver.findElement(By.xpath("//input[@name='email']"));

       // driver.close();


/*CSS Selectors have many formats, but we will only focus on the most common ones.

    Tag and ID
    Tag and class
    Tag and attribute
    Tag, class, and attribute
*/

    }
}
