package homework5.level2.task5;

import java.util.Scanner;

public class SeaBattle {

    // Не успела сделать, постараюсь на выходных разобраться
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        char[][] field1 = new char[10][10];
        char[][] field2 = new char[10][10];
        System.out.println("Введите ваше имя ");
        String player1 = scanner.nextLine();
        System.out.println("Добро пожаловать в игру " + player1);
        System.out.println("Введите ваше имя игрок номер 2 ");
        String player2 = scanner.nextLine();
        System.out.println("Добро пожаловать в игру " + player2);



    }
}
