package by.itacademy.hw5.task3;

import java.util.Random;

public class Matrix {


    private int i;
    private int j;
    private int [][] array;

    Matrix (int i, int j){
        this.i = i;
        this.j = j;
        Random rd = new Random();
        this.array = new int[i][j];
        for (int a = 0; a < this.i; a++) {
            for (int b = 0; b < this.j; b++) {
                array [a][b] = rd.nextInt(10);
            }
        }
    }
    public void printMatrix () {
        for (int i = 0; i < this.i; i++) {
            for (int j = 0; j < this.j; j++) {
                System.out.print(this.array[i][j] + "  ");
            }
            System.out.println();
        }
    }
    public void addMatrix (Matrix mt){
        if (this.i != mt.i || this.j != mt.j) {
            System.out.println("Невозможно сложить матрицы, так как они имеют разный размер!");
        } else {
            System.out.println("сумма матрицы 1 и матрицы 2:");
            for (int i = 0; i < this.i; i++) {
                for (int j = 0; j < this.j; j++) {
                    System.out.print((this.array[i][j] + mt.array[i][j]) + "  ");
                }
                System.out.println();
            }
        }
    }
    public void multiplyByNumber (int x) {
        System.out.println("Результат умножения матрицы на число " + x + ":");
        for (int i = 0; i < this.i; i++){
            for (int j = 0; j < this.j; j++) {
                System.out.print((this.array[i][j] * x) + "  ");
            }
            System.out.println();
        }
    }
    public void multiplyByMatrix (Matrix mt) {
        if (this.j != mt.i) {
            System.out.println("Невозможно умножить матрицу 1 на матрицу 2, так как количество столбцов матрицы 1 " +
                    "не равно количеству строк матрицы 2");
        } else {
            System.out.println("Результат умножения матрицы 1 на матрицу 2:");
            for (int i = 0; i < this.i; i++) {
                for (int j = 0; j < mt.j; j++) {
                    int buf = 0;
                    for (int a = 0; a < this.j; a++){
                        buf += this.array[i][a] * mt.array[a][j];
                    }
                    System.out.print(buf + "  ");
                }
                System.out.println();
            }
        }
    }
}
