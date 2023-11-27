package exercises.guru99;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnImage_7 {

    @Test
    public void clickOnImages() {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1200, 700));

        String baseUrl = "https://www.facebook.com/login/identify?ctx=recover";

        driver.get(baseUrl);
        //click on the "Facebook" logo on the upper left portion
        driver.findElement(By.cssSelector("a[title='Przejdź na stronę główną Facebooka']")).click();



        //verify that we are now back on Facebook's homepage

        if (driver.getTitle().equals("Facebook – zaloguj się lub zarejestruj")) {
            System.out.println("We are back at Facebook's homepage");
        } else {
            System.out.println("We are NOT in Facebook's homepage");
        }


        // String pageTitle = "Facebook – zaloguj się lub zarejestruj";
        // Assertions.assertEquals(pageTitle, driver.getTitle(), "We are NOT in Facebook's homepage");

         driver.close();

    }
}
