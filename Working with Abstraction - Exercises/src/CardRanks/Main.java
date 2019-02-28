package CardRanks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String []enumx = bf.readLine().split(" ");

        for (CardRanks cardRanks : CardRanks.values()) {
            System.out.println("Ordinal value: "+cardRanks.getValue()+"; Name value: "+cardRanks.name().toUpperCase());
        }

    }
}
