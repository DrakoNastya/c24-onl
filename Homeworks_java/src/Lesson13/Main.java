package Lesson13;

import java.util.Collection;

public class Main {
    //  Задача 2:
//  Создать класс, который будет хранить в себе коллекцию с названиями животных.
//  Реализовать методы удаления и добавления животных по следующим правилам:
//  добавляется всегда в начало коллекции, а удаляется всегда из конца. Показать работу
//  объекта этого класса в main методе другого класса.

    public static void main(String[] args) {
        AnimalCollection animals = new AnimalCollection();
        {

            animals.addAnimal(new Animal("Mouse"));
            animals.addAnimal(new Animal("Dog"));
            animals.addAnimal(new Animal("Cat"));
            System.out.println(animals);
            animals.removeAnimal();
            System.out.println(animals);

        }
    }
}



