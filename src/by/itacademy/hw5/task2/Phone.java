package by.itacademy.hw5.task2;

public class Phone {

    String number;
    String model;
    float weight;

    Phone() {

    }
    Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }
    Phone(String number, String model, float weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public void receiveCall(String name) {
        System.out.println("Звонит " + name + "\n");
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + ", номер " + number + "\n");
    }

    public String getNumber() {
        return this.number;
    }

    public void sendMessage(String... var) {
        String numbers = "Сообщение будет отправлено следующим номерам: \n";
        for (String s : var) {
            numbers += s + "\n";
        }
        System.out.println(numbers + "\n");
    }
}
