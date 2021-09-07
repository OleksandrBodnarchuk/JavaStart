package pl.alex.javaStart.library.model;

public class Publication {
    private final String title;
    private final String publisher;
    private final int year;

    Publication(String title, String publisher, int year) {
        this.title = title;
        this.publisher = publisher;
        this.year = year;
    }

    int getYear() {
        return year;
    }

    String getTitle() {
        return title;
    }


    String getPublisher() {
        return publisher;
    }



    public void printInfo() {
    }
}
