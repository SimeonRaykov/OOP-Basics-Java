package PizzaCalories;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        List<Pizza> pizzaList = new ArrayList<>();
        String[] pizzaInfo = bf.readLine().split("\\s+");
        try {
            Pizza pizza = new Pizza(pizzaInfo[1], Integer.parseInt(pizzaInfo[2]));
            pizzaList.add(pizza);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        String[] doughInfo = bf.readLine().split("\\s+");
        try {
            Dough dough = new Dough(doughInfo[1], doughInfo[2], Integer.parseInt(doughInfo[3]));
            pizzaList.get(0).setDough(dough);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        String command = bf.readLine();

        while (!command.equals("END")) {

            String tokens[] = command.split("\\s+");
            try {
                Topping topping = new Topping(tokens[1], Integer.parseInt(tokens[2]));
                pizzaList.get(0).addTopping(topping);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return;
            }

            command = bf.readLine();
        }

        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println(pizzaList.get(0).getName() + " - " + df.format(pizzaList.get(0).calcTotalPizzaCalories()));


    }
}
