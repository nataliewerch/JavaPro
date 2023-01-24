package homework2.level2.task3;

public class NewCard extends CreditCard {

    int balance = getBalance();
    int pinCard = getPinCard();
    int limit = getLimit();
    int debtCard = getDebtCard();
    String numberCard = getNumberCard();



    public NewCard(int pinCard, String numberCard) {
        super();
        this.pinCard = pinCard;
        this.numberCard = numberCard;
    }

    @Override
    public void withdraw() {
        limit = 10000;
        setLimit(limit);
        System.out.println("Введите ваш PIN ");
        int pin = scanner.nextInt();
        if (pin != pinCard) {
            System.out.println("Операция отклонена");
        }else {
            System.out.println("Введите сумму ");
            int amount = scanner.nextInt();
            if (amount > limit){
                System.out.println("Операция отклонена ");
            }else {
                if (balance < amount){
                    debtCard += (amount - balance);
                    balance = 0;
                    setBalance(balance);
                    setDebtCard(debtCard);
                    System.out.println("Ваш баланс - " + balance + "; ваша задолженность -" + debtCard);
                }else{
                    balance -= amount;
                    setBalance(balance);
                    System.out.println("Ваш баланс - " + balance);
                }
            }
        }
    }
    @Override
    public void deposit (){
        limit = 1000;
        setLimit(limit);
        System.out.println("Введите ваш PIN ");
        int pin = scanner.nextInt();
        if (pin != pinCard) {
            System.out.println("Операция отклонена ");
        }else {
            System.out.println("Введите сумму");
            int amount = scanner.nextInt();
            if (amount > debtCard) {
                balance += (amount - debtCard);
                debtCard = 0;
                System.out.println("Ваш баланс:  " + balance + "; ваша задолженность: -" + debtCard);
            }else {
                debtCard -= amount;
                balance = 0;
                System.out.println("Ваш баланс:  " + balance + "; ваша задолженность:  -" + debtCard);
            }

        }

    }

    @Override
    public String toString() {
        return "NewCard{" +
                "balance=" + balance +
                ", pinCard=" + pinCard +
                ", limit=" + limit +
                ", debtCard=" + debtCard +
                ", numberCard='" + numberCard + '\'' +
                "} " + super.toString();
    }
}
