package Lesson19;

import java.util.Arrays;
public class Main {
    //Задача 2:
    //Сортировка массива цифр в нескольких потоках различными алгоритмами:
    // сортировка вставками;
    // сортировка выбором;
    // сортировка пузырьком.
    //Каждый вид сортировки должен запускаться в отдельном потоке. После вывести
    //результат отсортированных массивов в консоль.
    public static void main(String[] args) {
        int[] arr = {1, 87, 9, 78, 45, 6, 1000, 9, 465, 987, 0};
        ThreadFirst threadFirst = new ThreadFirst(Arrays.copyOf(arr, arr.length));
        threadFirst.start();
        ThreadSecond threadSecond = new ThreadSecond(Arrays.copyOf(arr, arr.length));
        threadSecond.start();
        ThirdThread thirdThread = new ThirdThread(Arrays.copyOf(arr, arr.length));
        thirdThread.start();
    }
}