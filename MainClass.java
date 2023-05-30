package league;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {

    private final static int numberOfClubs = 20;
    private final static int numberOfGames = 38;

    public static void main(String[] args) {
        File file = new File("C:\\Users\\MondeJ\\Desktop\\PremierLeague\\input.csv");
        BufferedReader br;
        String str;
        List<String> teams = new ArrayList<>();
        String teamName = "";
        int n = 0;

        /*try {
            br = new BufferedReader(new FileReader(file));
            while ((str = br.readLine()) != null) {
                //System.out.println(str);
                teams.add(str);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for(int i = 0; i < teams.size(); i++) {
        }*/

        var matches = Arrays.asList(
                new Match(Team.TEAM1.getName(), Team.TEAM2.getName(), 0, 2),
                new Match(Team.TEAM2.getName(), Team.TEAM3.getName(), 0, 3),
                new Match(Team.TEAM3.getName(), Team.TEAM4.getName(), 0, 4),
                new Match(Team.TEAM4.getName(), Team.TEAM4.getName(), 0, 4),
                new Match(Team.TEAM5.getName(), Team.TEAM4.getName(), 0, 1),
                new Match(Team.TEAM6.getName(), Team.TEAM4.getName(), 0, 3),
                new Match(Team.TEAM7.getName(), Team.TEAM4.getName(), 1, 3),
                new Match(Team.TEAM8.getName(), Team.TEAM4.getName(), 0, 2),
                new Match(Team.TEAM9.getName(), Team.TEAM4.getName(), 2, 1),
                new Match(Team.TEAM10.getName(), Team.TEAM4.getName(), 1, 3),
                new Match(Team.TEAM11.getName(), Team.TEAM4.getName(), 4, 3),
                new Match(Team.TEAM12.getName(), Team.TEAM4.getName(), 5, 2),
                new Match(Team.TEAM13.getName(), Team.TEAM4.getName(), 4, 2),
                new Match(Team.TEAM14.getName(), Team.TEAM4.getName(), 0, 2),
                new Match(Team.TEAM15.getName(), Team.TEAM4.getName(), 0, 3),
                new Match(Team.TEAM16.getName(), Team.TEAM4.getName(), 2, 5),
                new Match(Team.TEAM17.getName(), Team.TEAM4.getName(), 1, 3),
                new Match(Team.TEAM18.getName(), Team.TEAM4.getName(), 1, 0),
                new Match(Team.TEAM19.getName(), Team.TEAM4.getName(), 0, 1),
                new Match(Team.TEAM20.getName(), Team.TEAM4.getName(), 3, 3)

        );

        var expectedTableEntries = Arrays.asList(
                new LeagueTableEntry(
                        Team.TEAM1.getName(), 4, 4, 0, 0, 12, 5, 7, 12),
                new LeagueTableEntry(
                        Team.TEAM2.getName(), 3, 3, 0, 0, 11, 2, 9, 9),
                new LeagueTableEntry(
                        Team.TEAM3.getName(), 4, 3, 0, 1, 12, 7, 5, 9),
                new LeagueTableEntry(
                        Team.TEAM4.getName(), 4, 3, 0, 1, 8, 5, 3, 9),
                new LeagueTableEntry(
                        Team.TEAM5.getName(), 4, 3, 0, 1, 11, 11, 0, 9),
                new LeagueTableEntry(
                        Team.TEAM6.getName(), 4, 2, 1, 1, 12, 5, 7, 7),
                new LeagueTableEntry(
                        Team.TEAM7.getName(), 4, 2, 1, 1, 10, 6, 4, 7),
                new LeagueTableEntry(
                        Team.TEAM8.getName(), 4, 2, 1, 1, 9, 8, 1, 7),
                new LeagueTableEntry(
                        Team.TEAM9.getName(), 4, 2, 1, 1, 6, 5, 1, 7),
                new LeagueTableEntry(
                        Team.TEAM10.getName(), 4, 2, 0, 2, 8, 4, 4, 6),
                new LeagueTableEntry(
                        Team.TEAM11.getName(), 4, 2, 0, 2, 5, 6, -1, 6),
                new LeagueTableEntry(
                        Team.TEAM12.getName(), 4, 2, 0, 2, 5, 7, -2, 6),
                new LeagueTableEntry(
                        Team.TEAM13.getName(), 4, 2, 0, 2, 4, 7, -3, 6),
                new LeagueTableEntry(
                        Team.TEAM14.getName(), 3, 1, 1, 1, 6, 7, -1, 4),
                new LeagueTableEntry(
                        Team.TEAM15.getName(), 4, 1, 0, 3, 8, 10, -2, 3),
                new LeagueTableEntry(
                        Team.TEAM16.getName(), 3, 1, 0, 2, 5, 11, -6, 3),
                new LeagueTableEntry(
                        Team.TEAM17.getName(), 4, 0, 1, 3, 5, 13, -8, 1),
                new LeagueTableEntry(
                        Team.TEAM18.getName(), 3, 0, 0, 3, 3, 8, -5, 0),
                new LeagueTableEntry(
                        Team.TEAM19.getName(), 4, 0, 0, 4, 1, 6, -5, 0),
                new LeagueTableEntry(
                        Team.TEAM20.getName(), 4, 0, 0, 4, 3, 11, -8, 0)
        );

        var leagueTable = new LeagueTable(matches);
        var resultedTableEntries = leagueTable.getTableEntries();

        System.out.println("Premier League");
        System.out.println("Ranking" + "\t" + "team name" + "\t" + "Games Played" + "\t" + "Games Won" + "\t" + "Games Drawn" +
                           "Games Lost" + "\t" + "Goals For" + "\t" + "Goals Against" + "\t" + "Goal Difference" + "\t" + "Points");
        System.out.println(Arrays.asList(resultedTableEntries));
    }
}