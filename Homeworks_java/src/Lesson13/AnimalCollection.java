package Lesson13;

import java.util.LinkedList;

public class AnimalCollection {
    //Задача 2:
    //Создать класс, который будет хранить в себе коллекцию с названиями животных.
    //Реализовать методы удаления и добавления животных по следующим правилам:
    //добавляется всегда в начало коллекции, а удаляется всегда из конца. Показать работу
    //объекта этого класса в main методе другого класса.
    private LinkedList<Animal> animals = new LinkedList<>();

    @Override
    public String toString() {
        return animals.toString();
    }

    public boolean addAnimal(Animal animal) {
        return animals.add(animal);
    }

    public Animal removeAnimal() {
        return animals.removeLast();
    }
}




