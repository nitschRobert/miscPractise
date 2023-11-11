package pluralsight.Fluent.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static pluralsight.Fluent.pages.DriverFactory.getChromeDriver;

public class HomePage {

    private WebDriver driver = getChromeDriver();

    public SearchPage search(String value){
        WebElement unlockSearch = driver.findElement(By.cssSelector("svg[viewbox ='0 0 797 801']"));
        unlockSearch.click();
        WebElement search = driver.findElement(By.cssSelector(".header_search--input"));
        search.sendKeys(value);
        search.sendKeys(Keys.ENTER);
        return new SearchPage();
    }
}
