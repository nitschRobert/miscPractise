package exercises.Fluent.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CoursePage {

    private WebDriver driver = DriverFactory.getChromeDriver();

    public void verifyFreeTrialIsDisplayed () {
        Assert.assertTrue(driver.findElement(By.cssSelector("[class='button button--primary at-element-marker']"))
                .isDisplayed());
    }

    public void verifyCoursePreviewIsDisplayed () {
        Assert.assertTrue((driver.findElement(By.cssSelector("[class='button button--secondary button-overview_vid button--play']")))
                .isDisplayed());
    }

    //////////

    public CoursePage verifyIsDisplayed(By element) {
        Assert.assertTrue(driver.findElement(element).isDisplayed());
        return this;
    }

    public static By freeTrial() {
        return By.cssSelector("[class='button button--primary at-element-marker']");
    }
    public static By coursePreview() {
        return By.cssSelector("[class='button button--secondary button-overview_vid button--play']");
    }
    public static By otherElement() {
        return By.cssSelector("cssSelector");
    }
}
