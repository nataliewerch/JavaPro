package homework4.level1.task12;

public class SimpleATM extends CreditCard {
    private final int availableAmount = 1000;
    CreditCard card = new CreditCard();

    public int getAvailableAmount() {
        return availableAmount;
    }

    public SimpleATM(int pinCard, String numberCard) {
        super(pinCard, numberCard);
        this.card = card;
    }

    @Override
    public void withdraw() {
        System.out.println("Введите ваш PIN ");
        int pin = SCANNER.nextInt();
       while (pin != getPinCard()) {
            System.out.println("Операция отклонена. Неверный PIN");
           System.out.println("Введите ваш PIN ");
            pin = SCANNER.nextInt();
        }
            System.out.println("Введите сумму ");
            int amount = SCANNER.nextInt();
            if (amount > getLimit() && amount > getAvailableAmount()) {
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
        int pin = SCANNER.nextInt();
        while (pin != getPinCard()) {
            System.out.println("Операция отклонена. Неверный PIN ");
            System.out.println("Введите ваш PIN ");
            pin = SCANNER.nextInt();
        }
            System.out.println("Введите сумму");
            int amount = SCANNER.nextInt();
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
    @Override
    public int checkBalance(){
        System.out.println("Введите ваш PIN ");
        int pin = SCANNER.nextInt();
        while (pin != getPinCard()) {
            System.out.println("Операция отклонена. Неверный PIN ");
            System.out.println("Введите ваш PIN ");
            pin = SCANNER.nextInt();
        }
        return card.getBalance();
    }



}











