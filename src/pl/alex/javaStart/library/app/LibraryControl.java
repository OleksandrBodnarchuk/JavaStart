package pl.alex.javaStart.library.app;

import pl.alex.javaStart.library.io.DataReader;
import pl.alex.javaStart.library.model.Library;
import pl.alex.javaStart.library.model.Book;
import pl.alex.javaStart.library.model.Magazine;

import static pl.alex.javaStart.library.app.Option.EXIT;

public class LibraryControl {

    private final DataReader dataReader = new DataReader();

    private final Library library = new Library();

    public void controlLoop() {
        Option option;
        do {
            printOptions();
            option = Option.createFromInt(dataReader.getInt());
            switch (option) {
                case ADD_BOOK -> addBook();
                case ADD_MAGAZINE -> addMagazine();
                case PRINT_BOOKS -> printBooks();
                case PRINT_MAGAZINES -> printMagazines();
                case EXIT -> exit();
                default -> System.out.println("Nie ma takiej opcji, wprowadź ponownie: ");
            }
        } while (option != EXIT);
    }

    private void printOptions() {
        System.out.println("Wybierz opcję: ");
      for(Option o: Option.values()){
          System.out.println(o);
      }
    }

    private void addBook() {
        Book book = dataReader.readAndCreateBook();
        library.addBook(book);
    }

    private void printBooks() {
        library.printBooks();
    }

    private void addMagazine() {
        Magazine magazine = dataReader.readAndCreateMagazine();
        library.addMagazine(magazine);
    }

    private void printMagazines() {
        library.printMagazines();
    }

    private void exit() {
        System.out.println("Koniec programu!");
        dataReader.close();
    }
}
