package moderntesterPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class FormPage_fluent {
    public FormPage_fluent(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "inputFirstName3")
    private WebElement firstNameInput;

    @FindBy(id = "inputLastName3")
    private WebElement lastName;

    @FindBy(id = "inputEmail3")
    private WebElement emailInput;

    @FindBy(id = "inputAge3")
    private WebElement ageInput;

    @FindBy(id = "gridRadiosMale")
    private WebElement maleRadioButton;

    @FindBy(name = "gridRadiosExperience")
    private List<WebElement> yearsOfExperience;

    @FindBy(name = "gridCheckboxProfession")
    private List<WebElement> professions;

    @FindBy(id = "selectContinents")
    private WebElement continents;

    @FindBy(id = "selectSeleniumCommands")
    private WebElement seleniumCommands;

    @FindBy(id = "chooseFile")
    private WebElement chooseFile;

    @FindBy(className = "btn-primary")
    private WebElement sendFormButton;

    @FindBy(id = "validator-message")
    private WebElement validatorMessage;

    public FormPage_fluent setEmail(String email) {
        emailInput.sendKeys(email);
        return this;
        //metoda zwraca obiekt tej samej klasy
    }

    public FormPage_fluent setAge(int age) {
        ageInput.sendKeys(String.valueOf(age));
        return this;
    }

    public FormPage_fluent selectMale() {
        maleRadioButton.click();
        return this;
    }

    public FormPage_fluent selectSeleniumCommand(String seleniumCommandValue) {
        Select seleniumCommandSelect = new Select(seleniumCommands);
        seleniumCommandSelect.selectByValue(seleniumCommandValue);
        return this;
    }

    public FormPage_fluent uploadFile(String absolutePath) {
        chooseFile.sendKeys(absolutePath);
        return this;
    }

    public FormPage_fluent sendForm() {
        sendFormButton.click();
        return this;
    }

    public String getValidatorMessage() {
        return validatorMessage.getText();
    }

    public FormPage_fluent setFirstName(String firstName) {
        firstNameInput.sendKeys(firstName);
        return this;
    }

    public FormPage_fluent setLastName(String lastName) {
        this.lastName.sendKeys(lastName);
        return this;
    }

    public FormPage_fluent selectRandomExperience() {
        getRandomElement(yearsOfExperience).click();
        return this;
    }

    public FormPage_fluent selectRandomProfession() {
        getRandomElement(professions).click();
        return this;
    }

    private WebElement getRandomElement(List<WebElement> elements){
        return elements.get(new Random().nextInt(elements.size()));
    }

    public FormPage_fluent selectContinent(String continentValue) {
        Select continentSelect = new Select(continents);
        continentSelect.selectByValue(continentValue);
        return this;
    }
}