package Lesson5;

public class Task2 {
    //Задача 2:
    //Создать программу для раскраски шахматной доски с помощью цикла. Создать
    //двумерный массив String 8х8. С помощью циклов задать элементам массива значения
    //B(Black) или W(White).
    public static void main(String[] args) {
        String[][] chess = new String[8][8];
        int i, j;
        for (i = 0; i < 8; i++) {
            for (j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0)
                    chess[i][j] = "B";
                else
                    chess[i][j] = "W";

                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }
    }
}
