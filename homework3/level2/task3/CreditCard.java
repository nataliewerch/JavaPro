package homework2.level2.task3;

import java.util.Scanner;

public class CreditCard {
    Scanner scanner = new Scanner(System.in);
    private int pinCard;
    private int balance;
    private String numberCard;
    private int debtCard;
    private int limit;

    public CreditCard(int pinCard, String numberCard) {
        this.pinCard = pinCard;
        this.numberCard = numberCard;
    }


    public int getPinCard() {
            return pinCard;
        }


    public void setPinCard(int pinCard) {
            this.pinCard = pinCard;
        }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(String numberCard) {
        this.numberCard = numberCard;
    }

    public int getDebtCard() {
        return debtCard;
    }

    public void setDebtCard(int debtCard) {
        this.debtCard = debtCard;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public CreditCard() {
    }

    public CreditCard(int pinCard, String numberCard, int limit) {
        this.pinCard = pinCard;
        this.numberCard = numberCard;
        this.limit = limit;
    }

    public void withdraw() {

    }

    public void deposit() {
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "scanner=" + scanner +
                ", pinCard=" + pinCard +
                ", balance=" + balance +
                ", numberCard='" + numberCard + '\'' +
                ", debtCard=" + debtCard +
                ", limit=" + limit +
                '}';
    }
}

