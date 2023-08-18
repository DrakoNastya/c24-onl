package Lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    //Задача 3:
    //Найти индексы минимального и максимального элементов и вывести в консоль
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int arrsize = scanner.nextInt();
            if (arrsize <= 0) {
                System.out.println(" The information entered does not match the task ");
                return;
            }

            int[] arr = new int[arrsize];
            int maxindex = 0;
            int minindex = 0;
            for (int i = 0; i < arrsize; i++) {
                arr[i] = Math.round((float) (Math.random() * 100));
            }
            System.out.println(Arrays.toString(arr));
            int max = arr[0];
            for (int i = 1; i < arrsize; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                    maxindex = i;
                }

            }
            int min = arr[0];
            for (int i = 1; i < arrsize; i++) {
                if (min > arr[i]) {
                    min = arr[i];
                    minindex = i;
                }

            }

            System.out.println("Max = " + maxindex);
            System.out.println("Min = " + minindex);


        } else {
            System.out.println(" The information entered does not match the task ");

        }


    }
}
