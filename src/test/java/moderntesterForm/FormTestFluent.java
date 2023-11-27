package moderntesterForm;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.moderntester.FormPage_fluent;
import base.TestBase;

import java.io.File;

public class FormTestFluent extends TestBase {

    @Test
    public void shouldFillFormWithSuccess() {
        getDriver().get(formUrl);
        FormPage_fluent formPage = new FormPage_fluent(getDriver());
        File fileToUpload = new File(uploadPath);

        formPage.setFirstName("Jan")
                .setLastName("Kowalski")
                .setEmail("j.k@wp.pl")
                .setAge(40)
                .selectMale()
                .selectRandomProfession()
                .selectRandomExperience()
                .uploadFile(fileToUpload.getAbsolutePath())
                .selectContinent("south-america")
                .selectSeleniumCommand("switch-commands")
                .sendForm();

        Assert.assertEquals(formPage.getValidatorMessage(), "Form send with success");
    }
}