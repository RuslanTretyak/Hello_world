package by.itacademy.hw12.task1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        File in1 = new File("./src/by/itacademy/hw12/task1/in1.txt");
        File in2 = new File("./src/by/itacademy/hw12/task1/in2.txt");
        File out = new File("./src/by/itacademy/hw12/task1/out.txt");
        writeFileIn(in1);
        writeFileIn(in2);
        writeFileOut(out, sortData(in1, in2));
    }
    private static void writeFileIn (File file) throws IOException {
        List<String> randomInts= new ArrayList<>();
        Random rd = new Random();
        for (int i = 0; i < 1000; i++) {
            randomInts.add(String.valueOf(rd.nextInt(9999) + 1));
        }
        writeFile(file, randomInts);
    }
    private static void writeFileOut (File file, List<Integer> list) throws IOException {
        List<String> sortedInts= new ArrayList<>();
        for (Integer ints: list) {
            sortedInts.add(String.valueOf(ints));
        }
        writeFile(file, sortedInts);
    }
    private static void writeFile(File file, List<String> list) throws IOException {
        file.createNewFile();
        try (FileWriter printWriter = new FileWriter(file)){
            printWriter.write(String.join("\n", list));
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
    private static List<Integer> sortData (File ...files) throws FileNotFoundException {
        List<Integer> list = new ArrayList<>();
        for (File file : files) {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file));) {
                String buffer = bufferedReader.readLine();
                while (buffer != null) {
                    list.add(Integer.parseInt(buffer));
                    buffer = bufferedReader.readLine();
                }
            } catch (IOException e) {
                e.getStackTrace();
            }
        }
        Collections.sort(list);
        return list;
    }
}
