package homework5.level1.task3;

public class ArrayTaskThree {
    public static void main(String[] args) {
        int[][] arr = new int[10][10];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = 7 * i - 3 * j;
                System.out.print(arr[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
