package pl.alex.javaStart.library;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.title = "W pustyni i w puszczy";
        book1.author = "Henryk Sienkiewicz";
        book1.releaseDate = 2010;
        book1.pages = 296;
        book1.publisher = "Greg";
        book1.isbn = "9788373271890";

        System.out.println(Book.appName);
        System.out.println("Książki dostępne w bibliotece:");
        System.out.println(book1.toString());
    }

}
