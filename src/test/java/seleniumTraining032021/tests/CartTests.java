package seleniumTraining032021.tests;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import seleniumTraining032021.model.Order;
import seleniumTraining032021.pages.cart.CartPage;
import seleniumTraining032021.pages.product.ProductDetailsPage;
import seleniumTraining032021.pages.product.ProductsGridComponent;

import java.util.Random;

public class CartTests extends TestBase {

    @Test
    public void shouldDisplayCorrectProductsInCart() {
        Order expectedOrder = new Order();

        for (int i = 0; i < 10; i++) {
            getDriver().get("http://5.196.7.235/");

            new ProductsGridComponent(getDriver())
                    .getRandomItem()
                    .open()
                    .setQuantity(new Random().nextInt(5) + 1) // 1-6
                    .addToBasket(expectedOrder);

        }

        getDriver().get("http://5.196.7.235/cart");

        Assertions.assertThat(new CartPage(getDriver()).toOrder())
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
