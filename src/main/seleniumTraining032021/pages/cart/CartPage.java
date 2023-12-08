package seleniumTraining032021.pages.cart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import seleniumTraining032021.model.Order;
import seleniumTraining032021.model.OrderLine;
import seleniumTraining032021.pages.BasePage;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#cart-subtotal-products .value")
    private WebElement totalOrderCost;


    @FindBy(css = "div.product-line-grid")
    private List<WebElement> allItems;

    public List<CartOrderLineComponent> getAllItems() {
        return allItems
                .stream()
                .map(CartOrderLineComponent::new)
                .collect(Collectors.toList());
    }

    public List<OrderLine> getAllOrderLines() {
        return getAllItems()
                .stream()
                .map(CartOrderLineComponent::toOrderLine)
                .collect(Collectors.toList());
    }

    public BigDecimal getTotalOrderCost() {
        return new BigDecimal(totalOrderCost.getText().replace("$", ""));
    }

    public Order toOrder() {
        return new Order(getAllOrderLines(), getTotalOrderCost());
    }
}
