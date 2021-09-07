package pl.alex.javaStart.library.io;

import pl.alex.javaStart.library.model.Book;
import pl.alex.javaStart.library.model.Magazine;

import java.util.Scanner;

public class DataReader {
    private final Scanner sc = new Scanner(System.in);

    public Book readAndCreateBook(){
        System.out.println("Title:");
        String title = sc.nextLine();
        System.out.println("Author:");
        String author = sc.nextLine();
        System.out.println("Release date:");
        int releaseDate = getInt();
        System.out.println("Number of pages:");
        int pages = getInt();
        System.out.println("Publisher:");
        String publisher = sc.nextLine();
        System.out.println("ISBN:");
        String isbn = sc.nextLine();
        return new Book(title,publisher,releaseDate,author,pages,isbn);
    }

    public Magazine readAndCreateMagazine() {
        System.out.println("Tytuł: ");
        String title = sc.nextLine();
        System.out.println("Wydawnictwo: ");
        String publisher = sc.nextLine();
        System.out.println("Język: ");
        String language = sc.nextLine();
        System.out.println("Rok wydania: ");
        int year = getInt();
        System.out.println("Miesiąc: ");
        int month = getInt();
        System.out.println("Dzień: ");
        int day = getInt();
        return new Magazine(title, publisher,year, month, day, language);
    }

    public int getInt() {
        int number = sc.nextInt();
        sc.nextLine();
        return number;
    }
    public void close() {
        sc.close();
    }

}
