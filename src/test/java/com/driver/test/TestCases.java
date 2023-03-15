package com.driver.test;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

import com.driver.DeluxePizza;
import com.driver.Pizza;

public class TestCases {
  @Test
public void testRegularPizza() {
    Pizza pizza = new Pizza(true);
    pizza.addExtraCheese();
    pizza.addExtraToppings();
    pizza.addExtraToppings();
    pizza.addTakeaway();
    assertEquals(470, pizza.getPrice());
    assertEquals("Base Price Of The Pizza: 300\nExtra Cheese Added: 80\nExtra Toppings Added: 70\nPaperbag Added: 20\nTotal Price: 470\n", pizza.getBill());
}

@Test
public void testDeluxePizza() {
    DeluxePizza pizza = new DeluxePizza(false);
    pizza.addExtraCheese();
    pizza.addExtraToppings();
    pizza.addExtraToppings();
    assertEquals(600, pizza.getPrice());
    assertEquals("Base Price Of The Pizza: 400\nExtra Cheese Added: 80\nExtra Toppings Added: 120\nTotal Price: 600\n", pizza.getBill());
}

@Test
public void testNoExtras() {
    Pizza pizza = new Pizza(false);
    pizza.addTakeaway();
    assertEquals(400, pizza.getPrice());
    assertEquals("Base Price Of The Pizza: 400\nTotal Price: 400\n", pizza.getBill());
}


}
