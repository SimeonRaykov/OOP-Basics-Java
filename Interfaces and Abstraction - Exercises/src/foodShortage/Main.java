package foodShortage;

import foodShortage.classes.Citizen;
import foodShortage.classes.Rebel;
import foodShortage.interfaces.Buyer;
import foodShortage.interfaces.Person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        List<Buyer> people = new ArrayList<>();

        int lines = Integer.parseInt(bf.readLine());

        for (int i = 0; i < lines; i++) {
            String tokens[] = bf.readLine().split("\\s+");

            if (tokens.length == 3) {
                Buyer rebel = new Rebel(tokens[0]
                        , Integer.parseInt(tokens[1])
                        , tokens[2]);
                people.add(rebel);
            } else if (tokens.length == 4) {
                Buyer citizen = new Citizen(tokens[0], Integer.parseInt(tokens[1])
                        , tokens[2], tokens[3]);
                people.add(citizen);
            }
        }

        String command = bf.readLine();

        while (!command.equals("End")) {

            for (Buyer buyer : people) {
                if (buyer.getClass() == Citizen.class) {
                    Citizen citizen = Citizen.class.cast(buyer);
                    if (citizen.getName().equals(command)) {
                        citizen.buyFood();
                    }
                } else {
                    Rebel rebel = Rebel.class.cast(buyer);
                    if (rebel.getName().equals(command)) {
                        rebel.buyFood();
                    }

                }
            }

            command = bf.readLine();
        }

        int sum = 0;
        for (Buyer person : people) {
            sum += person.getFood();
        }
        System.out.println(sum);

    }
}
