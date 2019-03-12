package Mordor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String tokens[] = bf.readLine().split("\\s+");

        Gandalf gandalf = new Gandalf();
        for (int i = 0; i < tokens.length; i++) {
            if (Foods.contains(tokens[i].toUpperCase())) {
                gandalf.eatFood(Foods.valueOf(tokens[i].toUpperCase()).toString());
            } else {
                gandalf.eatFood(tokens[i]);
            }
        }
        System.out.println(gandalf.getFoodPoints());
        System.out.println(gandalf.getMood());

    }
}
