package pl.alex.javaStart.library.model;

import java.io.Serial;
import java.time.MonthDay;
import java.util.Objects;

public class Magazine extends Publication {
    public static final String TYPE = "Magazyn";
    @Serial
    private static final long serialVersionUID = -1923291173538257470L;

    private final MonthDay month;
    private final int day;
    private final String language;

    public Magazine(String title, String publisher,String language, int year, int month, int day) {
        super(title, publisher, year);
        this.month = MonthDay.of(month,day);
        this.day = day;
        this.language = language;
    }

    @Override
    public String toCsv() {
        return (TYPE + ";") +
                getTitle() + ";" +
                getPublisher() + ";" +
                getYear() + ";" +
                month + ";" +
                day + ";" +
                language + "";
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

    @Override
    public int compareTo(Publication p) {
        return this.getTitle().compareTo(p.getTitle());
    }
}
