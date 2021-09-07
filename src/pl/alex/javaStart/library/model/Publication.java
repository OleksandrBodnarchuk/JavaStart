package pl.alex.javaStart.library.model;

public class Publication {
    private final String title;
    private final String publisher;
    private final int year;

    public Publication(String title, String publisher, int releaseDate) {
        this.title = title;
        this.publisher = publisher;
        this.year = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getPublisher() {
        return publisher;
    }
}
