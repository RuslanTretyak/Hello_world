package by.itacademy.hw12.task3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("./src/by/itacademy/hw12/task3/binaryFile.bin");
        writeBinaryFile(file);
        printNumbersAndAverage(file);
    }
    public static void writeBinaryFile (File file) {
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.getStackTrace();
        }
        try (DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) {
            Random rd = new Random();
            for (int i = 0; i < 30; i++) {
                dataOutputStream.writeInt(rd.nextInt(99) + 1);
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
    public static void printNumbersAndAverage (File file) {
        List<Integer> list = new ArrayList<>();
        try (DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(file)))) {
            while (true) {
                try {
                    list.add(dataInputStream.readInt());
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
        System.out.println("числа в файле: " + list);
        int sum = 0;
        for (Integer ints: list) {
            sum += ints;
        }
        double average = (double)sum/list.size();
        System.out.printf("среднее арифметическое: %.3f", average);
    }
}
