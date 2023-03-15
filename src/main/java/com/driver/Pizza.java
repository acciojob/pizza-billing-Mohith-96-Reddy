package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private Boolean hasExtraCheese;
    private Boolean hasExtraToppings;
    private Boolean hasTakeaway;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.price = isVeg ? 300 : 400; // Set base price based on whether it's veg or non-veg
        this.hasExtraCheese = false;
        this.hasExtraToppings = false;
        this.hasTakeaway = false;
        this.bill = "";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if (!this.hasExtraCheese) {
            this.price += 80;
            this.hasExtraCheese = true;
            this.bill += "Extra Cheese Added: 80\n";
        }
    }

    public void addToppings(String topping){
        if (!this.hasExtraToppings) {
            int toppingPrice = this.isVeg ? 70 : 120;
            this.price += toppingPrice;
            this.hasExtraToppings = true;
            this.bill += "Extra Toppings Added: " + toppingPrice + "\n";
        }
        this.bill += topping + "\n";
    }

    public void addTakeaway(){
        if (!this.hasTakeaway) {
            this.price += 20;
            this.hasTakeaway = true;
            this.bill += "Paperbag Added: 20\n";
        }
    }

    public String getBill(){
        return "Base Price Of The Pizza: " + this.price + "\n" + this.bill + "Total Price: " + this.price + "\n";
    }
}
