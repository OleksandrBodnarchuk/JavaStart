package pl.alex.javaStart.library.model;

import java.io.Serial;
import java.util.Objects;

public class Book extends Publication {
    public static final String TYPE = "Książka";
    @Serial
    private static final long serialVersionUID = -4884655256886128446L;
    // Pola
    private final String author;
    private final int pages;
    private final String isbn;

    // Konstruktory
    public Book(String title, String author, int year, int pages, String publisher,
                String isbn) {
        super(title, publisher, year);
        this.pages = pages;
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public String toCsv() {
        return (TYPE + ";") +
                getTitle() + ";" +
                getPublisher() + ";" +
                getYear() + ";" +
                author + ";" +
                pages + ";" +
                isbn + "";
    }

    @Override
    public String toString() {
        return super.getTitle() + ", " + super.getPublisher() + ", " + super.getYear() + ", " + author + ", " + pages + ", " + isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Book book = (Book) o;
        return pages == book.pages &&
                Objects.equals(author, book.author) &&
                Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), author, pages, isbn);
    }

    @Override
    public int compareTo(Publication p) {
        return this.getTitle().compareTo(p.getTitle());
    }
}