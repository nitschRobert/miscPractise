package seleniumTraining032021.tests;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import seleniumTraining032021.model.Order;
import seleniumTraining032021.pages.cart.CartPage_2;
import seleniumTraining032021.pages.product.ProductDetailsPage;
import seleniumTraining032021.pages.product.ProductDetailsPage_2;
import seleniumTraining032021.pages.product.ProductsGridComponent;
import seleniumTraining032021.pages.product.ProductsGridComponent_2;

import java.util.Random;

public class CartTests_2 extends TestBase {

    @Test
    public void shouldDisplayCorrectProductsInCart() {
        Order expectedOrder = new Order();

        for (int i = 0; i < 10; i++) {
            getDriver().get("http://5.196.7.235/");

            new ProductsGridComponent_2(getDriver())
                    .getRandomItem()
                    .open();

            ProductDetailsPage_2 prodPage = new ProductDetailsPage_2(getDriver());
            prodPage.setQuantity(new Random().nextInt(5) + 1); // 1-6
            prodPage.addToBasket(expectedOrder);
        }

        getDriver().get("http://5.196.7.235/cart");
        CartPage_2 cartPage = new CartPage_2(getDriver());
        Order orderDisplayedInCart = cartPage.toOrder();

        Assertions.assertThat(orderDisplayedInCart)
                .isEqualToComparingFieldByFieldRecursively(expectedOrder);
    }

    @Test
    public void addFirstProductToBasket() {
        Order expectedOrder = new Order();
        getDriver().get("http://5.196.7.235/");
        new ProductsGridComponent(getDriver())
                .getAllItems()
                .get(1)
                .open();

        ProductDetailsPage prodPage = new ProductDetailsPage(getDriver());
        prodPage.setQuantity(new Random().nextInt(5) + 1); // 1-6
        prodPage.addToBasket(expectedOrder);
    }
}