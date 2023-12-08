package seleniumTraining032021.pages.product;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import seleniumTraining032021.pages.BasePage;


import java.util.List;
import java.util.stream.Collectors;

public class ProductsGridComponent extends BasePage {
    public ProductsGridComponent(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "article")
    private List<WebElement> allItems;

    public List<ProductsGridItemComponent> getAllItems() {
        return allItems
                .stream()
                .map(c -> new ProductsGridItemComponent(getDriver(), c))
                .collect(Collectors.toList());
    }

    public ProductsGridItemComponent getRandomItem() {
        return new ProductsGridItemComponent(getDriver(), getRandomElement(allItems));
    }



    // prostsza forma zapisu metody:
//    public List<ProductsGridItemComponent> getAllItems() {
//        List<ProductsGridItemComponent> items = new ArrayList<>();
//        for (WebElement item : allItems) {
//            items.add(new ProductsGridItemComponent(item));
//        }
//        return items;
//    }
}
