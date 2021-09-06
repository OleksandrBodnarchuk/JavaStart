package pl.alex.javaStart.library.model;

public class Publication {
    private final String title;
    private final int releaseDate;
    private final String publisher;

    public Publication(String title, int releaseDate, String publisher) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public String getPublisher() {
        return publisher;
    }
}
