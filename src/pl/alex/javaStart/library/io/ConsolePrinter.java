package pl.alex.javaStart.library.io;

import pl.alex.javaStart.library.model.Book;
import pl.alex.javaStart.library.model.LibraryUser;
import pl.alex.javaStart.library.model.Magazine;
import pl.alex.javaStart.library.model.Publication;

import java.util.Collection;

public class ConsolePrinter {

    public void printBooks(Collection<Publication> publications) {
        int countBooks = 0;
        for (Publication publication : publications) {
            if (publication instanceof Book) {
                printLine(publication.toString());
                countBooks++;
            }
        }
        if (countBooks == 0) {
            printLine("Brak książek w bibliotece");
        }
    }

    public void printMagazines(Collection<Publication> publications) {
        int countBooks = 0;
        for (Publication publication : publications) {
            if (publication instanceof Magazine) {
                printLine(publication.toString());
                countBooks++;
            }
        }
        if (countBooks == 0) {
            printLine("Brak magazynów w bibliotece");
        }
    }

    public void printUsers(Collection<LibraryUser> users) {
        for (LibraryUser user : users) {
            printLine(user.toString());
        }
    }

    public void printLine (String string){
        System.out.println(string);
    }

}
