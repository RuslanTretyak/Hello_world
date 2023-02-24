package by.itacademy.hw11.exceptions;

import java.io.IOException;

public class WrongLoginException extends RuntimeException {
    public WrongLoginException(String message) {
        super(message);
    }
}
