package com.driver;

public class Main {
  public static void main(String[] args) {
    Pizza vegPizza = new Pizza(300) {
      @Override
      public int calculateTotalPrice() {
        int total = basePrice;
        if (hasExtraCheese) {
          total += 80;
        }
        if (hasExtraToppings) {
          total += 70;
        }
        if (hasPaperBag) {
          total += 20;
        }
        return total;
      }
    };

    DeluxePizza nonVegPizza = new DeluxePizza(400);

    vegPizza.addExtraCheese();
    vegPizza.addExtraToppings();
    vegPizza.addPaperBag();

    nonVegPizza.addExtraCheese();

    System.out.println(vegPizza.generateBill());
    System.out.println(nonVegPizza.generateBill());
  }
}
