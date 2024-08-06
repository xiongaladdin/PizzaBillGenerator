package PizzaBillGen;

public class DeluxPizza extends Pizza{
    public DeluxPizza(Boolean vegetable) {
        super(vegetable);
        super.addExtraCheese();
        super.addExtraToppings();
    }

    //override methods
    @Override
    public void addExtraCheese() {

    }

    @Override
    public void addExtraToppings() {

    }
}
