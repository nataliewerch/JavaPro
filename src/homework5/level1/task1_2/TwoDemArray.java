package homework5.level1.task1_2;

import java.util.Random;

public class TwoDemArray {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                    arr[i][j] = random.nextInt(100);
                System.out.print(arr[i][j] + "   ");
            }
            System.out.println();
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            if (max < arr[arr.length - 1 - i][i]){
                max = arr[arr.length -1 - i][i];
            }
        }
        System.out.println();
        System.out.println("Максимальный элемент побочной диагонали = " + max);
    }
}
