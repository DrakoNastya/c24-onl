package Lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    //Задача 6:
    //Проверить, является ли массив возрастающей последовательностью (каждое следующее
    //число больше предыдущего).
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
            }
            System.out.println(Arrays.toString(arr));

            boolean a = true;

            for (int i = 0; i < arrsize; i++) {
                if (arr[i] < arr[i++]) {
                    a = true;
                } else {
                    a = false;
                }
            }
            if (a = true) {
                System.out.println("The array is  a increasing sequence");
            }

        } else {
            System.out.println("The array is not a increasing sequence");
        }

    }
}
