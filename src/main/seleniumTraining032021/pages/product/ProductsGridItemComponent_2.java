package seleniumTraining032021.pages.product;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

public class ProductsGridItemComponent_2 {
    public ProductsGridItemComponent_2(WebElement item) {
        PageFactory.initElements(new DefaultElementLocatorFactory(item), this);
    }

    @FindBy(css = ".product-title")
    private WebElement productName;

    public void open() {
        productName.click();
    }

}
