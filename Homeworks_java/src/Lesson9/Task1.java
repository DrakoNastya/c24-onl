package Lesson9;

public class Task1 {
    //Задача 1:
    //Создать логически верную иерархию следующих классов: Animal, Dog, Tiger, Rabbit.
    //Переопределить методы voice(), eat(String food) чтобы они выводили верную
    //информацию. Метод eat может принимать “Meat”, “Grass” и другие строки.
    //Например, если мы создадим объект класса Rabbit, вызовем метод eat() и передадим
    //туда “Grass” он должен написать в консоли что любит есть травку. Если передадим “Meat”
    //или другую строку то он будет недоволен.
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat("Meat");
        dog.voice();
        Rabbit rabbit = new Rabbit();
        rabbit.eat("Grass");
        rabbit.voice();
        Tiger tiger = new Tiger();
        tiger.eat("Meat");
        tiger.voice();
    }
}
