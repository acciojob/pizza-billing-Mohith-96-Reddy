package com.driver;

public class DeluxePizza extends Pizza {
    public DeluxePizza(int basePrice) {
        super(basePrice + 80 + 120);
        hasExtraCheese = true;
        hasExtraToppings = true;
    }

    @Override
    public int calculateTotalPrice() {
        return basePrice;
    }
}

