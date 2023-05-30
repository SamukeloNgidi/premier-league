package league;

public class LogTableEntry {

    private String teamName;
    private int played;
    private int won;
    private int drawn;
    private int lost;
    private int goalsFor;
    private int goalsAgainst;
    private int goalDifference;
    private int points;

    public LogTableEntry(final String teamName) {
        this.teamName = teamName;
    }

    public LogTableEntry(String teamName, int played, int won, int drawn, int lost, int goalsFor, int goalsAgainst, int goalDifference, int points) {
        this.teamName = teamName;
        this.played = played;
        this.won = won;
        this.drawn = drawn;
        this.lost = lost;
        this.goalsFor = goalsFor;
        this.goalsAgainst = goalsAgainst;
        this.goalDifference = goalDifference;
        this.points = points;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getPlayed() {
        return played;
    }

    public void addToPlayed() {
        this.played++;
    }

    public int getWon() {
        return won;
    }

    public void addToWon() {
        this.won++;
    }

    public int getDrawn() {
        return drawn;
    }

    public void addToDrawn() {
        this.drawn++;
    }

    public int getLost() {
        return lost;
    }

    public void addToLost() {
        this.lost++;
    }

    public int getGoalsFor() {
        return goalsFor;
    }

    public void addToGoalsFor(int goalsFor) {
        this.goalsFor += goalsFor;
    }

    public int getGoalsAgainst() {
        return goalsAgainst;
    }

    public void addToGoalsAgainst(int goalsAgainst) {
        this.goalsAgainst += goalsAgainst;
    }

    public int getGoalDifference() {
        return goalsFor - goalsAgainst;
    }

    public int getPoints() {
        return points;
    }

    public void addToPoints(int points) {
        this.points += points;
    }

    //format the output
    @Override
    public String toString() {
        return "\t" + "Team Name: " + this.teamName + "\t" + "Games Played: " + this.played + "\t" +"Games Won: " + this.won + "\t" +
                "Games Drawn: " + this.drawn + "\t" + "Games Lost: " + this.lost + "\t" + "Goals For: " + this.goalsFor + "\t" +
                "Goals Against: " + this.goalsAgainst + "\t" + "Goal Difference: " + this.goalDifference + "\t" + "Points: " + points +
                "\n";
    }

}
