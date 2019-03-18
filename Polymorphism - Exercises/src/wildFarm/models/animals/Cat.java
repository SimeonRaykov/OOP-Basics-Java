package wildFarm.models.animals;

import wildFarm.models.food.Food;

import java.text.DecimalFormat;

public class Cat extends Mammal {
    private String breed;

    public Cat(String animalName, String animalType, double animalWeight, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;
    }

    @Override
    public void printAnimal() {
        DecimalFormat df = new DecimalFormat("###.#");
        System.out.println("Cat[" + this.getAnimalName() + "," + this.getBreed() + "," + df.format(this.getAnimalWeight()) + "," + this.getLivingRegion() + "," + this.getFoodEaten());
    }

    public void eatFood(Food food, int quantity) {
        this.setFoodEaten(quantity);
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    public String getBreed() {
        return breed;
    }
}
