
package GreedyTimes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        long bagSize = Long.parseLong(bf.readLine());

        String tokens[] = bf.readLine().split("\\s+");
        Safe safe = new Safe(bagSize);
        int i = 0;
        while (i < tokens.length) {
            String name = tokens[i];
            int quantity = Integer.parseInt(tokens[i + 1]);
            if (safe.getCapacity() >= safe.getTotalQuantity() + quantity) {
                if (name.length() == 3) {
                    if (safe.getGemQuantity() >= safe.getCashQuantity() + quantity) {
                        safe.addCash(name, quantity);
                    }
                } else if (name.toLowerCase().endsWith("gem") && name.length() >= 4) {
                    if (safe.getGoldQuantity() >= safe.getGemQuantity() + quantity) {
                        safe.addGem(name, quantity);
                    }
                } else if (name.equalsIgnoreCase("gold")) {
                    safe.getGold().increaseGoldQuantity(quantity);
                }
            }

            i += 2;
        }

        if (safe.getGold().getQuantity() >= 0) {
            System.out.println("<Gold>" + " $" + safe.getGold().getQuantity());
            System.out.println("##Gold" + " - " + safe.getGold().getQuantity());

            if (safe.getGems().size() > 0) {
                System.out.println("<Gem> $" + safe.getGemQuantity());
                List<Gem> sortedGems = safe.getGems()
                        .stream()
                        .sorted(Comparator.comparing(Gem::getName)
                                .thenComparing(Gem::getQuantity).reversed())
                        .collect(Collectors.toList());

                for (Gem sortedGem : sortedGems) {
                    System.out.println("##" + sortedGem.getName() + " - " + sortedGem.getQuantity());
                }
                if (safe.getCash().size() > 0) {
                    System.out.println("<Cash> $" + safe.getCashQuantity());
                    List<Cash> sortedCash = safe.getCash()
                            .stream()
                            .sorted(Comparator.comparing(Cash::getName)
                                    .thenComparing(Cash::getQuantity).reversed())
                            .collect(Collectors.toList());
                    for (Cash cash : sortedCash) {
                        System.out.println("##" + cash.getName() + " - " + cash.getQuantity());
                    }
                }
            }
        }

    }
}