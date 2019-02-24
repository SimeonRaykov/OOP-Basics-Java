package PizzaCalories;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Topping {

    private String modifier;
    private int toppingWeight;

    private final static Set<String> AVAILABLE_TOPPINGS = new HashSet<>(Arrays.asList("Meat", "Veggies", "Cheese", "Sauce"));

    public Topping(String modifier, int toppingWeight) {
        if (!AVAILABLE_TOPPINGS.contains(modifier)) {
            throw new IllegalArgumentException("Cannot place " + modifier + " on top of your pizza.");
        } else {
            if (toppingWeight < 1 || toppingWeight > 50) {
                throw new IllegalArgumentException(modifier + "weight should be in the range [1..50].");
            } else {
                this.modifier = modifier;
                this.toppingWeight = toppingWeight;
            }
        }
    }

    public double calcToppingCalories() {
        double calc = 2;
        double multiplier = 0;
        if (this.getModifier().equals("Meat")) {
            multiplier = 1.2;
        } else if (this.getModifier().equals("Veggies")) {
            multiplier = 0.8;
        } else if (this.getModifier().equals("Cheese")) {
            multiplier = 1.1;
        } else if (this.getModifier().equals("Sauce")) {
            multiplier = 0.9;
        }
        return calc * multiplier * getToppingWeight();
    }

    public String getModifier() {
        return modifier;
    }

    public int getToppingWeight() {
        return toppingWeight;
    }

}
