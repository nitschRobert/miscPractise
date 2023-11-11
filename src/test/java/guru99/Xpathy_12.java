package guru99;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


// https://www.guru99.com/xpath-selenium.html

// https://testelka.pl/xpath/

public class Xpathy_12 {
    @Test
    public void xpathExample() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://demo.guru99.com/v1/");

        // <td><input type="text" name="uid" maxlength="10" onkeyup="validateuserid();" onblur="validateuserid();"><label id="message23"></label></td>
        WebElement item1 = driver.findElement(By.xpath("//input[@type='text']"));
        WebElement item11 = driver.findElement(By.xpath("//label[@id='message23']"));
        WebElement item111 = driver.findElement(By.xpath("//*[contains(@id,'message')]"));
        WebElement item1111 = driver.findElement(By.xpath("//*[starts-with(@id,'message')]"));

        // <td><input type="submit" name="btnLogin" value="LOGIN">
        // <input type="reset" name="btnReset" value="RESET"></td>
        WebElement item3 = driver.findElement(By.xpath("//input[@value='RESET']"));
        WebElement item33 = driver.findElement(By.xpath("//*[contains(@value,'RES')]"));
        WebElement item333 = driver.findElement(By.xpath("//input[@value='RESET' or @name='btnReset']"));
        WebElement item3333 = driver.findElement(By.xpath("//input[@value='RESET' and @name='btnReset']"));

        WebElement item4 = driver.findElement(By.xpath("//*[@class='barone']"));
        WebElement item5 = driver.findElement(By.xpath("//a[@href='http://demo.guru99.com/']"));
       // ?  WebElement item6 = driver.findElement(By.xpath("//img[@src='https://live.sekindo.com/content/video/splayer/assets/placeHolder.png']"));

        WebElement item7 = driver.findElement(By.xpath("//*[text()='Enter your email id']"));

        // XPath axes methods:
        //
        // These XPath axes methods are used to find the complex or dynamic elements

 // a) Following:
        // There are 3 "input" nodes matching by using "following" axis- password, login and reset button.
        // If you want to focus on any particular element then you can use the below XPath method:

        WebElement followingItem1 = driver.findElement(By.xpath("//*[@type='text']//following::input[1]"));
        WebElement followingItem2 = driver.findElement(By.xpath("//*[@type='text']//following::input[2]"));
        WebElement followingItem3 = driver.findElement(By.xpath("//*[@type='text']//following::input[3]"));


//  b) Ancestor:
    // The ancestor axis selects all ancestors element (grandparent, parent, etc.) of the current node as shown in the below screen.
        // Xpath=//tagname[@attribute='value']//ancestor::_[1];

// c) Child:
    // Selects all children elements of the current node
        // Xpath=//tagname[@attribute='value']//child::_[1];

// d) Preceding:
    // Select all nodes that come before the current node as shown in the below screen.
        // Xpath=//tagname[@attribute='value']//preceding::_[1];
        WebElement preceding = driver.findElement(By.xpath("//*[@type='submit']//preceding::input[1]"));

// e) Following-sibling:
    // Select the following siblings of the context node. Siblings are at the same level of the current node as shown in the below screen.
    // It will find the element after the current node.
        WebElement sibling = driver.findElement(By.xpath("//*[@type='submit']//following-sibling::input"));

// f) Parent:
    // Selects the parent of the current node
        // Xpath=//tagname[@attribute='value']//parent::_[1];

// g) Self:
    // Selects the current node or 'self' means it indicates the node itself
        WebElement self = driver.findElement(By.xpath("//*[@type='password']//self::input"));

// h) Descendant:
    //Selects the descendants of the current node
        // Xpath=//tagname[@attribute='value']//descendant::_[1];

              driver.close();

    }
}

/* XPath contains the path of the element situated at the web page. Standard syntax for creating XPath is.

       Xpath=//tagname[@attribute='value']

   // : Select current node.
   Tagname: Tagname of the particular node.
   @: Select attribute.
   Attribute: Attribute name of the node.
   Value: Value of the attribute

 */

