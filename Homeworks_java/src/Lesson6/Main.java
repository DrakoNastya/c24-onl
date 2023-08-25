package Lesson6;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard(1, 170);
        CreditCard creditCard2 = new CreditCard(2, 230);
        CreditCard creditCard3 = new CreditCard(3, 764);
        System.out.println("Credit card information before balance change: ");
        creditCard1.info();
        creditCard2.info();
        creditCard3.info();
        creditCard1.replenishment(25);
        creditCard2.replenishment(146);
        creditCard3.cashWithdrawal(78);
        System.out.println("Credit card information after balance change: ");
        creditCard1.info();
        creditCard2.info();
        creditCard3.info();
    }
}
