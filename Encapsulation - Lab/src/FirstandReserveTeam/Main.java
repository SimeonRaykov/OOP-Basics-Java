package FirstandReserveTeam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Team team = new Team();
        int n = Integer.parseInt(bf.readLine());

        for (int i = 0; i < n; i++) {
            String tokens[] = bf.readLine().split("\\s+");
            try {
                Person person = new Person(tokens[0], tokens[1], Integer.parseInt(tokens[2]), Double.parseDouble(tokens[3]));
                team.addPlayer(person);
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }

        System.out.println("First team have "+team.getFirstTeam().size()+" players");
        System.out.println("Second team have "+team.getReserveTeam().size()+" players");

    }
}
