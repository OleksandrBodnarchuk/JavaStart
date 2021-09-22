package pl.alex.javaStart.library.app;

import pl.alex.javaStart.library.exceptions.*;
import pl.alex.javaStart.library.io.ConsolePrinter;
import pl.alex.javaStart.library.io.DataReader;
import pl.alex.javaStart.library.io.file.FileManager;
import pl.alex.javaStart.library.io.file.FileManagerBuilder;
import pl.alex.javaStart.library.model.*;
import pl.alex.javaStart.library.model.comparator.AlphabeticalTitleComparator;

import java.util.Collection;
import java.util.Comparator;
import java.util.InputMismatchException;


class LibraryControl {
    private final ConsolePrinter printer = new ConsolePrinter();
    private final DataReader dataReader = new DataReader(printer);
    private final FileManager fileManager;

    private Library library;

    LibraryControl() {
        fileManager = new FileManagerBuilder(printer, dataReader).build();
        try {
            library = fileManager.importData();
            printer.printLine("Zaimportowane dane z pliku");
        } catch (DataImportException | InvalidDataException e) {
            printer.printLine(e.getMessage());
            printer.printLine("Zainicjowano nową bazę.");
            library = new Library();
        }
    }

    void controlLoop() {
        Option option;

        do {
            printOptions();
            option = getOption();
            switch (option) {
                case ADD_BOOK -> addBook();
                case ADD_MAGAZINE -> addMagazine();
                case DELETE_BOOK -> deleteBook();
                case DELETE_MAGAZINE -> deleteMagazine();
                case PRINT_BOOKS -> printBooks();
                case PRINT_MAGAZINES -> printMagazines();
                case ADD_USER -> addUser();
                case PRINT_USERS -> printUsers();
                case EXIT -> exit();
                default -> printer.printLine("Nie ma takiej opcji, wprowadź ponownie: ");
            }
        } while (option != Option.EXIT);
    }

    private void printUsers() {
        Collection<LibraryUser> users = library.getUsers().values();
        printer.printUsers(library.getSortedUsers((o1, o2) -> o1.getSurname().compareToIgnoreCase(o2.getSurname())));
    }

    private void addUser() {
        LibraryUser libraryUser = dataReader.createLibraryUser();
        try {
            library.addUser(libraryUser);
        } catch (UserAlreadyExistsException e) {
            printer.printLine(e.getMessage());
        }
    }

    private void deleteBook() {
        try {
            Book book = dataReader.readAndCreateBook();
            if (library.removePublication(book)) {
                printer.printLine("Usunięto książkę");
            } else
                printer.printLine("Brak wskazanego tytułu");
        } catch (InputMismatchException e) {
            printer.printLine("Nie udało się utworzyć książki, niepoprawne dane");
        }
    }

    private void deleteMagazine() {
        try {
            Magazine magazine = dataReader.readAndCreateMagazine();
            if (library.removePublication(magazine))
                printer.printLine("Usunięto magazyn.");
            else
                printer.printLine("Brak wskazanego magazynu.");
        } catch (InputMismatchException e) {
            printer.printLine("Nie udało się utworzyć magazynu, niepoprawne dane");
        }
    }

    private Option getOption() {
        boolean optionOk = false;
        Option option = null;
        while (!optionOk) {
            try {
                option = Option.createFromInt(dataReader.getInt());
                optionOk = true;
            } catch (NoSuchOptionException e) {
                printer.printLine(e.getMessage() + ", podaj ponownie:");
            } catch (InputMismatchException ignored) {
                printer.printLine("Wprowadzono wartość, która nie jest liczbą, podaj ponownie:");
            }
        }

        return option;
    }

    private void printOptions() {
        printer.printLine("Wybierz opcję: ");
        for (Option option : Option.values()) {
            printer.printLine(option.toString());
        }
    }

    private void addBook() {
        try {
            Book book = dataReader.readAndCreateBook();
            library.addPublication(book);
        } catch (InputMismatchException e) {
            printer.printLine("Nie udało się utworzyć książki, niepoprawne dane");
        } catch (ArrayIndexOutOfBoundsException e) {
            printer.printLine("Osiągnięto limit pojemności, nie można dodać kolejnej książki");
        }
    }

    private void printBooks() {
        printer.printBooks(library.getSortedPublications(new AlphabeticalTitleComparator()));
    }

    private void printMagazines() {
        printer.printMagazines(library.getSortedPublications(new AlphabeticalTitleComparator()));
    }



    private void addMagazine() {
        try {
            Magazine magazine = dataReader.readAndCreateMagazine();
            library.addPublication(magazine);
        } catch (InputMismatchException e) {
            printer.printLine("Nie udało się utworzyć magazynu, niepoprawne dane");
        } catch (ArrayIndexOutOfBoundsException e) {
            printer.printLine("Osiągnięto limit pojemności, nie można dodać kolejnego magazynu");
        }
    }

    private void exit() {
        try {
            fileManager.exportData(library);
            printer.printLine("Export danych do pliku zakończony powodzeniem");
        } catch (DataExportException e) {
            printer.printLine(e.getMessage());
        }
        dataReader.close();
        printer.printLine("Koniec programu, papa!");
    }

    private enum Option {
        EXIT(0, "Wyjście z programu"),
        ADD_BOOK(1, "Dodanie książki"),
        ADD_MAGAZINE(2, "Dodanie magazynu/gazety"),
        DELETE_BOOK(3, "Usuwanie książki"),
        DELETE_MAGAZINE(4, "Usuwanie magazynu/gazety"),
        PRINT_BOOKS(5, "Wyświetlenie dostępnych książek"),
        PRINT_MAGAZINES(6, "Wyświetlenie dostępnych magazynów/gazet"),
        ADD_USER(7, "Dodaj czytelnika"),
        PRINT_USERS(8, "Wyświetl czytelników");


        private final int value;
        private final String description;

        Option(int value, String desc) {
            this.value = value;
            this.description = desc;
        }

        @Override
        public String toString() {
            return value + " - " + description;
        }

        static Option createFromInt(int option) throws NoSuchOptionException {
            try {
                return Option.values()[option];
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new NoSuchOptionException("Brak opcji o id " + option);
            }
        }
    }
}