package FootballTeamGenerator;

public class Stats {

    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Stats(int endurance, int sprint, int dribble, int passing, int shooting) {
        if (endurance < 0 || endurance > 100) {
            throw new IllegalArgumentException("Endurance should be between 0 and 100.");
        } else {
            if (sprint < 0 || sprint > 100) {
                throw new IllegalArgumentException("Sprint should be between 0 and 100.");
            } else {
                if (dribble < 0 || dribble > 100) {
                    throw new IllegalArgumentException("Dribble should be between 0 and 100.");
                } else {
                    if (passing < 0 || passing > 100) {
                        throw new IllegalArgumentException("Passing should be between 0 and 100.");
                    } else {
                        if (shooting < 0 || shooting > 100) {
                            throw new IllegalArgumentException("Shooting should be between 0 and 100.");
                        } else {
                            this.endurance = endurance;
                            this.sprint = sprint;
                            this.dribble = dribble;
                            this.passing = passing;
                            this.shooting = shooting;
                        }

                    }

                }

            }
        }

    }

    public double getAllStats(){
        return this.getDribble()
                +this.getEndurance()
                +this.getShooting()
                +this.getPassing()
                +this.getSprint();

    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public int getSprint() {
        return sprint;
    }

    public void setSprint(int sprint) {
        this.sprint = sprint;
    }

    public int getDribble() {
        return dribble;
    }

    public void setDribble(int dribble) {
        this.dribble = dribble;
    }

    public int getPassing() {
        return passing;
    }

    public void setPassing(int passing) {
        this.passing = passing;
    }

    public int getShooting() {
        return shooting;
    }

    public void setShooting(int shooting) {
        this.shooting = shooting;
    }

}
