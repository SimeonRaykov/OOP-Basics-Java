package Mordor;

import java.util.ArrayList;
import java.util.List;

public class Gandalf {

    private int points;
    private String mood;
    private List<String> foods;

    public Gandalf() {
        this.points = 0;
        this.foods = new ArrayList<>();
        this.mood = "Sad";
    }

    private void changeMood() {
        if (this.getFoodPoints() < -5) {
            this.mood = "Angry";
        } else if (this.getFoodPoints() >= -5 && this.getFoodPoints() < 0) {
            this.mood = "Sad";
        } else if (this.getFoodPoints() >= 0 && this.getFoodPoints() < 15) {
            this.mood = "Happy";
        } else if (this.getFoodPoints() > 15) {
            this.mood = "JavaScript";
        }
    }

    public void modifyFoodPoints(int points) {
        this.points += points;
    }

    public void eatFood(String food) {

        if (Foods.contains(food.toUpperCase())) {
            this.modifyFoodPoints(Foods.valueOf(food).getValue());
        }
        else{
            this.modifyFoodPoints(-1);
        }
        this.foods.add(food);
        this.changeMood();
    }

    public int getFoodPoints() {
        return this.points;
    }

    public String getMood() {
        return this.mood;

    }

}
