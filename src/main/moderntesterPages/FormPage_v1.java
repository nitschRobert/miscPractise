package moderntesterPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormPage_v1 {

    @FindBy(id = "inputFirstName3")
    private WebElement firstNameInput;

    @FindBy(id = "inputLastName3")
    private WebElement lastNameInput;

    @FindBy(id = "inputEmail3")
    private WebElement emailInput;

    @FindBy(css = "input[id='chooseFile']")
    private WebElement fileUpload;

    public FormPage_v1(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void setName(String name) {
        firstNameInput.sendKeys(name);
    }
    public void setLastName(String lastName) {
        lastNameInput.sendKeys(lastName);
    }
    public void setEmail(String email) {
        emailInput.sendKeys(email);
    }
    public void uploadFile(String path) {
        fileUpload.sendKeys(path);
    }
}