package PizzaBillGen;

public class Pizza {
    private int price;
    private Boolean vegetable;
    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 150;
    private int backPackPrice = 20;
    private int basePizzaPrice;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedForTakeAway = false;

    //constructor
    public Pizza(Boolean vegetable) {
        this.vegetable = vegetable;
        if (this.vegetable) {
            this.price = 300;
        } else {
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }

    public void addExtraCheese() {
        isExtraCheeseAdded = true;
        this.price += extraCheesePrice;
    }

    public void addExtraToppings() {
        isExtraToppingsAdded = true;
        this.price += extraToppingsPrice;
    }

    public void takeAway() {
        isOptedForTakeAway = true;
        this.price += backPackPrice;
    }

    public void getBill() {
        String bill = "";
        System.out.print("Pizza: " + basePizzaPrice);
        if (isExtraCheeseAdded) {
            bill += "\nExtra cheese added: " + extraCheesePrice;
        }
        if (isExtraToppingsAdded) {
            bill += "\nExtra toppings added: " + extraToppingsPrice;
        }
        if (isOptedForTakeAway) {
            bill += "\nTake away: " + backPackPrice;
        }
        bill += "\nBill: " + this.price;
        System.out.println(bill);
    }

    //get price of pizza; for testing / debugging
    // public void getPizzaPrice() {
    //     System.out.println(this.price);
    // }
}
