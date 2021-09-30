package pl.alex.javaStart.library.io;

import pl.alex.javaStart.library.model.*;

import java.util.Collection;

public class ConsolePrinter {

    public void printBooks(Collection<Publication> publications) {
        long countBooks = publications.stream()
                .filter(publication -> publication instanceof Book)
                .map(Publication::toString)
                .peek(this::printLine)
                .count();
        if (countBooks == 0) {
            printLine("Brak książek w bibliotece");
        }
    }

    public void printMagazines(Collection<Publication> publications) {
        long countBooks = publications.stream()
                .filter(publication -> publication instanceof Magazine)
                .map(Publication::toString)
                .peek(this::printLine)
                .count();

        if (countBooks == 0) {
            printLine("Brak magazynów w bibliotece");
        }
    }

    public void printUsers(Collection<LibraryUser> users) {
        users.stream()
                .map(User::toString)
                .forEach(this::printLine);
    }

    public void printLine(String string) {
        System.out.println(string);
    }

}
