package homework4.level1.task12;

public class Operation {

    public static void main(String[] args) {

        CreditCard card1 = new SimpleATM(1111, "11112344");
        card1.withdraw();
        card1.withdraw();
        card1.deposit();
        card1.deposit();
        System.out.println("Ваш баланс: " + card1.checkBalance());

    }

}



