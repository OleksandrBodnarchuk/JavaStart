package pl.alex.javaStart.library.exceptions;

import java.io.Serial;

public class PublicationAlreadyExistsException extends RuntimeException{
    @Serial
    private static final long serialVersionUID = 4780516346073086342L;

    public PublicationAlreadyExistsException(String message) {
        super(message);
    }
}
