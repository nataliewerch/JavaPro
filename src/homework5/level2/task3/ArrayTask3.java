package homework5.level2.task3;

import java.util.Random;

public class ArrayTask3 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        array(arr);
        numberOfNegativeElements(arr);

    }

    public static void array (int[][] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = random.nextInt();
                System.out.print(arr[i][j] + "   ");
            }
            System.out.println();
        }
    }
    public  static  void numberOfNegativeElements(int[][] arr) {
         int summ = 0;
         for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i > j && arr[i][j] < 0) {
                    summ += 1;
                 }
            }
         }
         System.out.println("Количество орицательных элементов под главной диагональю = " + summ);

        }
    }




