package by.itacademy.hw12.task5.logger;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ConsoleLogger implements Logger{
    @Override
    public void info(String message) {
        System.out.println("\n" + LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) +
                " INFO - " + message + "\n");
    }

    @Override
    public void warn(String message) {
        System.out.println("\n" + LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) +
                " WARN - " + message + "\n");
    }

    @Override
    public void error(String message) {
        System.out.println("\n" + LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) +
                " ERROR - " + message + "\n");
    }
}
