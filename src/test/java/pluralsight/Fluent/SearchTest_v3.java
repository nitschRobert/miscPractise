package pluralsight.Fluent;

import jdk.jshell.spi.ExecutionControl;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pluralsight.Fluent.pages.CoursePage;
import pluralsight.Fluent.pages.HomePage;
import pluralsight.Fluent.pages.SearchPage;

import java.util.concurrent.TimeUnit;

import static pluralsight.Fluent.pages.CoursePage.coursePreview;
import static pluralsight.Fluent.pages.CoursePage.freeTrial;

public class SearchTest_v3 extends BasicTestClass {

    HomePage home = new HomePage();
    CoursePage coursePage = new CoursePage();

    @Test
    public void basicFilter() {
        home.search("Java")
                .filterBySkills(Levels.BEGINNER)
                .filterByRole("Software Development")
                .selectCourseTab()
                .selectCourseName("Java Fundamentals: The Java Language");

         coursePage.verifyIsDisplayed(freeTrial())
                .verifyIsDisplayed(coursePreview());
    }
}
