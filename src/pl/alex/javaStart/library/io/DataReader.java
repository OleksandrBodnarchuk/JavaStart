package pl.alex.javaStart.library.io;

import pl.alex.javaStart.library.model.Book;
import pl.alex.javaStart.library.model.Magazine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DataReader {
    private final Scanner sc = new Scanner(System.in);
    private ConsolePrinter consolePrinter;

    public DataReader(ConsolePrinter consolePrinter) {
        this.consolePrinter = consolePrinter;
    }

    public Book readAndCreateBook() {
       consolePrinter.printLine("Tytuł:");
        String title = sc.nextLine();
        consolePrinter.printLine("Autor:");
        String author = sc.nextLine();
        consolePrinter.printLine("Data wydania:");
        int releaseDate = getInt();
        consolePrinter.printLine("Ilość stron:");
        int pages = getInt();
        consolePrinter.printLine("Wydawca:");
        String publisher = sc.nextLine();
        consolePrinter.printLine("ISBN:");
        String isbn = sc.nextLine();
        return new Book(title, publisher, releaseDate, author, pages, isbn);
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
        return new Magazine(title, publisher, year, month, day, language);
    }

    public int getInt() {
        try {
            return sc.nextInt();
        } catch (InputMismatchException e) {
            throw e;
        } finally {
            sc.nextLine();
        }


    }

    public void close() {
        sc.close();
    }

}
