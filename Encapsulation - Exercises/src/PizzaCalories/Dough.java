package PizzaCalories;

import java.util.Arrays;
import java.util.HashSet;

public class Dough {

    private String type;
    private String special;
    private int weight;
    private double calorieTypeModifier;
    private double calorieSpecialModifier;
    private final static HashSet<String> AVAILABLE_SPECIALS = new HashSet<>(Arrays.asList("Crispy", "Chewy", "Homemade"));


    public Dough(String type, String special, int doughWeight) {
        if (!type.equals("White") && !type.equals("Wholegrain")) {
            throw new IllegalArgumentException("Invalid type of dough.");
        } else {
            if (!AVAILABLE_SPECIALS.contains(special)) {
                throw new IllegalArgumentException("Invalid type of dough.");
            } else {
                if (doughWeight < 1 || doughWeight > 200) {
                    throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
                } else {
                    this.weight = doughWeight;
                    this.type = type;
                    this.special = special;

                    if (this.getType().equals("White")) {
                        this.setCalorieTypeModifier(1.5);
                    } else if (this.getType().equals("Wholegrain")) {
                        this.setCalorieTypeModifier(1.0);
                    }

                    if (this.getSpecial().equals("Crispy")) {
                        this.setCalorieSpecialModifier(0.9);
                    } else if (this.getSpecial().equals("Chewy")) {
                        this.setCalorieSpecialModifier(1.1);
                    } else if (this.getSpecial().equals("Homemade")) {
                        this.setCalorieSpecialModifier(1.0);
                    }

                }
            }
        }
    }

    public double calcDoughCalories() {
        return (2 * this.getWeight()) * this.getCalorieSpecialModifier() * this.getCalorieTypeModifier();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    public double getCalorieTypeModifier() {
        return calorieTypeModifier;
    }

    public void setCalorieTypeModifier(double calorieTypeModifier) {
        this.calorieTypeModifier = calorieTypeModifier;
    }

    public double getCalorieSpecialModifier() {
        return calorieSpecialModifier;
    }

    public void setCalorieSpecialModifier(double calorieSpecialModifier) {
        this.calorieSpecialModifier = calorieSpecialModifier;
    }
}
