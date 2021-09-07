package pl.alex.javaStart.library.model;

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
    public void printInfo() {
        System.out.println(
                this.author + " " + getTitle() + " " + getYear() + " " + getPublisher() + " " + this.pages + " " + this.isbn
        );
    }


}
