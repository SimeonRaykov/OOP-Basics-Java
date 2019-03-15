package birthdayCelebrations;

import birthdayCelebrations.classes.Pet;
import birthdayCelebrations.classes.Robot;
import multipleImplementation.Birthable;
import multipleImplementation.Citizen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        List<Birthable> info = new ArrayList<>();
        String command = bf.readLine();

        while (!command.equals("End")) {
            String tokens[] = command.split("\\s+");

            if (tokens[0].equals("Citizen")) {
                Birthable citizen = new Citizen(tokens[1],
                        Integer.parseInt(tokens[2]), tokens[3]
                        , tokens[4]);
                info.add(citizen);
            } else if (tokens[0].equals("Pet")) {
                Birthable pet = new Pet(tokens[1], tokens[2]);
                info.add(pet);
            } else if (tokens[0].equals("Robot")) {
                Robot robot = new Robot(tokens[1], tokens[2]);
            }

            command = bf.readLine();
        }
        String date = bf.readLine();

        for (Birthable birthable : info) {
            if (birthable.getBirthDate().endsWith(date)) {
                System.out.println(birthable.getBirthDate());
            }
        }

    }
}
