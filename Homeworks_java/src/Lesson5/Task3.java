package Lesson5;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    //Задача 3:
    //Найдите сумму элементов на главной диагонали:
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        Random random = new Random();
        int i, j;
        int sum = 0;
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                arr[i][j] = random.nextInt(10);

            }
        }
        System.out.println("Your two-dimensional array : ");
        for (i = 0; i < 5; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        System.out.println("Sum of array elements along the main diagonal: ");
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }

            }

        }
        System.out.println(sum);
    }
}

