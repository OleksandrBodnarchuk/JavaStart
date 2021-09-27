package pl.alex.javaStart.library.io.file;

import pl.alex.javaStart.library.exceptions.DataExportException;
import pl.alex.javaStart.library.exceptions.DataImportException;
import pl.alex.javaStart.library.exceptions.InvalidDataException;
import pl.alex.javaStart.library.model.*;

import java.io.*;
import java.util.Collection;


public class CsvFileManager implements FileManager {
    private final static String FILE_NAME = "Library.csv";
    private final static String USERS_FILE_NAME = "Users.csv";


    @Override
    public void exportData(Library library) {
        exportPublications(library);
        exportUsers(library);
    }

    private void exportUsers(Library library) {
        Collection<LibraryUser> users = library.getUsers().values();
        exportToCsv(users, USERS_FILE_NAME);
    }

    private void exportPublications(Library library) {
        Collection<Publication> publications = library.getPublications().values();
        exportToCsv(publications, FILE_NAME);
    }

    private <T extends CsvConvertible> void exportToCsv(Collection<T> collection, String fileName) {
        try (var fileWriter = new FileWriter(fileName);
             var writer = new BufferedWriter(fileWriter)) {
            for (T object : collection) {
                writer.write(object.toCsv());
                writer.newLine();
            }

        } catch (IOException e) {
            throw new DataExportException("Błąd zapisu danych do pliku " + fileName);
        }
    }

    @Override
    public Library importData() {
        Library library = new Library();
        importPublications(library);
        importUsers(library);
        return library;
    }

    private void importUsers(Library library) {
        try (BufferedReader reader = new BufferedReader(new FileReader(USERS_FILE_NAME))) {
            reader.lines()
                    .map(this::createUserFromString)
                    .forEach(library::addUser);
        } catch (FileNotFoundException e) {
            throw new DataImportException("Brak pliku: " + USERS_FILE_NAME);
        } catch (IOException e) {
            throw new DataImportException("Brak odczytu pliku: " + USERS_FILE_NAME);
        }
    }


    private void importPublications(Library library) {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            reader.lines()
                    .map(this::createObjectFromString)
                    .forEach(library::addPublication);
        } catch (FileNotFoundException e) {
            throw new DataImportException("Brak pliku: " + FILE_NAME);
        } catch (IOException e) {
            throw new DataImportException("Brak odczytu pliku: " + FILE_NAME);
        }
    }

    private LibraryUser createUserFromString(String line) {
        String[] split = line.split(";");
        return new LibraryUser(split[0], split[1], split[2]);

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
