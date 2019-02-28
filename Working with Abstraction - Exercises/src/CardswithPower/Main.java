package CardswithPower;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String rankPower = bf.readLine();
        String suitPower = bf.readLine();
        Card card = new Card(RankPowers.valueOf(rankPower), SuitPowers.valueOf(suitPower));
        System.out.println("Card name: " + card.getRankPower().name() + " of " + card.getSuitPower().name() + "; Card Power: " + card.getFinalValue());
    }
}
