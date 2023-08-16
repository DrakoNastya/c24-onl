package Lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    //Для всех задач исходные условия следующие: пользователь с клавиатуры вводит размер
    //массива (просто целое число). После того, как размер массива задан, заполнить его
    //одним из двух способов: используя Math.random(), или каждый элемент массива вводится
    //пользователем вручную. Попробовать оба варианта. После заполнения массива
    //данными, решить для него следующие задачи:
    //Задача 1:
    //Пройти по массиву, вывести все элементы в прямом и в обратном порядке.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int arrsize = scanner.nextInt();
            if (arrsize <= 0) {
                System.out.println(" The information entered does not match the task ");
                return;
            }

            int[] arr = new int[arrsize];
            System.out.println("Array elements in direct order: ");
            for (int i = 0; i < arrsize; i++) {
                arr[i] = Math.round((float) (Math.random() * 100));
            }
            System.out.println(Arrays.toString(arr));
            System.out.println("Array elements in reverse order: ");
            for (int i = arrsize; i > 0; ) {
                i--;

                System.out.print(arr[i] + ", ");
            }
        } else {
            System.out.println(" The information entered does not match the task ");

        }
    }
}


