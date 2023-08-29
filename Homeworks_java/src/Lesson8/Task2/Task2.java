package Lesson8.Task2;

public class Task2 {
    //Задача 2:
    //Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг. Реализовать
    //функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя
    //абстрактный класс/методы). Создать массив из 5 разных фигур. Вывести на экран сумму
    //периметра всех фигур в массиве.
    public static void main(String[] args) {
        Figure[] arr = new Figure[]{new Rectangle(5, 7), new Circle(4.7), new Triangle(3, 5, 4, 3), new Rectangle(3.7, 8), new Circle(9)};
        double perimeterSum = 0;

        for (Figure figure : arr) {
            perimeterSum += figure.perimeter();

        }
        System.out.println("Sum of perimeters = " + perimeterSum);
    }
}
