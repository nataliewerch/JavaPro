package homework5.level1.task4;

public class ChessArray {
    public static void main(String[] args) {
        int[][] arr = new int[8][8];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
               if ((i + j) % 2 != 0){
                   arr[i][j] = 1;
               }
                    System.out.print(arr[i][j] + "  ");
                }
                System.out.println();
            }


        }

    }

