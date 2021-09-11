package pl.alex.javaStart.library.model;

import java.util.Objects;

public abstract class Publication {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publication that = (Publication) o;
        return year == that.year && Objects.equals(title, that.title) && Objects.equals(publisher, that.publisher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, publisher, year);
    }
}
