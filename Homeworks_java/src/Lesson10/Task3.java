package Lesson10;

import java.util.Scanner;

import static java.lang.Math.round;

public class Task3 {
    //3. Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых меньше
    //средней, а также их длину.
    public static void main(String[] args) {
        String string1;
        String string2;
        String string3;
        Scanner scanner1 = new Scanner(System.in);

        string1 = scanner1.nextLine();
        System.out.println(string1);

        Scanner scanner2 = new Scanner(System.in);

        string2 = scanner2.nextLine();
        System.out.println(string2);


        Scanner scanner3 = new Scanner(System.in);

        string3 = scanner3.nextLine();
        System.out.println(string3);
        String[] arr = {string1, string2, string3};
        int length1 = (arr[0].length() + arr[1].length() + arr[2].length()) / 3;
        System.out.println("Average string length = " + round(length1));
        String str;
        int stringLength;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length() < length1) {
                stringLength = arr[i].length();
                str = arr[i];
                System.out.println("The length of this string is less then the average length: " + str + ", string length = " + stringLength);
            }
        }


    }
}
