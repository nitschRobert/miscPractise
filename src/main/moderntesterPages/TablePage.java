package moderntesterPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class TablePage {
    public TablePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "tbody tr")
    private List<WebElement> allMountains;

    public List<moderntesterPages.RowPage> getAllMountains() {
        List<moderntesterPages.RowPage> mountains = new ArrayList<>();
        for (WebElement row : allMountains) {
            mountains.add(new moderntesterPages.RowPage(row));
        }
        return mountains;
    }
}