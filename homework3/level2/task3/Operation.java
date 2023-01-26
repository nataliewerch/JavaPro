package homework2.level2.task3;

public class Operation {

    public static void main(String[] args) {

        CreditCard card1 = new NewCard(1111, "11112344");
        card1.setLimit(10000);

        card1.withdraw();
        card1.withdraw();
        card1.deposit();
        card1.deposit();

    }

}



