package seleniumTraining032021.model;

import java.math.BigDecimal;

public class Product {
    public Product(BigDecimal price, String name) {
        this.price = price;
        this.name = name;
    }

    private BigDecimal price;
    private String name;

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
