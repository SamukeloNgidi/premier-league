package league;

//teams enum
public enum Team {
    TEAM1("Team 1"),
    TEAM2("Team 2"),
    TEAM3("Team 3"),
    TEAM4("Team 4"),
    TEAM5("Team 5"),
    TEAM6("Team 6"),
    TEAM7("Team 7"),
    TEAM8("Team 8"),
    TEAM9("Team 9"),
    TEAM10("Team 10"),
    TEAM11("Team 11"),
    TEAM12("Team 12"),
    TEAM13("Team 13"),
    TEAM14("Team 14"),
    TEAM15("Team 15"),
    TEAM16("Team 16"),
    TEAM17("Team 17"),
    TEAM18("Team 18"),
    TEAM19("Team 19"),
    TEAM20("Team 20");

    private String name;

    Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
