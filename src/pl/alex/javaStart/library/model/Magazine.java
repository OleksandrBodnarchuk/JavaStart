package pl.alex.javaStart.library.model;

import java.util.Objects;

public class Magazine extends Publication {
    private final int month;
    private final int day;
    private final String language;

    public Magazine(String title, String publisher, int year, int month, int day, String language) {
        super(title, publisher, year);
        this.month = month;
        this.day = day;
        this.language = language;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Magazine magazine = (Magazine) o;
        return month == magazine.month && day == magazine.day && Objects.equals(language, magazine.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(month, day, language);
    }

    @Override
    public String toString() {
        return super.getTitle() + " " + super.getPublisher() + " " + super.getYear() + " " + this.day + " " + this.month + " " + this.language;
    }
}
