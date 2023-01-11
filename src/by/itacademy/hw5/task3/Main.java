package by.itacademy.hw5.task3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число строк матрицы 1");
        int i = sc.nextInt();
        System.out.println("Введите число столбцов матрицы 1");
        int j = sc.nextInt();
        Matrix matrix1 = new Matrix(i, j);

        System.out.println("Печать матрицы 1:");
        matrix1.printMatrix();

        System.out.println("Введите число, на которое нужно умножить матрицу 1:");
        int x = sc.nextInt();
        matrix1.multiplyByNumber(x);

        System.out.println("Введите число строк матрицы 2");
        int i1 = sc.nextInt();
        System.out.println("Введите число столбцов матрицы 2");
        int j1 = sc.nextInt();
        Matrix matrix2 = new Matrix(i1, j1);
        System.out.println("Печать матрицы 2:");
        matrix2.printMatrix();

        matrix1.addMatrix(matrix2);

        matrix1.multiplyByMatrix(matrix2);


    }
}
