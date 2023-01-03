package by.itacademy.hw6;

public class Task7 {

    public static void main(String[] args) {

        Double db1 = Double.valueOf(3.14);
        Double db2 = Double.parseDouble("3.14");
        byte b = db1.byteValue();
        short s = db1.shortValue();
        int i = db1.intValue();
        long l = db1.longValue();
        float f = db1.floatValue();

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(db1);
        System.out.println(db2);
        String d = Double.toString(3.14);
        System.out.println(d);
    }
}
