package PizzaCalories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private String name;
    private final int toppingsNum;
    private Dough dough;
    private List<Topping> toppings;

    public Pizza(String name, int toppings) {
        if (name.isEmpty() || name.length() >= 15) {
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        } else {
            if (toppings > 10 || toppings < 0) {
                throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
            } else {
                this.name = name;
                this.toppingsNum = toppings;
                this.toppings = new ArrayList<>();
            }
        }
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public double calcTotalPizzaCalories() {
        return this.calcDougCalories() + this.calcToppingCalories();
    }

    private double calcDougCalories() {
       return dough.calcDoughCalories();
    }

    private double calcToppingCalories() {
        double totalCaloriesFromToppings = 0;
        for (Topping topping : toppings) {
            totalCaloriesFromToppings += topping.calcToppingCalories();
        }
        return totalCaloriesFromToppings;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getToppingsNum() {
        return toppingsNum;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }
}
