package miscTests;


import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class AutomationPractiseTest {

    @Test
    public void test4() {
        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.get("https://automationpractice.com/index.php");

// 1. className
        WebElement creditCard = driver.findElement(By.className("icon-credit-card"));
        //System.out.println("creditCard class = " + creditCard.getTagName());

        WebElement buttonSearch = driver.findElement(By.className("button-search"));
// 2. name
        WebElement buttonSearch2 = driver.findElement(By.name("submit_search"));
        Assertions.assertEquals(buttonSearch,buttonSearch2);

// 3. id
        //WebElement iconTruck = driver.findElement(By.id("icon-truck"));

        List<WebElement> iconPhone = driver.findElements(By.className("icon-phone"));
        System.out.println("iconPhone size = " + iconPhone.size());

// ->
        driver.get("http://automationpractice.com/index.php?id_category=3&controller=category");

// 4. tagName
        var sortBySelect = driver.findElement(By.tagName("select"));
        // WebElement sortBySelect = driver.findElement(By.tagName("select").className("selectProductSort"));
        System.out.println(sortBySelect.getText());
        System.out.println(sortBySelect);

        List<WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println("images size = " + images.size());

// 5.linkText
// 6.partialLinkText
        WebElement myOrders = driver.findElement(By.linkText("My orders"));
        WebElement myOrders2 = driver.findElement(By.partialLinkText("orders"));
        Assertions.assertEquals(myOrders,myOrders2);

// - >
        driver.navigate().back();

        // <div class="category_footer toggle-footer" style="">
        // Chcemy zaznaczyć element o dwóch klasach:. Żadna z klas nie czyni elementu unikatowym, dopiero ich kombinacja sprawia, że możliwa jest lokalizacja obiektu
        WebElement categories = driver.findElement(By.className("category_footer").className("toggle-footer"));


// 7. Xpath
        WebElement categories2 = driver.findElement(By.xpath("//*[@class='category_footer toggle-footer']"));
      //  / – rozpoczyna wyszukiwanie od element root (czyli w naszym przypadku dokument)
      //  // – zaznacza wszystkie węzły w dokumencie
      //  nazwa_węzła – wskazuje wszystkie węzły danego typu
      //  . – służy do zaznaczenia aktualnego węzła
      //  .. – wskazuje rodzica aktualnego węzła
      //  @ – służy do określania atrybutów

    //XPath: zaznacz wszystkie buttony, które posiadają atrybut type
        WebElement xpathy = driver.findElement(By.xpath("//button[@type]"));
    //XPath: zaznacz wszystkie buttony, których wartość atrybutu type='submit'
        WebElement xpathy2 = driver.findElement(By.xpath("//button[@type='submit']"));
    //XPath: zaznacz wszystkie buttony, które są dziećmi elementu div i których wartość atrybutu type='submit'
        WebElement xpathy3 = driver.findElement(By.xpath("//div/button[@type='submit']"));
    //XPath: zaznacz wszystkie divy, dla których wartość elementu span wynosi '-5%'
        WebElement xpathy4 = driver.findElement(By.xpath("//div[span='-5%']"));
     //XPath: zaznacz wszystkie elementy typu div, dla których wartość atrybutu class zaczyna się od 'fb
        WebElement xpathy5 = driver.findElement(By.xpath("//div[starts-with(@class, 'fb')]"));
    //XPath: zaznacz wszystkie elementy typu div, dla których wartość atrybutu class zawiera 'widget'
        WebElement xpathy6 = driver.findElement(By.xpath("//div[contains(@class, 'widget')]"));
     //XPath: zaznacz wszystkie elementy, dla których wartość atrybutu class zaczyna się od 'fb
        WebElement xpathy7 = driver.findElement(By.xpath("//*[starts-with(@class, 'fb')]"));
    //XPath: zaznacz wszystkie elementy, dla których wartość atrybutu class zawiera 'widget'
        WebElement xpathy8 = driver.findElement(By.xpath("//*[contains(@class, 'widget')]"));
    //XPath: zaznacz wszystkie elementy typu button, które mają jakikolwiek parametr
        WebElement xpathy9 = driver.findElement(By.xpath("//button[@*]"));
    //XPath: zaznacz wszystkie elementy, dla których wartość atrybutu class zawiera 'widget' oraz wszystkie elementy typu button, które mają jakikolwiek parametr
        WebElement xpathy10 = driver.findElement(By.xpath("//*[contains(@class, 'widget')]|//button[@*]"));

            // Szukanie po numerze elementu
        WebElement xpathy11 = driver.findElement(By.xpath("//div/input[1]"));
        WebElement xpathy12 = driver.findElement(By.xpath("//div/input[2]"));

        //Szukanie po tekście
        WebElement customBlock3 = driver.findElement(By.xpath("//*[text()='Custom Block']"));



// 8. CssSelector
        //     [atrybut='wartość']
        WebElement categories3 = driver.findElement(By.cssSelector("[class='category_footer toggle-footer']"));
        WebElement categories4 = driver.findElement(By.cssSelector(".form-group"));
        WebElement categories44 = driver.findElement(By.cssSelector("[class='form-group']"));
        WebElement contactUs = driver.findElement(By.cssSelector("[title='Contact Us']"));

// Szukanie poprzez rodzica
        // <div class="col-xs-6"><h3>Custom Block</h3>
        WebElement customBlock = driver.findElement(By.xpath("//*[@class= 'col-xs-6']/h3"));
        System.out.println(customBlock.getText());
        WebElement customBlock2 = driver.findElement(By.cssSelector("[class='col-xs-6']>h3"));


//  CssSelector   [atrybut='wartość']

        WebElement bestSeller = driver.findElement(By.cssSelector("[data-toggle='tab'][href='#blockbestsellers']"));
        WebElement bestSeller1 = driver.findElement(By.cssSelector("[class='blockbestsellers']"));
        // Możemy również wyszukiwać elementy jedynie po części nazwy klasy. Służy do tego znak * umieszczony zaraz po nazwie atrybutu a przed znakiem równości.
        WebElement bestSeller2 = driver.findElement(By.cssSelector("[class*='bestsellers']"));
        // elementy, który klasa zaczyna się ciągiem znaków 'block'
        WebElement bestSeller3 = driver.findElement(By.cssSelector("[class^='block']"));
        // elementy, który klasa kończy się ciągiem znaków 'sellers'
        WebElement bestSeller4 = driver.findElement(By.cssSelector("[class$='sellers']"));

        // Znak ~ działa tak, że jeżeli wartości atrybutu rozdzielone są spacją,
        // to traktuje jak listę i szuka na tej liście dokładnie takiej samej wartości, czyli w naszym wypadku pełnej nazwy klasy.
// <div class="fb-like-box fb_iframe_widget"
        WebElement widget = driver.findElement(By.cssSelector("[class~='fb_iframe_widget']"));

        // konstrukcja działa w ten sposób, że traktuje myślnik jako separator i szuka takich elementów, których pierwszy element z listy wartości atrybutów jest równy podanemu.
        WebElement widget2 = driver.findElement(By.cssSelector("[class|='fb-like']"));

        List<WebElement> buttons = driver.findElements(By.cssSelector("button"));
        System.out.println("buttons size = " + buttons.size());
        WebElement button = driver.findElement(By.cssSelector("button[class='btn btn-default']"));

       //  CssSelector + Id
        WebElement blockTopMenu = driver.findElement(By.cssSelector("#block_top_menu"));
        WebElement blockTopMenu2 = driver.findElement(By.cssSelector("div#block_top_menu"));
        WebElement blockTopMenu3= driver.findElement(By.cssSelector("div[id='block_top_menu']"));

        WebElement blockTopMenu4 = driver.findElement(By.id("block_top_menu"));

        //  CssSelector + class
        WebElement container = driver.findElement(By.cssSelector(".columns-container"));
        WebElement container2 = driver.findElement(By.cssSelector("div.columns-container"));
        WebElement container3 = driver.findElement(By.cssSelector("div[class='columns-container']"));

        WebElement container4 = driver.findElement(By.className("columns-container"));

        // Szukanie elementu przez relację
        WebElement parentRodzic = driver.findElement(By.cssSelector("[class='block_content toggle-footer']"));
        WebElement childDziecko = driver.findElement(By.cssSelector("[class='block_content toggle-footer']>ul[class='bullet']"));

        WebElement dzieckoCzyPotomek = driver.findElement(By.cssSelector("[class='block_content toggle-footer'] ul[class='bullet']"));
        WebElement potomek = driver.findElement(By.cssSelector("[class='block_content toggle-footer'] [title='My orders']"));

//dokonczyc
        //WebElement myOrders3 = driver.findElement(By.cssSelector("[title='My orders']"));
        //WebElement myOrders3rodzenstwo = driver.findElement(By.cssSelector("[title='My orders']~[title='My credit slips']"));


        driver.close();
    }
}

// Selenium pozwala na zlokalizowanie elementów za pomocą:
//
//    By.CssSelector(“selector”)
//    By.XpathSelector(“selector”)
//    By.ClassName(“selector”)
//    By.Id(“selector”)
//    By.Name(“selector”)
//    By.LinkText(“selector”)
//    By.PartialLinkText(“selector”)
//    By.TagName(“selector”)
