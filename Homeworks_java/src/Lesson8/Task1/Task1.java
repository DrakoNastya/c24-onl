package Lesson8.Task1;

public class Task1 {
    //Задача 1:
    //Создать классы "Директор", "Рабочий", "Бухгалтер". Реализовать интерфейс с методом,
    //который печатает название должности и имплементировать этот метод в созданные
    //классы.
    public static void main(String[] args) {


        Director director = new Director();
        director.print();
        Worker worker = new Worker();
        worker.print();
        Accountant accountant = new Accountant();
        accountant.print();
    }
}
