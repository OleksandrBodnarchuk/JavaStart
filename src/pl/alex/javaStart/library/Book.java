package pl.alex.javaStart.library;

public class Book {
    static String appName = "Library v1.0.0";


    String title;
    String author;
    int releaseDate;
    int pages;
    String publisher;
    String isbn;

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", releaseDate=" + releaseDate +
                ", pages=" + pages +
                ", publisher='" + publisher + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
