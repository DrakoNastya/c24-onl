package Lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    //Задача 5:
    //Пройти по массиву и поменять местами элементы первый и последний, второй и
    //предпоследний и т.д.
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
            for (int n = arrsize - 1; n >= 0; n--) {
                int i = 0;
                i = i + n;
                System.out.print(arr[i] + ", ");
            }

        } else {
            System.out.println(" The information entered does not match the task ");
        }
    }
}

