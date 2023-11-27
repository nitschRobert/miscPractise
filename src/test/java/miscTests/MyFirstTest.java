package miscTests;


import base.TestBase_2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class MyFirstTest extends TestBase_2 {
    @Test
    public void searchTest() {
        // open duckduckgo website
        driver.get("https://duckduckgo.com/");

        // find search input and type "google"
        WebElement searchInput = driver.findElement(By.id("searchbox_input"));
        searchInput.sendKeys("Google");

        // find search button and click it
        WebElement searchButton = driver.findElement(By.xpath("//*[contains(@class,'searchbox_searchButton')]"));
        searchButton.click();

        // find all search results
        List<WebElement> searchResults = driver.findElements(By.className("result__body"));

        for (WebElement result : searchResults) {
            // find 'deeper' in each element
            // find title in each result and print text from it
            System.out.println(result.findElement(By.className("result__title")).getText());
            // find url in each result and print text from it
            System.out.println(result.findElement(By.className("result__extras__url")).getText());
        }

        // get text from the title of sidebar
        String sidebarTitle = driver.findElements(By.xpath("//div[@data-testid = 'about']//a[contains(@href,'https://pl.wikipedia.org/wiki/Google')]")).get(0).getText();

        // assert that sidebar title text equals "Google"
        Assert.assertEquals(sidebarTitle, "Google");
    }
}