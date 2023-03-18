package com.driver;

public abstract class Pizza {
    protected int basePrice;
    protected boolean hasExtraCheese;
    protected boolean hasExtraToppings;
    protected boolean hasPaperBag;

    public Pizza(int basePrice) {
        this.basePrice = basePrice;
        this.hasExtraCheese = false;
        this.hasExtraToppings = false;
        this.hasPaperBag = false;
    }

    public void addExtraCheese() {
        if (!hasExtraCheese) {
            hasExtraCheese = true;
        }
    }

    public void addExtraToppings() {
        if (!hasExtraToppings) {
            hasExtraToppings = true;
        }
    }

    public void addPaperBag() {
        if (!hasPaperBag) {
            hasPaperBag = true;
        }
    }

    public abstract int calculateTotalPrice();

    public String generateBill() {
        StringBuilder bill = new StringBuilder();
        bill.append("Base Price Of The Pizza: ").append(basePrice).append("\n");
        if (hasExtraCheese) {
            bill.append("Extra Cheese Added: 80\n");
        }
        if (hasExtraToppings) {
            int extraToppingsPrice = (this instanceof DeluxePizza) ? 0 : 70;
            bill.append("Extra Toppings Added: ").append(extraToppingsPrice).append("\n");
        }
        if (hasPaperBag) {
            bill.append("Paperbag Added: 20\n");
        }
        bill.append("Total Price: ").append(calculateTotalPrice()).append("\n");
        return bill.toString();
    }
}
