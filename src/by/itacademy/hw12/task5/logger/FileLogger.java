package by.itacademy.hw12.task5.logger;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FileLogger implements Logger{
    private final File file = new File("./src/by/itacademy/hw12/task5/logger/log.txt");

    @Override
    public void info(String message) {
        writeLogMessage ("INFO", message);
    }

    @Override
    public void warn(String message) {
        writeLogMessage ("WARN", message);
    }

    @Override
    public void error(String message) {
        writeLogMessage ("ERROR", message);
    }
    private void writeLogMessage (String level, String message) {
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(file, true))) {
            printWriter.println("\n" + LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) +
                    " " + level + " - " + message + "\n");
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
