package Lesson15;

import java.time.LocalDate;
import java.util.Scanner;

public class Task1 {
    //Задача 1:
    //Пользователь вводит в консоль дату своего рождения. Программа должна вернуть дату,
    //когда пользователю исполнится 100 лет. Использовать Date/Time API.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your date of birth as 'year-month-day'");
        if (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            LocalDate localDate = LocalDate.parse(str);
            LocalDate centenarian = localDate.plusYears(100);
            System.out.println(" On this date you will turn one hundred years old: " + centenarian);
        } else {
            System.out.println(" Day of birth entered incorrectly ");
        }
    }
}

