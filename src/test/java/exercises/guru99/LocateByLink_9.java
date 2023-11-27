package exercises.guru99;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByLink_9 {
    @Test
    public void locateLink() {
      //  System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/test/link.html");

        driver.findElement(By.linkText("click here")).click();
        System.out.println("title of page is: " + driver.getTitle());
        // Accessing links using their exact link text is done through the By.linkText() method.
        // However, if there are two links that have the very same link text, this method will only access the first one.


        driver.get("http://demo.guru99.com/test/accessing-link.html");
        driver.findElement(By.partialLinkText("here")).click();
        System.out.println("title of page is: " + driver.getTitle());
        //Accessing links using a portion of their link text is done using the By.partialLinkText() method.
        // If you specify a partial link text that has multiple matches, only the first match will be accessed.

       // The parameters for By.linkText() and By.partialLinkText() are both case-sensitive, meaning that capitalization matters.

        // The latest HTML5 standard allows the <a> tags to be placed inside and outside of block-level tags like <div>, <p>, or <h3>.
        // The "By.linkText()" and "By.partialLinkText()" methods can access a link located outside and inside these block-level elements.

        //driver.quit();
    }
}
