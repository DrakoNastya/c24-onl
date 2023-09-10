package Lesson10;

public class Task5 {
    //5. Вывести на консоль новую строку, которой задублирована каждая буква из
    //начальной строки. Например, "Hello" -> "HHeelllloo".
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str);
        StringBuilder sb = new StringBuilder(str.length() * 2);
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i)).append(str.charAt(i));
        }
        System.out.println(sb);

    }
}
