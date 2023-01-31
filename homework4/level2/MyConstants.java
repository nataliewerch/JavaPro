package homework4.level2;

import java.util.Random;
import java.util.Scanner;

public interface MyConstants {

    final int CARDS_FOR_PLAYERS = 5;
    final static Scanner SCANNER = new Scanner(System.in);
    final Random RANDOM = new Random();
    final Ranks[] ranks = Ranks.values();
    final Suits[] suits = Suits.values();
    final int runksLenght = ranks.length;
    final int suitsLenght = suits.length;
    final int numberOfCards = suitsLenght * runksLenght;

}
