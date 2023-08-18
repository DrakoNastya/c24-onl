package Lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    //Задача 2:
    //Найти минимальный-максимальный элементы и вывести в консоль.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int arrsize = scanner.nextInt();
            if (arrsize <= 0) {
                System.out.println(" The information entered does not match the task ");
                return;
            }

            int[] arr = new int[arrsize];

            for (int i = 0; i < arrsize; i++) {
                arr[i] = Math.round((float) (Math.random() * 100));

                System.out.print(arr[i] + ", ");

            }
            Arrays.sort(arr);
            System.out.println("min = " + arr[0] + ", max = " + arr[arrsize - 1]);


        } else {
            System.out.println(" The information entered does not match the task ");

        }


    }
}
