package Lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    //Задача 4:
    //Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести
    //сообщение, что их нет.
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
            int o = 0;
            for (int i = 0; i < arrsize; i++) {
                if (arr[i] == 0) {
                    o++;
                }
            }


            if (o == 0) {
                System.out.println("no zeros");
            }
            System.out.println("Number of zeros = " + o);
            System.out.println(Arrays.toString(arr));

        } else {
            System.out.println(" The information entered does not match the task ");

        }


    }
}
