package ShoppingSpree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        LinkedHashMap<String, Person> people = new LinkedHashMap<>();
        HashMap<String, Product> products = new HashMap<>();

        String[] peopleLine = bf.readLine().split("[=;]");
        String[] productsLine = bf.readLine().split("[=;]");

        for (int i = 0; i < peopleLine.length; i+=2) {
            String name = peopleLine[i];
            int money = Integer.parseInt(peopleLine[i + 1]);
            try {
                Person person = new Person(name, money);
                people.put(name, person);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        for (int i = 0; i < productsLine.length; i+=2) {
            String productName = productsLine[i];
            int price = Integer.parseInt(productsLine[i + 1]);

            Product product = new Product(productName, price);
            products.put(productName, product);
        }

        String command = bf.readLine();
        while (!command.equals("END")) {
            String[] tokens = command.split(" ");
            if (people.containsKey(tokens[0])) {
                if (products.containsKey(tokens[1])) {
                    if (people.get(tokens[0]).hasEnoughMoney(products.get(tokens[1]).getCost())) {
                        people.get(tokens[0]).addProduct(products.get(tokens[1]));
                        people.get(tokens[0]).subtractMoney(products.get(tokens[1]).getCost());
                        System.out.println(tokens[0] + " bought " + tokens[1]);
                    } else {
                        System.out.println(tokens[0] + " can't afford " + tokens[1]);
                    }
                }
            }

            command = bf.readLine();
        }

        for (Person person : people.values()) {
            System.out.print(person.getName() + " - ");
            person.printProducts();
            System.out.println();
        }

    }
}
