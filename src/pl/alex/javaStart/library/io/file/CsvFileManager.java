package pl.alex.javaStart.library.io.file;

import pl.alex.javaStart.library.exceptions.DataExportException;
import pl.alex.javaStart.library.exceptions.DataImportException;
import pl.alex.javaStart.library.exceptions.InvalidDataException;
import pl.alex.javaStart.library.model.Book;
import pl.alex.javaStart.library.model.Library;
import pl.alex.javaStart.library.model.Magazine;
import pl.alex.javaStart.library.model.Publication;

import java.io.*;
import java.util.Scanner;

public class CsvFileManager implements FileManager {
    private final static String FILE_NAME = "Library.csv";


    @Override
    public void exportData(Library library) {
        Publication[] publications = library.getPublications();
        try (var writer = new FileWriter(FILE_NAME);
             var file = new BufferedWriter(writer)) {
            for (Publication publication : publications) {
                file.write(publication.toCsv());
                file.newLine();
            }
    } catch(
    IOException e)

    {
        throw new DataExportException("B³¹d pod czas zapisu do pliku.");
    }

}

    @Override
    public Library importData() {
        Library library = new Library();
        try (Scanner scanner = new Scanner(new File(FILE_NAME))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                Publication publication = createObjectFromString(line);
                library.addPublication(publication);
            }
        } catch (FileNotFoundException e) {
            throw new DataImportException("Brak pliku: " + FILE_NAME);
        }
        return library;
    }

    private Publication createObjectFromString(String line) {
        String[] split = line.split(";");
        String type = split[0];
        if (Book.TYPE.equals(type)) {
            return createBook(split);
        }
        if (Magazine.TYPE.equals(type)) {
            return createMagazine(split);
        }
        throw new InvalidDataException("Nieznany typ publicacji");
    }

    private Publication createMagazine(String[] split) {
        String title = split[1];
        String publisher = split[2];
        int year = Integer.parseInt(split[3]);
        int month = Integer.parseInt(split[4]);
        int day = Integer.parseInt(split[5]);
        String language = split[6];
        return new Magazine(title, publisher, language, year, month, day);
    }

    private Publication createBook(String[] split) {
        String title = split[1];
        String publisher = split[2];
        int year = Integer.parseInt(split[3]);
        String author = split[4];
        int pages = Integer.parseInt(split[5]);
        String isbn = split[6];
        return new Book(title, author, year, pages, publisher, isbn);
    }


}
