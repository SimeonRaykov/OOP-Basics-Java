package FootballTeamGenerator;

public class Player {

    private String name;
    private Stats stats;


    public Player(String name, Stats stats) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("A name should not be empty.");
        } else {
            this.name = name;
            this.stats = stats;
        }
    }

    public double calcAverageStats(){
      return this.stats.getAllStats()/5.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }
}
