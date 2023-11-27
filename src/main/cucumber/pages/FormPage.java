package cucumber.pages;

import cucumber.model.Credentials;
import cucumber.operations.SeleniumOperations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FormPage extends BasePage {

    public FormPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "inputFirstName3")
    private WebElement firstNameInput;

    @FindBy(how = How.ID, using = "inputLastName3")
    private WebElement lastNameInput;

    @FindBy(how = How.ID, using = "inputEmail3")
    private WebElement emailInput;

    public void input_names_and_email(Credentials credentials) {
        SeleniumOperations.typeText(firstNameInput, credentials.getFirstName());
        SeleniumOperations.typeText(lastNameInput, credentials.getLastName());
        SeleniumOperations.typeText(emailInput, credentials.getEmail());
    }
}