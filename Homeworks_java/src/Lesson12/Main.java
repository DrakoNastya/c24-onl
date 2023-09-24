package Lesson12;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    //Задача 1:
    //В задании приложен файл Ромео и Джульетта на английском, вычитать его в приложении.
    //Проанализировать и записать в другой файл самое длинное слово.
    public static void main(String[] args) throws FileNotFoundException, IOException {
        new Main().LongestWords();
    }
    public String LongestWords() throws java.io.FileNotFoundException, IOException {

        String longestWord = "";
        String word;
        Scanner sc = new Scanner(new File("C:\\Users\\ad800\\Romeo and Juliet.txt"));
        while (sc.hasNext()) {
            word = sc.next();
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
            FileWriter file1 = new FileWriter("C:\\Users\\ad800\\The longest word.txt");
            file1.write(longestWord);

        }
        System.out.println("The file was written");
        System.out.println(longestWord);
        return longestWord;


        }
    }




