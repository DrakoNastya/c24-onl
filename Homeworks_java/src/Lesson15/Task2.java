package Lesson15;

import java.util.Arrays;

public class Task2 {
    //Задача 2:
    //Используя Predicate среди массива чисел вывести только те, которые являются
    //положительными.
    public static void main(String[] args) {
        int arr[] = {1, -3, 6, 7, 3, -1, 9};
        Arrays.stream(arr).filter(x -> x > 0);
        Arrays.stream(arr).forEach(System.out::print);
    }
}