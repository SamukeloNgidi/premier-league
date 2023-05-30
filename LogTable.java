package league;

import java.util.*;
import java.util.stream.Collectors;

public class LogTable {
    private final static int WIN_POINTS = 3;
    private final static int DRAWN_POINTS = 1;
    //private final static int NUMBER_OF_CLUBS = 20;
    //private final static int NUMBER_OF_GAMES = 38;

    private final List<Match> matches;

    public LogTable(final List<Match> matches) {
        this.matches = matches;
    }

    //return table entries
    public List<LogTableEntry> getTableEntries() {
        Map<String, LogTableEntry> leagueTableEntries = new HashMap<>();

        matches.forEach(match -> {
            var homeTeam = getOrCreate(leagueTableEntries, match.getHomeTeam());
            var awayTeam = getOrCreate(leagueTableEntries, match.getAwayTeam());

            homeTeam.addToPlayed();
            awayTeam.addToPlayed();
            calcScores(match, homeTeam, awayTeam);
            calcMatchResult(match, homeTeam, awayTeam);
        });

        return leagueTableEntries.values().stream()
                .sorted(Comparator.comparing(LogTableEntry::getPoints).reversed() //compare points
                        .thenComparing(LogTableEntry::getGoalDifference, Comparator.reverseOrder()) //compare goad diff
                        .thenComparing(LogTableEntry::getGoalsFor, Comparator.reverseOrder()) //compare goals for
                        .thenComparing(LogTableEntry::getTeamName)).collect(Collectors.toList());
    }

    //get or create log entries
    private LogTableEntry getOrCreate(Map<String, LogTableEntry> leagueTableEntries, String teamName) {
        var leagueTableEntry = leagueTableEntries.get(teamName);
        if (leagueTableEntry != null) {
            return leagueTableEntry;
        }

        leagueTableEntries.put(teamName, new LogTableEntry(teamName));
        return leagueTableEntries.get(teamName);
    }

    //calculate scores for home and away
    private void calcScores(Match match, LogTableEntry homeTeam, LogTableEntry awayTeam) {
        homeTeam.addToGoalsFor(match.getHomeScore());
        awayTeam.addToGoalsFor(match.getAwayScore());
        homeTeam.addToGoalsAgainst(match.getAwayScore());
        awayTeam.addToGoalsAgainst(match.getHomeScore());
    }

    //assign points according to win, loose or draw
    private void calcMatchResult(Match match, LogTableEntry homeTeam, LogTableEntry awayTeam) {
        if (match.getHomeScore() > match.getAwayScore()) {
            homeTeam.addToWon();
            homeTeam.addToPoints(WIN_POINTS);
            awayTeam.addToLost();
        } else if (match.getHomeScore() < match.getAwayScore()) {
            homeTeam.addToLost();
            awayTeam.addToWon();
            awayTeam.addToPoints(WIN_POINTS);
        } else {
            homeTeam.addToDrawn();
            homeTeam.addToPoints(DRAWN_POINTS);
            awayTeam.addToDrawn();
            awayTeam.addToPoints(DRAWN_POINTS);
        }
    }
}
