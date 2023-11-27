package exercises.guru99;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile_11 {
    @Test
    public void upload() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1200, 700));

            driver.get("http://demo.guru99.com/test/upload/");
            WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

            // enter the file path onto the file-selection input field
            uploadElement.sendKeys("C:\\Users\\rnicz\\Desktop\\upload-download-file-selenium.txt");

            // check the "I accept the terms of service" check box
            driver.findElement(By.id("terms")).click();

            // click the "UploadFile" button
            driver.findElement(By.name("send")).click();

         // Uploading files in WebDriver is done by simply using the sendKeys() method
        // on the file-select input field to enter the path to the file to be uploaded.
    }
}
