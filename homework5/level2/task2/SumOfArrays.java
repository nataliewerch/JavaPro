package homework5.level2.task2;

import java.lang.reflect.Array;
import java.util.Random;

public class SumOfArrays {
    public static void main(String[] args) {
        int[][] arr1 = new int[5][5];
        int[][] arr2 = new int[5][5];
        arrayFilling(arr1);
        System.out.println();
        arrayFilling(arr2);
        System.out.println();
        System.out.println("Сумма двух массивов равна массиву: ");
        sumOfArrays(arr1, arr2);

    }
    static void arrayFilling(int[][] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = random.nextInt(10);
                System.out.print(arr[i][j] + "   ");

            }
            System.out.println();

        }
    }

    static void sumOfArrays(int[][] arr1, int[][] arr2){
       int[][] sum = new int[5][5];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(sum[i][j] + "     ");
            }
            System.out.println();
        }
    }
}
