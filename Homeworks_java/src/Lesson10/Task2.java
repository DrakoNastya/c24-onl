package Lesson10;

import java.util.Scanner;

public class Task2 {
    //2. Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке возрастания
    //значений их длины.
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
        int length1 = arr[0].length();
        String str = string1;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length() > length1) {
                length1 = arr[i].length();
                str = arr[i];
            }
        }
        int length2 = arr[0].length();
        String str2 = string1;
        for (int i = 0; i < arr.length; i++) {

            if (length2 > arr[i].length()) {
                length2 = arr[i].length();
                str2 = arr[i];
            }
        }
        System.out.println("The shortest string: " + str2);
        int length = arr[0].length();
        String str1 = string1;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length() < length1 && arr[i].length() > length2) {
                length1 = arr[i].length();
                str1 = arr[i];
            }

        }
        System.out.println("Medium length string: " + str1);
        System.out.println("The longest string: " + str);
    }
}
