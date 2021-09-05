package pl.alex.javaStart.lessons.encapsulation.Excercise2.model;

public class Movie {
    private final String type;
    private final String title;
    private int freeSeats;
    private final int movieTime;
    private final int ageRequired;
    private final int maxSeats;

    public Movie(String type, String title, int freeSeats, int movieTime, int ageRequired, int maxSeats) {
        this.type = type;
        this.title = title;
        this.freeSeats = freeSeats;
        this.movieTime = movieTime;
        this.ageRequired = ageRequired;
        this.maxSeats = maxSeats;
    }

    public String getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }


    public int getFreeSeats() {
        return freeSeats;
    }

    public int getMovieTime() {
        return movieTime;
    }

    public int getAgeRequired() {
        return ageRequired;
    }


    public int getMaxSeats() {
        return maxSeats;
    }


    public boolean hasFreeSeats() {
        return freeSeats > 0;
    }

    public void decreaseFreeSeats() {
        freeSeats--;
    }

    public String getFullInfo() {
        return title + " - " + type +
                " - " + movieTime + "min";
    }

    public int getSoldTicketCount() {
        return maxSeats - freeSeats;
    }
}
