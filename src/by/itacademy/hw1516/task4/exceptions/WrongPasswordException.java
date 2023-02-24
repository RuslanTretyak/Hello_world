package by.itacademy.hw1516.task4.exceptions;

public class WrongPasswordException extends RuntimeException{
    public WrongPasswordException(String message) {
        super(message);
    }
}
