package seleniumTraining032021.pages.product;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import seleniumTraining032021.pages.BasePage;

import java.util.List;
import java.util.stream.Collectors;

public class ProductsGridComponent_2 extends BasePage {
    public ProductsGridComponent_2(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "article")
    private List<WebElement> allItems;

    public List<ProductsGridItemComponent_2> getAllItems() {
        return allItems
                .stream()
                .map(ProductsGridItemComponent_2::new)
                .collect(Collectors.toList());
    }

    public ProductsGridItemComponent_2 getRandomItem() {
        return new ProductsGridItemComponent_2(getRandomElement(allItems));
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
