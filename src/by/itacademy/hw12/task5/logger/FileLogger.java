package by.itacademy.hw12.task5.logger;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FileLogger implements Logger{
    File file = new File("./src/by/itacademy/hw12/task5/logger/log.txt");

    @Override
    public void info(String message) {
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(file, true))) {
            printWriter.println("\n" + LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) +
                    " INFO - " + message + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void warn(String message) {
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(file, true))) {
            printWriter.println("\n" + LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) +
                    " INFO - " + message + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void error(String message) {
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(file, true))) {
            printWriter.println("\n" + LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) +
                    " INFO - " + message + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
