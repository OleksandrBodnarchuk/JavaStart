package pl.alex.javaStart.library.exceptions;

public class NoSuchFileTypeException extends RuntimeException {
    public NoSuchFileTypeException(String message) {
        super(message);
    }
}
