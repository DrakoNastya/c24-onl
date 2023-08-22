package Lesson6;

public class CreditCard {
    //Задача 1:
    //Создать класс CreditCard c полями номер счета, текущая сумма на счету. Добавьте
    //метод, который позволяет начислять сумму на кредитную карточку. Добавьте метод,
    //который позволяет снимать с карточки некоторую сумму. Добавьте метод, который
    //выводит текущую информацию о карточке. Напишите программу, которая создает три
    //объекта класса CreditCard у которых заданы номер счета и начальная сумма.
    //Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с
    //третьей. Выведите на экран текущее состояние всех трех карточек.
    int accountNumber;
    int currentAccountBalance;

    public CreditCard(int accountNumber, int currentAccountBalance) {
        this.accountNumber = accountNumber;
        this.currentAccountBalance = currentAccountBalance;
    }

    public void replenishment(int amountOfMoney) {
        currentAccountBalance += amountOfMoney;
    }

    public void cashWithdrawal(int amountOfMoney) {
        currentAccountBalance -= amountOfMoney;
    }

    public void info() {
        System.out.print("Information about the credit card: ");
        System.out.println("Account number = " + accountNumber + ", " + "Current account balance = " + currentAccountBalance);

    }
}
