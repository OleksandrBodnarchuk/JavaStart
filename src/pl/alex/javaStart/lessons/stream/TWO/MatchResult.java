package pl.alex.javaStart.lessons.stream.TWO;

public class MatchResult {
    private final String host;
    private final String guest;
    private final int ourScore;
    private final int opponentScore;

    public MatchResult(String host, String guest, int ourScore, int opponentScore) {
        this.host = host;
        this.guest = guest;
        this.ourScore = ourScore;
        this.opponentScore = opponentScore;
    }

    public String getHost() {
        return host;
    }

    public String getGuest() {
        return guest;
    }

    public int getGoalDifference() {
        return ourScore - opponentScore;
    }

    public int getOurScore() {
        return ourScore;
    }

    public int getOpponentScore() {
        return opponentScore;
    }

    @Override
    public String toString() {
        return host + " - " + guest + " (" + ourScore + " : " + opponentScore + ")";
    }
    String[] getTeamNames() {
        return new String[] {host, guest};
    }

    int getGoalsSum() {
        return ourScore + opponentScore;
    }
    public boolean containsTeam(String teamName) {
        return host.equals(teamName) || guest.equals(teamName);
    }
}
