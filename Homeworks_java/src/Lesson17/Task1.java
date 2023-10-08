package Lesson17;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    //Задача 1:
    //Вывести в консоль из строки которую пользователь вводит с клавиатуры все
    //аббревиатуры. Аббревиатурой будем считать слово от 2 до 6 символов, состоящее
    //только из прописных букв, без чисел
    public static void main(String[] args) {
        System.out.println("Input your string ");
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        Pattern p = Pattern.compile("\\b[A-Z]{2,6}\\b");

        Matcher matcher = p.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

}
