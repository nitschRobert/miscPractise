package siiSelenium;


import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class FormTest_v2 extends TestBase {

    @Test
    public void shouldFillFormWithSuccess() {
        getDriver().get(formUrl);
        moderntesterPages.FormPage_fluent formPage = new moderntesterPages.FormPage_fluent(getDriver());
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