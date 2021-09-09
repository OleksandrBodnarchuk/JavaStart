package pl.alex.javaStart.lessons.exceptions.competition.exceptions;

public class MaxCompetitorsException extends Exception{
    private final int maxCompetitors;

    public MaxCompetitorsException(int maxCompetitors) {
        this.maxCompetitors = maxCompetitors;
    }

    public int getMaxCompetitors() {
        return maxCompetitors;
    }
}
