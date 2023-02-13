package by.itacademy.hw12.task4;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Person person1 = new Person("Иван", "Иванов", 25);
        Person person2 = new Person("Петр", "Петров", 28);
        Person person3 = new Person("Сергей", "Сергеев", 30);
        Person person4 = new Person("Алексей", "Сергеев", 35);
        Person person5 = new Person("Сергей", "Аркадьев", 40);

        File file = new File("./src/by/itacademy/hw12/task4", "people.txt");
        file.createNewFile();
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            objectOutputStream.writeObject(person1);
            objectOutputStream.writeObject(person2);
            objectOutputStream.writeObject(person3);
            objectOutputStream.writeObject(person4);
            objectOutputStream.writeObject(person5);
        } catch (IOException e) {
            e.getStackTrace();
        }
        List<Person> people = new ArrayList<>();
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            Person buffer = (Person) objectInputStream.readObject();
            while (buffer != null) {
                people.add(buffer);
                buffer = (Person) objectInputStream.readObject();
            }
        } catch (IOException e) {
            e.getStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        Comparator<Person> comparatorName = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((Person)o1).getName().compareTo(((Person)o2).getName());
            }
        };
        Comparator<Person> comparatorSurname = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((Person)o1).getSurname().compareTo(((Person)o2).getSurname());
            }
        };
        people.sort(comparatorSurname.thenComparing(comparatorName));
        System.out.println(people);
    }
}
