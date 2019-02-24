package FootballTeamGenerator;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class FootballTeam {

    private String name;
    private List<Player> players;
    private int rating;

    public FootballTeam(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("A name should not be empty.");
        } else {
            this.name = name;
            this.rating = 0;
            this.players = new ArrayList<>();
        }
    }

    public void calcAverageRating() {
        DecimalFormat df = new DecimalFormat("0.#####");
        double ratingX = 0.0;
        for (Player player : players) {
            ratingX += player.calcAverageStats();
        }
        String resultInStr = df.format(Math.round(ratingX / players.size()));
        this.rating = Integer.parseInt(resultInStr);
    }

    public void addPlayer(Player player) {
        if (this.containsPlayer(player.getName())) {
            throw new IllegalArgumentException("Player already exists in the team.");
        } else {
            this.players.add(player);
            calcAverageRating();
        }
    }

    public void removePlayer(String player) {
        if (!this.containsPlayer(player)) {
            throw new IllegalArgumentException("Player " + player + " is not in " + this.getName() + " team.");
        } else {
            for (Player player1 : players) {
                if (player1.getName().equals(player)) {
                    this.players.remove(player1);
                    calcAverageRating();
                    break;
                }
            }
        }
    }

    public boolean containsPlayer(String player) {
        for (Player player1 : players) {
            if (player1.getName().equals(player)) {
                return true;
            }
        }
        return false;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
