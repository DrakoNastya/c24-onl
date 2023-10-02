package Lesson15;

import java.util.function.Function;

public class Task3 {
    //Задача 3:
    //Используя Function реализовать лямбду, которая будет принимать в себя строку в
    //формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
    //возвращать сумму, переведенную сразу в доллары.
    public static void main(String[] args) {
        Function<String, Double> amount = str -> Double.parseDouble(str.substring(0, str.length() - 4)) / 3.28;
        System.out.println(amount.apply("175.50 BYN") + " USD");
    }
}
