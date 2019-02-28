package CardSuit;

import CardSuit.CardSuit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String enums = bf.readLine();
        System.out.println("Card Suits:");
        for (CardSuit cardSuit : CardSuit.values()) {
            System.out.println("Ordinal value: " + cardSuit.getValue() + ";" + " Name value: " + cardSuit.name().toUpperCase());
        }

    }
}
