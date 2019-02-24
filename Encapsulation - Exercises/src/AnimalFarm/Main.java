package AnimalFarm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df = new DecimalFormat("###.#");
        String name = bf.readLine();
        int age = Integer.parseInt(bf.readLine());
        try {
            Chicken chicken = new Chicken(name, age);
            System.out.println("Chicken " + chicken.getName() + " (age " + chicken.getAge() + ")" + " can produce " + df.format(chicken.calcProductPerDay()) + " eggs per day.");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}
