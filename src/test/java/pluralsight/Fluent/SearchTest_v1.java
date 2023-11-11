package pluralsight.Fluent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SearchTest_v1 {

        WebDriver driver;
        WebDriverWait wait;

       @BeforeMethod
        public void startBrowser() {
         System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

         driver = new ChromeDriver();
         driver.get("https://www.pluralsight.com/");
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         wait = new WebDriverWait(driver, (Duration.ofSeconds(10)));
        }


        @Test
        public void basicFilter()  throws  InterruptedException{

            //search & enter
            WebElement unlockSearch = driver.findElement(By.cssSelector("svg[viewbox ='0 0 797 801']"));
            unlockSearch.click();
            WebElement search = driver.findElement(By.cssSelector(".header_search--input"));
            search.sendKeys("java");
            search.sendKeys(Keys.ENTER);
            waiting();

            //filters
            driver.findElement(By.xpath("//*[text()='Skill Levels']")).click();

            By skillLevel = (By.xpath("//span[contains(@class,'search-filter-option-text') and contains(.,'Beginner')]"));
            wait.until(ExpectedConditions.presenceOfElementLocated(skillLevel));
            driver.findElement(skillLevel).click();
            waiting();

            driver.findElement(By.xpath("//div[contains(@class,'search-filter-header') and contains(.,'Roles')]")).click();

            By roleName = (By.xpath("//span[contains(@class,'search-filter-option-text') and contains(.,'Software Development')]"));
            wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(roleName));
            driver.findElement(roleName).click();
            waiting();

            //select course tab
            driver.findElement(By.cssSelector("[data-categories='course']")).click();

            //select course name
            driver.findElement(By.xpath("//*[text()='Java Fundamentals: The Java Language']")).click();
            waiting();


            //course page
            Assert.assertTrue(driver.findElement(By.cssSelector("[class='button button--primary at-element-marker']"))
                    .isDisplayed());

            Assert.assertTrue((driver.findElement(By.cssSelector("[class='button button--secondary button-overview_vid button--play']")))
                    .isDisplayed());
        }

    private void waiting() throws  InterruptedException {
           Thread.sleep(2000);
    }

    @AfterMethod(alwaysRun = true)
        public void closeBrowser() {driver.quit();}
}
