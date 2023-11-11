package guru99;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SelectDropdown_8 {

    @Test
    public void select() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String baseURL = "http://demo.guru99.com/test/newtours/register.php";
        driver.get(baseURL);
        Select dropCountry = new Select(driver.findElement(By.name("country")));
        dropCountry.selectByVisibleText("POLAND");
        //dropCountry.deselectByVisibleText("POLAND"); - You may only deselect options of a multi-select

        // Selects/deselects the option whose "value" attribute matches the specified parameter.
        dropCountry.selectByValue("BOLIVIA");
        //dropCountry.deselectByValue("BOLIVIA");

        dropCountry.selectByIndex(10);
        //dropCountry.deselectByIndex(10);
    }

         @Test
        public void multiselect() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Selecting Items in a Multiple SELECT elements
        driver.get("http://jsbin.com/osebed/2");
        Select fruits = new Select(driver.findElement(By.id("fruits")));

        // Returns TRUE if the drop-down element allows multiple selections at a time; FALSE if otherwise.
        fruits.isMultiple();

        fruits.selectByVisibleText("Banana");
        fruits.selectByIndex(1);

        // Clears all selected entries. This is only valid when the drop-down element supports multiple selections.
         fruits.deselectAll();

        //driver.close();
    }
}
