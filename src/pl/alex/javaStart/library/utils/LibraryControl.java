package pl.alex.javaStart.library.utils;

import pl.alex.javaStart.library.model.Library;
import pl.alex.javaStart.library.model.Book;

public class LibraryControl {
    private final static int EXIT = 0;
    private final static int ADD = 1;
    private final static int PRINT = 2;

    private final DataReader dataReader = new DataReader();


    private final Library library = new Library();


    public void controlLoop() {
        int option;

        do {
            printOptions();
            option = dataReader.getInt();
            switch (option) {
                case ADD -> addBook();
                case PRINT -> printBooks();
                case EXIT -> exit();
                default -> System.out.println("Nie ma takiej opcji, wprowadź ponownie: ");
            }
        } while(option != EXIT);
    }

    private void printOptions() {
        System.out.println("Wybierz opcję: ");
        System.out.println(EXIT + " - wyjście z programu");
        System.out.println(ADD + " - dodanie nowej książki");
        System.out.println(PRINT + " - wyświetl dostępne książki");
    }

    private void addBook() {
        Book book = dataReader.getDataAndCreateBook();
        library.addBook(book);
    }

    private void printBooks() {
        library.printBooks();
    }

    private void exit() {
        System.out.println("Koniec programu!");
        dataReader.close();
    }
}
