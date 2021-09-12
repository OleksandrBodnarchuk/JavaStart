package pl.alex.javaStart.library.io.file;

import pl.alex.javaStart.library.exceptions.DataExportException;
import pl.alex.javaStart.library.exceptions.DataImportException;
import pl.alex.javaStart.library.model.Library;

import java.io.*;

public class SerializableFileManager implements FileManager {
    private static final String FILE_NAME = "Library.lib";

    @Override
    public Library importData() {
        Library library = null;
        try (var inputStream = new FileInputStream(FILE_NAME);
            var objectInputStream = new ObjectInputStream(inputStream)) {

            library = (Library) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            throw new DataImportException("Brak pliku: " + FILE_NAME);
        } catch (IOException e) {
            throw new DataImportException("B³¹d odczytu pliku " + FILE_NAME);
        } catch (ClassNotFoundException e) {
            throw new DataImportException("Niezgodny typ danych w pliku " + FILE_NAME);
        }
        return library;
    }

    @Override
    public void exportData(Library library) {
        try (var fileOutputStream = new FileOutputStream(FILE_NAME);
             var objectOutputStream = new ObjectOutputStream(fileOutputStream);) {
            objectOutputStream.writeObject(library);
        } catch (FileNotFoundException e) {
            throw new DataExportException("Brak pliku: " + FILE_NAME);
        } catch (IOException e) {
            throw new DataExportException("B³¹d zapisu danych do pliku " + FILE_NAME);
        }
    }
}
