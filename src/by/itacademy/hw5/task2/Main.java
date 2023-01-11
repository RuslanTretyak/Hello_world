package by.itacademy.hw5.task2;

public class Main {

    public static void main(String[] args) {

        Phone phone1 = new Phone();

        phone1.setNumber("+375(33)321-12-21");
        phone1.setModel("Nokia 3310");
        phone1.setWeight(133.0F);

        System.out.println("phone1");
        phone1.receiveCall("Руслан");
        phone1.receiveCall("Руслан", "+375(29)111-11-11");
        System.out.println(phone1.getNumber() + "\n");
        phone1.sendMessage("+375(29)111-11-11", "+375(29)222-22-22");

        Phone phone2 = new Phone("+375(44)123-45-67", "Nokia 3310");

        System.out.println("phone2");
        phone2.receiveCall("Руслан");
        phone2.receiveCall("Руслан", "+375(29)111-11-11");
        System.out.println(phone2.getNumber() + "\n");
        phone2.sendMessage("+375(29)111-11-11", "+375(29)222-22-22", "+375(29)333-33-33");

        Phone phone3 = new Phone("+375(44)999-99-99", "Nokia 3310", 133.0F);

        System.out.println("phone3");
        phone3.receiveCall("Руслан");
        phone3.receiveCall("Руслан", "+375(29)111-11-11");
        System.out.println(phone3.getNumber() + "\n");
        phone3.sendMessage("+375(29)111-11-11", "+375(29)222-22-22", "+375(29)333-33-33", "+375(29)444-44-44");

    }
}
