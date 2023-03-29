package homework4.level2;

public enum Suits {
    CLUBS ("clubs"),
    DIAMONDS ("diamonds"),
    HEARTS ("hearts"),
    SPADES ("spades");

    String suit;

    public String getSuit() {
        return suit;
    }

    Suits(String suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return suit;
    }

}
