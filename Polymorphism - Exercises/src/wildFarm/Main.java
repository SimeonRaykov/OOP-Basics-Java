package wildFarm;

import wildFarm.models.animals.*;
import wildFarm.models.food.Food;
import wildFarm.models.food.Meat;
import wildFarm.models.food.Vegetable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String command = bf.readLine();

        while (!command.equals("End")) {
            String[] animalTokens = command.split("\\s+");
            String[] foodTokens = bf.readLine().split("\\s+");
            Food food;
            if (foodTokens[0].equals("Vegetable")) {
                food = new Vegetable(Integer.parseInt(foodTokens[1]));
            } else {
                food = new Meat(Integer.parseInt(foodTokens[1]));
            }


            if (animalTokens[0].equals("Cat")) {
                Animal cat = new Cat(animalTokens[1], animalTokens[2], Double.parseDouble(animalTokens[3]), animalTokens[4], animalTokens[5]);
                cat.makeSound();
                ((Cat) cat).eatFood(food, food.getQuantity());
                ((Cat) cat).printAnimal();
            } else if (animalTokens[0].equals("Tiger")) {
                Animal tiger = new Tiger(animalTokens[1], animalTokens[2], Double.parseDouble(animalTokens[3]), animalTokens[4]);
                tiger.makeSound();
                ((Tiger) tiger).eatFood(food, food.getQuantity());
                ((Tiger) tiger).printAnimal();
            } else if (animalTokens[0].equals("Zebra")) {
                Animal zebra = new Zebra(animalTokens[1], animalTokens[2], Double.parseDouble(animalTokens[3]), animalTokens[4]);
                zebra.makeSound();
                ((Zebra) zebra).eatFood(food, food.getQuantity());
                ((Zebra) zebra).printAnimal();
            } else if (animalTokens[0].equals("Mouse")) {
                Animal mouse = new Mouse(animalTokens[1], animalTokens[2], Double.parseDouble(animalTokens[3]), animalTokens[4]);
                mouse.makeSound();
                ((Mouse) mouse).eatFood(food, food.getQuantity());
                ((Mouse) mouse).printAnimal();
            }

            command = bf.readLine();
        }


    }
}
