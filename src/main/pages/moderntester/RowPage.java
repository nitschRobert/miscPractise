package pages.moderntester;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

public class RowPage {

    public RowPage(WebElement row) {
        // wyszukiwanie nie bedzie dzialac na calej stronie ale tylko w danym elemencie - row
        PageFactory.initElements(new DefaultElementLocatorFactory(row), this);
    }

    @FindBy(css = "th")
    private WebElement rank;

    @FindBy(xpath = "td[1]")
    private WebElement peak;

    @FindBy(xpath = "td[2]")
    private WebElement mountainRange;

    @FindBy(xpath = "td[3]")
    private WebElement state;

    @FindBy(xpath = "td[4]")
    private WebElement height;

    public String getName(){
        return peak.getText();
    }

    public int getHeight(){
        return Integer.parseInt(height.getText());
    }
}