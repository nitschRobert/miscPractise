package exercises.Fluent.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.*;
import exercises.Fluent.Levels;

import static exercises.Fluent.pages.DriverFactory.getChromeDriver;
import static exercises.Fluent.pages.DriverFactory.getWebdriverWait;

public class SearchPage {

    private WebDriver driver = getChromeDriver();
    private WebDriverWait wait = getWebdriverWait();

    //public void filterBySkills(String level) ->
    public SearchPage filterBySkills(Levels level) {
        try {
            driver.findElement(By.xpath("//*[text()='Skill Levels']")).click();
        } catch (Exception e){
            driver.findElement(By.xpath("//*[text()='Skill Levels']")).click();
        }

        try {
            By skillLevel = (By.xpath("//span[contains(@class,'search-filter-option-text') and contains(.,'Beginner')]"));
            wait.until(ExpectedConditions.visibilityOfElementLocated(skillLevel));
            driver.findElement(skillLevel).click();
        } catch (Exception e){
            driver.findElement(By.xpath("//*[text()='Skill Levels']")).click();
            By skillLevel = (By.xpath("//span[contains(@class,'search-filter-option-text') and contains(.,'Beginner')]"));
            wait.until(ExpectedConditions.visibilityOfElementLocated(skillLevel));
            driver.findElement(skillLevel).click();
        }
        return this;
    }

   // public void filterByRole(String role) ->
    public SearchPage filterByRole(String role) {
        try {
            By roleFilter = (By.xpath("//div[contains(@class,'search-filter-header') and contains(.,'Roles')]"));
            wait.until(ExpectedConditions.elementToBeClickable(roleFilter));
            driver.findElement(roleFilter).click();
        } catch (Exception e){
            driver.findElement(By.xpath("//div[contains(@class,'search-filter-header') and contains(.,'Roles')]")).click();
        }

        try {
            By roleName = (By.xpath("//span[contains(@class,'search-filter-option-text') and contains(.,'Software Development')]"));
            wait.until(ExpectedConditions.visibilityOfElementLocated(roleName));
            driver.findElement(roleName).click();
        } catch (Exception e){
            driver.findElement(By.xpath("//div[contains(@class,'search-filter-header') and contains(.,'Roles')]")).click();
            By roleName = (By.xpath("//span[contains(@class,'search-filter-option-text') and contains(.,'Software Development')]"));
            wait.until(ExpectedConditions.visibilityOfElementLocated(roleName));
            driver.findElement(roleName).click();
        }
        return this;
    }

    //public void selectCourseTab()  ->
    public SearchPage selectCourseTab() {
        driver.findElement(By.cssSelector("[data-categories='course']")).click();
        return this;
    }

    // void -> we are moving to next page
    public void selectCourseName(String course) {
        driver.navigate().refresh();
        //driver.findElement(By.xpath("//*[text()='"+ course + "']")).click();
        By courseName = (By.xpath("//*[text()='"+ course + "']"));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(courseName));
        driver.findElement(courseName).click();
    }
}
