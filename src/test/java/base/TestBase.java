package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class TestBase {

    protected String formUrl = "http://seleniumui.moderntester.pl/form.php";
    protected String uploadPath = "C:\\Users\\Administrator\\qwerty_test.txt";

    private WebDriver driver;

    public WebDriver getDriver(){
        return driver;
    }

    @BeforeMethod
    public void setUp(){
//        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
    }

    @AfterMethod
    public void cleanUp(){
        driver.quit();
    }
}