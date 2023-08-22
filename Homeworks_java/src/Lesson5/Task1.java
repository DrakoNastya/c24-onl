package Lesson5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    //Задача 1:
    //1.1 Создать двумерный массив, заполнить его случайными числами.
    //1.2 Добавить к каждому значению число, которое пользователь будет вводить с консоли.
    //1.3 Найти сумму всех получившихся элементов и вывести в консоль.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[][] arr = new int[3][5];

        if (scanner.hasNextInt()) {
            Random random = new Random();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 5; j++) {

                    arr[i][j] = random.nextInt(100);

                }
            }
            System.out.println("Two-dimensional array of random numbers in it's original form: ");
            for (int i = 0; i < 3; i++) {
                System.out.println(Arrays.toString(arr[i]));
            }
            System.out.println("The sum of all elements of the array after adding the number entered from the console to each: ");
            int sum = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 5; j++) {
                    arr[i][j] += a;

                    sum += arr[i][j];

                }

            }
            System.out.println(sum);


        } else {
            System.out.println(" The information entered does not match the task ");

        }
    }

}
