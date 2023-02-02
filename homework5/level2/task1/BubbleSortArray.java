package homework5.level2.task1;

import java.util.Random;

public class BubbleSortArray {
    public static void main(String[] args) {
        int[] arr = {-2, 45, 0, 11, -9};
        int temp;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "   ");
        }
        }
        }


