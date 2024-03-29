package moderntesterForm;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.moderntester.*;
import base.TestBase;

import java.io.File;

public class FormTest extends TestBase {

    @Test
    public void test1() {
        getDriver().get(formUrl);
        FormPage formPage = new FormPage(getDriver());

        formPage.setName("first_name");
        formPage.setLastName("last_name");
        formPage.setEmail("email@com.pl");
        formPage.uploadFile("C:\\Users\\Administrator\\qwerty_test.txt");
    }

    @Test
    public void shouldFillFormWithSuccess(){
        getDriver().get(formUrl);
        FormPage_fluent formPage = new FormPage_fluent(getDriver());
        File fileToUpload = new File(uploadPath);

        formPage.setFirstName("Jan");
        formPage.setLastName("Kowalski");
        formPage.setEmail("j.k@wp.pl");
        formPage.setAge(40);
        formPage.selectMale();
        formPage.selectRandomProfession();
        formPage.selectRandomExperience();
        formPage.uploadFile(fileToUpload.getAbsolutePath());
        formPage.selectContinent("south-america");
        formPage.selectSeleniumCommand("switch-commands");
        formPage.sendForm();
        Assert.assertEquals(formPage.getValidatorMessage(),"Form send with success");
    }
}