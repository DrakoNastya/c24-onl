package Lesson19;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    //Задача 1:
    //Пользователь вводит с клавиатуры значение в массив. После чего запускаются два
    //потока. Первый поток находит максимум в массиве, второй — минимум. Результаты
    //вычислений возвращаются в метод main().
    public static void main(String[] args) {
        System.out.println("Enter the number of array elements ");
        Scanner scr = new Scanner(System.in);
        if (scr.hasNextInt()) {
            int length = scr.nextInt();
            int arr[] = new int[length];
            System.out.println("Enter " + length + " array element values ");
            for (int i = 0; i < length; i++) {
                arr[i] = scr.nextInt();
            }
            Thread min = new Thread(() -> System.out.println(Arrays.stream(arr).min().getAsInt()));
            Thread max = new Thread(() -> System.out.println(Arrays.stream(arr).max().getAsInt()));

            max.start();

            min.start();

            System.out.println(Arrays.toString(arr));
        } else {
            System.out.println("The information entered doesn't correspond to the task ");
        }
    }
}
