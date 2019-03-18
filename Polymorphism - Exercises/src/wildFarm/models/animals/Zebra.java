package wildFarm.models.animals;

import wildFarm.models.food.Food;

import java.text.DecimalFormat;

public class Zebra extends Mammal{
    public Zebra(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void printAnimal() {
        DecimalFormat df = new DecimalFormat("###.#");
        System.out.println("Zebra["+this.getAnimalName()+","+df.format(this.getAnimalWeight())+","+this.getLivingRegion()+","+this.getFoodEaten());
    }

    public void eatFood(Food food, int quantity) {
        if (food.getClass().getSimpleName().equals("Meat")) {
            System.out.println("Mouse are not eating that type of food!");
        } else {
            this.setFoodEaten(quantity);
        }
    }

    @Override
    public void makeSound() {
        System.out.println("Zs");
    }
}
