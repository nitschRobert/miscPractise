package Testelka;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
public class SwitchingBetweenFrames {

// To access GUI elements in a Frame, we should first direct WebDriver to focus on the frame or pop-up window first before we can access elements within them.
    // This page has 3 frames whose "name" attributes are indicated above.
    // We wish to access the "Deprecated" link encircled above in yellow.
    // In order to do that, we must first instruct WebDriver to switch to the "classFrame" frame using the "switchTo().frame()" method.
    // We will use the name attribute of the frame as the parameter for the "frame()" part.

    @Test
    public void switching() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Implicit wait - used to set the default waiting time throughout the program
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://demo.guru99.com/selenium/deprecated.html");
        driver.switchTo().frame("classFrame");
        driver.findElement(By.linkText("Deprecated")).click();
        driver.close();

    }

    // frameToBeAvailableAndSwitchToIt() - Waits until the given frame is already available, and then automatically switches to it.
  // myWaitVar.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("packageFrame"));

    @Test
        //  WebDriver allows pop-up windows like alerts to be displayed, unlike in Selenium IDE.
    //  To access the elements within the alert (such as the message it contains),
    //  we must use the "switchTo().alert()" method. In the code below,
    //  we will use this method to access the alert box and then retrieve its message using the "getText()" method,
    //  and then automatically close the alert box using the "switchTo().alert().accept()" method.

    public void switchingBetweenPopup() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

// Explicit wait - used to set the waiting time for a particular instance only
        WebDriverWait myWaitVar = new WebDriverWait(driver, Duration.ofSeconds(10));

            String alertMessage = "";

            driver.get("http://jsbin.com/usidix/1");
// Explicit waits are done using the WebDriverWait and ExpectedCondition classes.
            myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[value=\"Go!\"]")));
            driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();

// alertIsPresent() - waits until an alert box is displayed.
            if (myWaitVar.until(ExpectedConditions.alertIsPresent()) != null)
            {
                System.out.println("Alert is present");}

            alertMessage = driver.switchTo().alert().getText();
            driver.switchTo().alert().accept();

            System.out.println(alertMessage);
            driver.quit();

    }

}
