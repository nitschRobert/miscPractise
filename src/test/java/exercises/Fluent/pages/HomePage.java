package exercises.Fluent.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private WebDriver driver = DriverFactory.getChromeDriver();

    public SearchPage search(String value){
        WebElement unlockSearch = driver.findElement(By.cssSelector("svg[viewbox ='0 0 797 801']"));
        unlockSearch.click();
        WebElement search = driver.findElement(By.cssSelector(".header_search--input"));
        search.sendKeys(value);
        search.sendKeys(Keys.ENTER);
        return new SearchPage();
    }
}
