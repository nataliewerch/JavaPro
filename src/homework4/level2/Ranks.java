package homework4.level2;

public enum Ranks {
    TWO ("2"),
    THREE ("3"),
    FOUR ("4"),
    FIVE ("5"),
    SIX ("6"),
    SEVEN ("7"),
    EIGHT ("8"),
    NINE ("9"),
    TEN ("10"),
    JACK ("Jack"),
    QUEEN ("Queen"),
    KING ("King"),
    ACE ("Ace");
    String rank;

    Ranks(String rank) {
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }



    @Override
    public String toString() {
        return rank +
                " ";
    }

}
