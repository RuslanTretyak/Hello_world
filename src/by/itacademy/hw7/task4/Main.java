package by.itacademy.hw7.task4;

import by.itacademy.hw7.task4.flowers.Chamomile;
import by.itacademy.hw7.task4.flowers.Flower;
import by.itacademy.hw7.task4.flowers.Rose;
import by.itacademy.hw7.task4.flowers.Tulip;

public class Main {

    public static void main(String[] args) {

        Flower rose1 = new Rose();
        Flower rose2 = new Rose();
        Flower chamomile1 = new Chamomile();
        Flower chamomile2 = new Chamomile();
        Flower tulip1 = new Tulip();
        Flower tulip2 = new Tulip();
        Flower tulip3 = new Tulip();

        Flower[] bouquet = new Flower[] {rose1, rose2, chamomile1, chamomile2, tulip1, tulip2, tulip3};

        System.out.printf("стоимость букета %.2f\n", calcPrice(bouquet));
        System.out.println("весь букет завянет через " + getWitherTime(bouquet) + " дней");
        System.out.println("в букете используются следующие цвета: " + getColors(bouquet));


    }

    private static double calcPrice(Flower[] bouquet){
        double price = 0;
        for (Flower f : bouquet) {
            price += f.getPrice();
        }
        return price;
    }
    private static int getWitherTime (Flower[] bouquet){
        int witherTime = 0;
        for (Flower f : bouquet) {
            if (f.getWitherTime() > witherTime) {
                witherTime = f.getWitherTime();
            }
        }
        return witherTime;
    }
    private static String getColors (Flower[] bouquet){
        String[] allColors = new String[bouquet.length];
        for (int i = 0; i < bouquet.length; i++){
            allColors[i] = bouquet[i].getColor();
        }
        String colors = allColors[0];
        for (int i = 1; i < allColors.length; i++) {
            boolean colorRepeated = false;
            for (int j = i-1; j >=0 ; j--) {
                if(allColors[i].equals(allColors[j])){
                    colorRepeated = true;
                    break;
                }
            }
            if (!colorRepeated) colors += (", " + allColors[i]);
        }
        return colors;
    }
}
