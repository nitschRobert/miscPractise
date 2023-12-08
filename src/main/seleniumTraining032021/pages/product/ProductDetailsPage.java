package seleniumTraining032021.pages.product;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import seleniumTraining032021.model.Order;
import seleniumTraining032021.model.OrderLine;
import seleniumTraining032021.model.Product;
import seleniumTraining032021.pages.BasePage;

import java.math.BigDecimal;
import java.time.Duration;

public class ProductDetailsPage extends BasePage {
    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "h1[itemprop='name']")
    private WebElement nameLabel;

    @FindBy(css = "span[itemprop='price']")
    private WebElement priceLabel;

    @FindBy(css = "#quantity_wanted")
    private WebElement quantityInput;

    @FindBy(css = ".add-to-cart")
    private WebElement addProductBtn;

    public String getProductName() {
        return nameLabel.getText();
    }

    public BigDecimal getProductPrice() {
        return new BigDecimal(priceLabel.getText().replace("$", ""));
    }

    public ProductDetailsPage setQuantity(int quantity) {
        quantityInput.clear();
        quantityInput.sendKeys(String.valueOf(quantity)); // 5 -> "5"
        return this;
    }

    public int getProductQuantity() {
        return Integer.parseInt(quantityInput.getAttribute("value"));
    }

    public void addToBasket(Order order) {
        order.addNewOrderLine(toOrderLine());
        addProductBtn.click();
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#myModalLabel")));
    }

    public OrderLine toOrderLine() {
        return new OrderLine(new Product(getProductPrice(), getProductName()),
                getProductQuantity());
    }
}
