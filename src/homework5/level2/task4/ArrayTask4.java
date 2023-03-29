package homework5.level2.task4;

import java.util.Scanner;

public class ArrayTask4 {

    public static void main(String[] args) {

        int[][] arr = {{12, 45, 476, 762}, {57, 34, 355, 233}, {365, 244, 873, 372}, {124, 16, 85, 237}};
            arrayPrint(arr);
            maxEvenElement(arr);
    }

    static void arrayPrint(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "   ");
            }
            System.out.println();
        }

    }
    static void maxEvenElement(int[][] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] % 2 == 0 && max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }            System.out.println("Максимальный четный элемент в матрице = " + max);


    }
}