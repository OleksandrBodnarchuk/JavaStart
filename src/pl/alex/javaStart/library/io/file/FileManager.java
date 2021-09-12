package pl.alex.javaStart.library.io.file;

import pl.alex.javaStart.library.model.Library;

public interface FileManager {
    Library importData();
    void exportData(Library library);
}
