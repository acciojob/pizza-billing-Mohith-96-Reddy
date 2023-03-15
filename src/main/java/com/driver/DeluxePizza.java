package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // Adding default extra cheese and toppings for deluxe pizza
        this.addExtraCheese();
        if (isVeg) {
            this.addToppings("olives");
            this.addToppings("mushrooms");
        } else {
            this.addToppings("chicken");
            this.addToppings("sausage");
            this.addToppings("jalapenos");
        }
    }
}
