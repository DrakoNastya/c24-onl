package Lesson13;

import java.util.*;
import java.util.Set;

public class Task1 {
    //Задача 1:
    //Пользователь вводит набор чисел в виде одной строки с клавиатуры. Например: "1, 2, 3,
    //4, 4, 5". Избавиться от повторяющихся элементов в строке. Вывести результат на экран.
    //При решении использовать коллекции.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            String str = scanner.nextLine();
            String[] numbers = str.split(" ");
            Set<String> set = new HashSet<>();
            set.addAll(Arrays.asList(numbers));
            System.out.println(set);
        } else {
            System.out.println(" The information entered does not match the task ");

        }
    }
}

