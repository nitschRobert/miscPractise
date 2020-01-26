import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//https://www.guru99.com/first-webdriver-script.html

public class Test1 {
    @Test
    public void testBasic() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait myWaitVar = new WebDriverWait(driver, 10);

        //It automatically opens a new browser window and fetches the page that you specify inside its parentheses.
        //It does exactly the same thing as the get() method.
        driver.navigate().to("http://demowebshop.tricentis.com/");

        // or
        // It automatically opens a new browser window and fetches the page that you specify inside its parentheses.
        // The parameter must be a String object.
        // String baseUrl = "https://www.youtube.com/channel/UC5D9qnAZlP2wod7znQR63pQ/videos";
        // driver.get(baseUrl);

        // Fetches the title of the current page
        System.out.println(driver.getTitle());

        //Fetches the string representing the current URL that the browser is looking at
        System.out.println(driver.getCurrentUrl());

        // Locating elements in WebDriver is done by using the "findElement(By.locator())" method.
        String element1 = driver.findElement(By.id("bar-notification")).getTagName();

        // We used the getTagName() method to extract the tag name of that particular element whose id is "...".
        System.out.println(element1);

        String element2 = driver.findElement(By.className("wishlist-qty")).getTagName();

        //By.cssSelector() does not support the "contains" feature.
        String element3 = driver.findElement(By.cssSelector(".footer-poweredby > a:nth-child(1)")).getTagName();
        String element4 = driver.findElement(By.linkText("Register")).getTagName();
        String element5 = driver.findElement(By.name("keywords")).getTagName();
        String element6 = driver.findElement(By.partialLinkText("Reg")).getTagName();
        String element7 = driver.findElement(By.tagName("head")).getTagName();
        String element8 = driver.findElement(By.xpath("//*[@id='bar-notification']")).getTagName();



// Instead of using the long "driver.findElement(By.locator())" syntax every time you will access a particular element,
// we can instantiate a WebElement object for it.
// The WebElement class is contained in the "org.openqa.selenium.*" package.

        driver.navigate().refresh();
        WebElement webElement = driver.findElement(By.id("small-searchterms"));
        webElement.sendKeys("123");
        //isEnabled() is used when you want to verify whether a certain element is enabled or not before executing a command.
        System.out.println(webElement.isEnabled());

        // isDisplayed() is used when you want to verify whether a certain element is displayed or not before executing a command.
        System.out.println(webElement.isDisplayed());

        // isSelected() is used when you want to verify whether a certain check box, radio button, or option in a drop-down box is selected.
        // It does not work on other elements.

        //Fetches the inner text of the element that you specify
        String innerText = webElement.getText();
        System.out.println(innerText);

//  Clicking is perhaps the most common way of interacting with web elements.
//  The click() method is used to simulate the clicking of any element.
//  It does not take any parameter/argument.
//  The method automatically waits for a new page to load if applicable.
//  The element to be clicked-on, must be visible (height and width must not be equal to zero).

 //elementToBeClickable() - Waits until an element is visible and, at the same time, enabled.
//  The sample code below will wait until the element with to become visible and enabled first before assigning that element as a WebElement variable named "searchButton".
       //  WebElement searchButton = myWaitVar.until(ExpectedConditions.elementToBeClickable(By.linkText("Search")));

       driver.findElement(By.linkText("Search")).click();
       System.out.println(driver.getTitle());


// When using isEnabled(), isDisplayed(), and isSelected(), WebDriver assumes that the element already exists on the page.
// Otherwise, it will throw a NoSuchElementException. To avoid this, we should use a try-catch block so that the program will not be interrupted.
         /* try{
            if(searchButton.isEnabled())
            {
                searchButton.click();
            }
        }
        catch(NoSuchElementException nsee){
            System.out.println(nsee.toString());

        } */

// If you use explicit waits, the type of exception that you should catch is the "TimeoutException".
        /* try{
            WebElement searchButton = myWaitVar.until(ExpectedConditions.elementToBeClickable(By.linkText("Search")));
            driver.findElement(By.linkText("Search")).click();
        }
        catch(TimeoutException toe){
            System.out.println(toe.toString());
        } */


        //Takes you back (or forward) by one page on the browser's history.
        driver.navigate().back();
        driver.navigate().forward();


        // It closes only the browser window that WebDriver is currently controlling.
      //  driver.close();
        // It closes all windows that WebDriver has opened.
        // driver.get("http://www.popuptest.com/popuptest2.html");
      //  driver.quit();

        //System.exit(0);
    }
}
