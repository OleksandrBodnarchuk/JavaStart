package pl.alex.javaStart.lessons.stream.TWO;

import java.util.Objects;

public class MatchResult {
    private final String host;
    private final String guest;
    private final int hostScore;
    private final int guestScore;

    public MatchResult(String host, String guest, int hostScore, int guestScore) {
        this.host = host;
        this.guest = guest;
        this.hostScore = hostScore;
        this.guestScore = guestScore;
    }

    public String getHost() {
        return host;
    }

    public String getGuest() {
        return guest;
    }

    public int getGoalDifference() {
        return hostScore - guestScore;
    }

    public int getHostScore() {
        return hostScore;
    }

    public int getGuestScore() {
        return guestScore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MatchResult that = (MatchResult) o;
        return hostScore == that.hostScore && guestScore == that.guestScore && Objects.equals(host, that.host) && Objects.equals(guest, that.guest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(host, guest, hostScore, guestScore);
    }

    @Override
    public String toString() {
        return host + " - " + guest + " (" + hostScore + ":" + guestScore + ")";
    }

    public boolean containsTeam(String team) {
        return host.equals(team) || guest.equals(team);
    }

    public String[] getTeamNames() {
        return new String[]{host, guest};
    }

    public int getGoalsSum() {
        return hostScore+guestScore;
    }
}
