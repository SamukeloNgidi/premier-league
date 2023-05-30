package league;

import java.util.Arrays;

public class MainClass {

    public static void main(String[] args) {
        /*
        File file = new File("C:\\Users\\MondeJ\\Desktop\\PremierLeague\\input.csv");
        BufferedReader br;
        String str;
        List<String> teams = new ArrayList<>();
        String teamName = "";
        int n = 0;

        try {
            br = new BufferedReader(new FileReader(file));
            while ((str = br.readLine()) != null) {
                //System.out.println(str);
                teams.add(str);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

        //team scores
        var matches = Arrays.asList(
                new Match(Team.TEAM1.getName(), Team.TEAM2.getName(), 0, 2),
                new Match(Team.TEAM2.getName(), Team.TEAM1.getName(), 2, 0),
                new Match(Team.TEAM3.getName(), Team.TEAM4.getName(), 0, 3),
                new Match(Team.TEAM4.getName(), Team.TEAM3.getName(), 6, 0),
                new Match(Team.TEAM5.getName(), Team.TEAM4.getName(), 0, 0),
                new Match(Team.TEAM6.getName(), Team.TEAM7.getName(), 5, 0),
                new Match(Team.TEAM7.getName(), Team.TEAM6.getName(), 7, 0),
                new Match(Team.TEAM8.getName(), Team.TEAM9.getName(), 0, 2),
                new Match(Team.TEAM9.getName(), Team.TEAM8.getName(), 2, 1),
                new Match(Team.TEAM10.getName(), Team.TEAM11.getName(), 1, 3),
                new Match(Team.TEAM11.getName(), Team.TEAM10.getName(), 4, 3),
                new Match(Team.TEAM12.getName(), Team.TEAM4.getName(), 0, 2),
                new Match(Team.TEAM13.getName(), Team.TEAM14.getName(), 0, 8),
                new Match(Team.TEAM14.getName(), Team.TEAM13.getName(), 8, 0),
                new Match(Team.TEAM15.getName(), Team.TEAM4.getName(), 0, 3),
                new Match(Team.TEAM16.getName(), Team.TEAM17.getName(), 0, 7),
                new Match(Team.TEAM17.getName(), Team.TEAM16.getName(), 5, 0),
                new Match(Team.TEAM18.getName(), Team.TEAM4.getName(), 1, 0),
                new Match(Team.TEAM19.getName(), Team.TEAM20.getName(), 2, 0),
                new Match(Team.TEAM20.getName(), Team.TEAM19.getName(), 0, 2)

        );

        //retrieve log entries
        var leagueTable = new LogTable(matches);
        var resultedTableEntries = leagueTable.getTableEntries();

        //print log
        System.out.println("Premier League");
        System.out.println(resultedTableEntries.toString());
    }
}