package cucumberTests.stepDefinitions;

import cucumber.model.Credentials;
import cucumber.operations.SeleniumOperations;
import cucumber.pages.BaseClass;
import cucumber.pages.FormPage;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginSteps {

    private final WebDriver driver = BaseClass.getDriver();

    Credentials correctCredentials = new Credentials("first_name",
            "last_name", "email@com.pl");

    @When("User fill form with correct credentials")
    public void user_fill_form_with_correct_credentials() throws InterruptedException {
        SeleniumOperations.openPage("http://seleniumui.moderntester.pl/form.php");
        FormPage formPage = new FormPage(driver);
        formPage.input_names_and_email(correctCredentials);
    }
}