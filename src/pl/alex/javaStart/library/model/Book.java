package pl.alex.javaStart.library.model;

import java.util.Objects;

public class Book extends Publication {
    private final String author;
    private final int pages;
    private final String isbn;

    public Book(String title, String publisher, int year, String author, int pages, String isbn) {
        super(title, publisher, year);
        this.author = author;
        this.pages = pages;
        this.isbn = isbn;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pages == book.pages && Objects.equals(author, book.author) && Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, pages, isbn);
    }

    @Override
    public String toString() {
        return super.getTitle() + " " + this.author + " " + super.getPublisher() + " " + this.pages + "pages " + super.getYear() + " " + this.isbn;
    }
}
