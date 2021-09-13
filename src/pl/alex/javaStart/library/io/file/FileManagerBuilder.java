package pl.alex.javaStart.library.io.file;

import pl.alex.javaStart.library.exceptions.NoSuchFileTypeException;
import pl.alex.javaStart.library.io.ConsolePrinter;
import pl.alex.javaStart.library.io.DataReader;


public class FileManagerBuilder {
    private final ConsolePrinter printer;
    private final DataReader reader;

    public FileManagerBuilder(ConsolePrinter printer, DataReader reader) {
        this.printer = printer;
        this.reader = reader;
    }

    public FileManager build() {
        printer.printLine("Wybierz format");
        FileType fileType = getFileType();
        return switch (fileType) {
            case CSV -> new CsvFileManager();
            case SERIAL -> new SerializableFileManager();
            default -> throw new NoSuchFileTypeException("Nieobs³ugiwany typ danych");
        };
    }

    private FileType getFileType() {
        FileType fileType = null;
        boolean typeOK = false;
        do {
            printTypes();
            String type = reader.getString().toUpperCase();
            try {
                fileType = FileType.valueOf(type);
                typeOK = true;
            } catch (IllegalArgumentException e) {
                printer.printLine("Nieobs³ugiwany typ danych, wybierz ponownie.");
            }
        } while (!typeOK);
        return fileType;
    }

    private void printTypes() {
        for (FileType f : FileType.values()) {
            System.out.println(f.name());
        }
    }
}
