package homework4.level2;

import java.util.Arrays;

public class Deck implements MyConstants {
    int players;
    String[] deck = new String[numberOfCards];
    void deckInitialization(){
        for (int i = 0; i < runksLenght; i++) {
        for (int j = 0; j < suitsLenght; j++) {
            deck[suitsLenght * i + j] = Ranks.values()[i] + " " + Suits.values()[j];
             }
        }
    }
    void playersNumber(){
        while (true) {
            System.out.println("Enter the number of players: ");
            if (SCANNER.hasNextInt()) {
                players = SCANNER.nextInt();
                if (CARDS_FOR_PLAYERS * players <= MyConstants.numberOfCards) {
                    break;
               } else {
                    if (players == 0) {
                        System.out.println("The game has been terminated.");
                        break;
                    } else if (players < 0) {
                        System.out.println("The number of players cannot be less than 0");
                    } else {
                        System.out.println("Too many players!");
                    }
                }
            } else {
                System.out.println("You have not entered a number, or your number is too large!");
            }
        }
    }

    void deckShuffling() {
        for (int i = 0; i < MyConstants.numberOfCards; i++) {
        int card = i + (RANDOM.nextInt(MyConstants.numberOfCards - i)); // random card in the deck
        String temp = deck[card];
        deck[card] = deck[i];
        deck[i] = temp;
        }
    }

    void deckDisplay() {
        for (int i = 0; i < players * MyConstants.CARDS_FOR_PLAYERS; i++) {
        System.out.println(deck[i]);

        if (i % MyConstants.CARDS_FOR_PLAYERS == MyConstants.CARDS_FOR_PLAYERS - 1)
            System.out.println();
         }
    }

    @Override
    public String toString() {
        return "DeckGame{" +
                "deck=" + Arrays.toString(deck) +
                ", players=" + players +
                "} " + super.toString();
    }
}



