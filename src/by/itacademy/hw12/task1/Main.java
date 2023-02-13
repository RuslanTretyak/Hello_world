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
        writeFile(in1);
        writeFile(in2);
        writeFile(out, sortData(in1, in2));
    }
    public static void writeFile (File file) throws IOException {
        file.createNewFile();
        try (PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(file)))){
            Random rd = new Random();
            for (int i = 0; i < 1000; i++) {
                printWriter.println(rd.nextInt(9999) + 1);
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
    public static void writeFile (File file, List<Integer> list) throws IOException {
        file.createNewFile();
        try (PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(file)))){
            for (Integer ints: list) {
                printWriter.println(ints);
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
    public static List<Integer> sortData (File ...files) throws FileNotFoundException {
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
