package pl.alex.javaStart.library.model;

public class Book {
    static String appName = "Library v1.0.0";
    String title;
    String author;
    int releaseDate;
    int pages;
    String publisher;
    String isbn;

    public Book(String title, String author, int releaseDate, int pages, String publisher, String isbn) {
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.pages = pages;
        this.publisher = publisher;
        this.isbn = isbn;
    }

   public void printInfo(){
        System.out.println(this);
    }

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
