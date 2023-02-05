package by.itacademy.hw11.exceptions;

import java.io.IOException;

public class WrongLoginException extends Exception {
    public WrongLoginException(String message) {
        super(message);
    }
}
