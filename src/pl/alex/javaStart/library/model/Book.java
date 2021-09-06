package pl.alex.javaStart.library.model;

public class Book extends Publication {
    private final String author;
    private final int pages;
    private final String isbn;

    public Book(String title, int releaseDate, String publisher, String author, int pages, String isbn) {
        super(title, releaseDate, publisher);
        this.author = author;
        this.pages = pages;
        this.isbn = isbn;
    }

    public void printInfo() {
        System.out.println(
                this.author + " " + getTitle() + " " + getReleaseDate() + " " + getPublisher() + " " + this.pages + " " + this.isbn
        );
    }


}
