package FootballTeamGenerator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String command = bf.readLine();
        HashMap<String, FootballTeam> footballTeams = new HashMap<>();

        while (!command.equals("END")) {

            String[] tokens = command.split(";");

            //Add team
            if (tokens.length == 2 && tokens[0].equals("Team")) {

                try {
                    FootballTeam footballTeam = new FootballTeam(tokens[1]);
                    footballTeams.putIfAbsent(tokens[1], footballTeam);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

            }
            //Rating of a team
            else if (tokens.length == 2 && tokens[0].equals("Rating")) {
                DecimalFormat decimalFormat = new DecimalFormat("0.#####");
                if (!footballTeams.containsKey(tokens[1])) {
                    System.out.println("Team " + tokens[1] + " does not exist.");
                } else {
                    System.out.println(footballTeams.get(tokens[1]).getName()+" - "+decimalFormat.format(footballTeams.get(tokens[1]).getRating()));
                }
            }
            //Add player to a team
            else if (tokens.length == 8 && tokens[0].equals("Add")) {
                try {
                    Stats stats = new Stats(Integer.parseInt(tokens[3])
                            , Integer.parseInt(tokens[4])
                            , Integer.parseInt(tokens[5])
                            , Integer.parseInt(tokens[6])
                            , Integer.parseInt(tokens[7]));
                    Player player = new Player(tokens[2], stats);

                    if (!footballTeams.containsKey(tokens[1])) {
                        System.out.println("Team " + tokens[1] + " does not exist.");
                    }
                    footballTeams.get(tokens[1]).addPlayer(player);

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            //Remove player from a team
            else if (tokens.length == 3 && tokens[0].equals("Remove")) {
                if (!footballTeams.containsKey(tokens[1])) {
                    System.out.println("Team " + tokens[1] + " does not exist.");
                } else {
                    try {
                        footballTeams.get(tokens[1]).removePlayer(tokens[2]);
                    }
                    catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                }

            }

            command = bf.readLine();
        }


    }
}
