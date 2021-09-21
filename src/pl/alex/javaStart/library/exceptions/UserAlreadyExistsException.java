package pl.alex.javaStart.library.exceptions;

import java.io.Serial;

public class UserAlreadyExistsException extends RuntimeException{
    @Serial
    private static final long serialVersionUID = -7464698023839880904L;

    public UserAlreadyExistsException(String message) {
        super(message);
    }
}
