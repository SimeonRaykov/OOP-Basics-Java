package FirstandReserveTeam;

import java.util.ArrayList;

public class Team {

    private ArrayList<Person> firstTeamPlayers;
    private ArrayList<Person> reserveTeamPlayers;

    public Team() {
        this.firstTeamPlayers = new ArrayList<Person>();
        this.reserveTeamPlayers = new ArrayList<Person>();
    }

    public void addPlayer(Person player) {
        if (player.getAge() < 40) {
            this.firstTeamPlayers.add(player);
        } else {
            this.reserveTeamPlayers.add(player);
        }
    }

    public ArrayList<Person> getFirstTeam() {
        return firstTeamPlayers;
    }

    public void setFirstTeam(ArrayList<Person> firstTeamPlayers) {
        this.firstTeamPlayers = firstTeamPlayers;
    }

    public ArrayList<Person> getReserveTeam() {
        return this.reserveTeamPlayers;
    }

    public void setReserveTeam(ArrayList<Person> reserveTeamPlayers) {
        this.reserveTeamPlayers = reserveTeamPlayers;
    }
}
