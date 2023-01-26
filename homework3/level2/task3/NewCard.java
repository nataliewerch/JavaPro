package homework2.level2.task3;

public class NewCard extends CreditCard {
    CreditCard card = new CreditCard();

    public NewCard(int pinCard, String numberCard, int limit) {
        super(pinCard, numberCard, limit);
        this.card = card;
    }

    public NewCard(int pinCard, String numberCard) {
        super(pinCard, numberCard);
        this.card = card;
    }

    @Override
    public void withdraw() {
        System.out.println("Введите ваш PIN ");
        int pin = scanner.nextInt();
       while (pin != getPinCard()) {
            System.out.println("Операция отклонена. Неверный PIN");
           System.out.println("Введите ваш PIN ");
            pin = scanner.nextInt();
        }
            System.out.println("Введите сумму ");
            int amount = scanner.nextInt();
            if (amount > getLimit()) {
                System.out.println("Операция отклонена. Превышен лимит ");
            } else {
                if (getBalance() < amount) {
                    int debtCard = card.getDebtCard() + (amount - card.getBalance());
                    card.setBalance(0);
                    card.setDebtCard(debtCard);
                    System.out.println("Ваш баланс - " + card.getBalance() + "; ваша задолженность: -" + card.getDebtCard());
                } else {
                    int balance = card.getBalance() - amount;
                    card.setBalance(balance);
                    System.out.println("Ваш баланс - " + card.getBalance());
                }

            }
        }


    @Override
    public void deposit() {
        System.out.println("Введите ваш PIN ");
        int pin = scanner.nextInt();
        while (pin != getPinCard()) {
            System.out.println("Операция отклонена. Неверный PIN ");
            System.out.println("Введите ваш PIN ");
            pin = scanner.nextInt();
        }
            System.out.println("Введите сумму");
            int amount = scanner.nextInt();
            if (amount > card.getDebtCard()) {
                int balance = card.getBalance() + (amount - card.getDebtCard());
                card.setDebtCard(0);
                card.setBalance(balance);
                System.out.println("Ваш баланс:  " + card.getBalance() + "; ваша задолженность: " + card.getDebtCard());
            } else {
                int debtCard = card.getDebtCard() - amount;
                card.setBalance(0);
                card.setDebtCard(debtCard);
                System.out.println("Ваш баланс:  " + card.getBalance() + "; ваша задолженность:  -" + card.getDebtCard());
            }

    }
}











