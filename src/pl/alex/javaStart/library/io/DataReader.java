package pl.alex.javaStart.library.io;

import pl.alex.javaStart.library.model.Book;
import pl.alex.javaStart.library.model.Magazine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DataReader {
    private final Scanner sc = new Scanner(System.in);
    private final ConsolePrinter consolePrinter;

    public DataReader(ConsolePrinter consolePrinter) {
        this.consolePrinter = consolePrinter;
    }

    public Book readAndCreateBook() {
        consolePrinter.printLine("Tytuł:");
        String title = getString();
        consolePrinter.printLine("Autor:");
        String author = getString();
        consolePrinter.printLine("Data wydania:");
        int releaseDate = getInt();
        consolePrinter.printLine("Ilość stron:");
        int pages = getInt();
        consolePrinter.printLine("Wydawca:");
        String publisher = getString();
        consolePrinter.printLine("ISBN:");
        String isbn = getString();
        return new Book(title, publisher, releaseDate, author, pages, isbn);
    }

    public Magazine readAndCreateMagazine() {
        System.out.println("Tytuł: ");
        String title = getString();
        System.out.println("Wydawnictwo: ");
        String publisher = getString();
        System.out.println("Język: ");
        String language = getString();
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

    public String getString(){
        return sc.nextLine();
    }

    public void close() {
        sc.close();
    }

}
