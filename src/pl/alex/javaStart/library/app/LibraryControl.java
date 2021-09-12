package pl.alex.javaStart.library.app;

import pl.alex.javaStart.library.exceptions.NoSuchOptionException;
import pl.alex.javaStart.library.io.ConsolePrinter;
import pl.alex.javaStart.library.io.DataReader;
import pl.alex.javaStart.library.model.Library;
import pl.alex.javaStart.library.model.Book;
import pl.alex.javaStart.library.model.Magazine;
import pl.alex.javaStart.library.model.Publication;


import java.util.InputMismatchException;



public class LibraryControl {
    private final ConsolePrinter consolePrinter = new ConsolePrinter();
    private final DataReader dataReader = new DataReader(consolePrinter);
    private final Library library = new Library();

    public void controlLoop() {
        Option option;
            do {
                printOptions();
                option = getOption();

                switch (option) {
                    case ADD_BOOK -> addBook();
                    case ADD_MAGAZINE -> addMagazine();
                    case PRINT_BOOKS -> printBooks();
                    case PRINT_MAGAZINES -> printMagazines();
                    case EXIT -> exit();
                    default -> consolePrinter.printLine("Nie ma takiej opcji, wprowadź ponownie: ");
                }
            } while (option != Option.EXIT);

    }

    private Option getOption(){
        boolean optionIsOk = false;
        Option option =null;
        while (!optionIsOk){
            try {
                option = Option.createFromInt(dataReader.getInt());
                optionIsOk = true;
            }catch (NoSuchOptionException e){
                consolePrinter.printLine(e.getMessage()+", podaj ponownie.");
            } catch (InputMismatchException e){
                consolePrinter.printLine("Wprowadzono wartość, która nie jest liczbą, podaj ponownie");
            }
        }
        return option;
    }

    private void printOptions() {
        System.out.println("Wybierz opcję: ");
        for (Option o : Option.values()) {
            System.out.println(o);
        }
    }

    private void addBook() {
        try{
            Book book = dataReader.readAndCreateBook();
            library.addBook(book);
        }catch (InputMismatchException e){
            consolePrinter.printLine("Nie udało się utworzyć książki, niepoprawne dane.");
        } catch (ArrayIndexOutOfBoundsException e){
            consolePrinter.printLine("Osiągnięto limit publikacji w bibliotece.");
        }
    }

    private void printBooks() {
        Publication[] publications = library.getPublications();
        consolePrinter.printBooks(publications);
    }

    private void addMagazine() {
        try{
            Magazine magazine = dataReader.readAndCreateMagazine();
            library.addMagazine(magazine);
        }catch (InputMismatchException e){
            consolePrinter.printLine("Nie udało się utworzyć magazynu, niepoprawne dane.");
        } catch (ArrayIndexOutOfBoundsException e){
            consolePrinter.printLine("Osiągnięto limit publikacji w bibliotece.");
        }
    }

    private void printMagazines() {
        Publication[] publications = library.getPublications();
        consolePrinter.printMagazines(publications);
    }

    private void exit() {
        System.out.println("Koniec programu!");
        dataReader.close();
    }

    private enum Option {
        EXIT(0, "Wyjście z programu"),
        ADD_BOOK(1, "Dodanie książki"),
        ADD_MAGAZINE(2, "Dodanie magazynu/gazety"),
        PRINT_BOOKS(3, "Wyświetlenie dostępnych książek"),
        PRINT_MAGAZINES(4, "WYświetlenie dostępnych magazynów/gazet");

        private final int value;
        private final String description;


        Option(int value, String description) {
            this.value = value;
            this.description = description;
        }

        @Override
        public String toString() {
            return value + " - " + description;
        }

        public static Option createFromInt(int option) throws NoSuchOptionException{
            try {
                return Option.values()[option];
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new NoSuchOptionException("Brak opcji o ID: " + option);
            }
        }
    }

}
