package Lesson15;

import java.util.function.Consumer;

public class Task4 {
    //Используя Consumer реализовать лямбду, которая будет принимать в себя строку в
    //формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
    //выводить сумму, переведенную сразу в доллары.
    public static void main(String[] args) {
        Consumer<String> amount = str -> System.out.println(Double.parseDouble(str.substring(0, str.length() - 4)) / 3.28 + " USD");
        amount.accept("56.75 BYN");
    }
}