package pl.alex.javaStart.lessons.exceptions.calculator;

public class UnknownOperationException extends RuntimeException{
    public UnknownOperationException(String message) {
        super(message);
    }
}
