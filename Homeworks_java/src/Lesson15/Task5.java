package Lesson15;

import java.util.Scanner;
import java.util.function.Supplier;

public class Task5 {
    //Задача 5:
    //Используя Supplier написать метод, который будет возвращать введенную с консоли
    //строку задом наперед.
    public static void main(String[] args) {
        Supplier<String> reversedString = () -> {
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            return new StringBuilder(str).reverse().toString();
        };
        System.out.println(reversedString.get());
    }

}