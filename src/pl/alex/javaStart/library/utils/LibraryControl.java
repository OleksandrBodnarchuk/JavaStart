package pl.alex.javaStart.library.utils;

import pl.alex.javaStart.library.Library;
import pl.alex.javaStart.library.model.Book;

import java.util.Scanner;

public class LibraryControl {
    // zmienne do kontrolowania programu
    private final int exit = 0;
    private final int addBook = 1;
    private final int printBooks = 2;

    // zmienna do komunikacji z użytkownikiem
    private DataReader dataReader = new DataReader();

    // "biblioteka" przechowująca dane
    private Library library = new Library();

    /*
     * Główna metoda programu, która pozwala na wybór opcji i interakcję
     */
    public void controlLoop() {
        int option;

        do {
            printOptions();
            option = dataReader.getInt();
            switch (option) {
                case addBook:
                    addBook();
                    break;
                case printBooks:
                    printBooks();
                    break;
                case exit:
                    exit();
                    break;
                default:
                    System.out.println("Nie ma takiej opcji, wprowadź ponownie: ");
            }
        } while(option != exit);
    }

    private void printOptions() {
        System.out.println("Wybierz opcję: ");
        System.out.println(exit + " - wyjście z programu");
        System.out.println(addBook + " - dodanie nowej książki");
        System.out.println(printBooks + " - wyświetl dostępne książki");
    }

    private void addBook() {
        Book book = dataReader.getDataAndCreateBook();
        library.addBook(book);
    }

    private void printBooks() {
        library.printBooks();
    }

    private void exit() {
        System.out.println("Koniec programu, papa!");
        // zamykamy strumień wejścia
        dataReader.close();
    }
}
