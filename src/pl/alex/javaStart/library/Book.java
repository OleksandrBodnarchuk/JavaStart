package pl.alex.javaStart.library;

public class Book {
    public static void main(String[] args) {
        final String appName = "Library v1.0.0";
        String isbn = "9788373271890";
        String title ="W pustyni i w puszczy";
        String author = "Henryk Sienkiewicz";
        int releaseYear = 1910;
        int pageNumber = 384;
        String publisher = "Wydawnictwo Olesiejuk S.p. z o.o.";

        System.out.println(appName);
        System.out.println("Książki dostępne w bibliotece:");
        System.out.println(title);
        System.out.println(author);
        System.out.println(releaseYear);
        System.out.println(pageNumber);
        System.out.println(publisher);
        System.out.println(isbn);
    }
}
