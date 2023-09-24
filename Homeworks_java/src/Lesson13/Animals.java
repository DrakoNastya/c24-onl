package Lesson13;

import java.util.LinkedList;

public class Animals {
    //Задача 2:
    //Создать класс, который будет хранить в себе коллекцию с названиями животных.
    //Реализовать методы удаления и добавления животных по следующим правилам:
    //добавляется всегда в начало коллекции, а удаляется всегда из конца. Показать работу
    //объекта этого класса в main методе другого класса.
    private LinkedList<String> animals;
    public Animals(){
      animals = new LinkedList<>();
    }
public void addAnimal(String type ) {
    animals.addFirst(type);
}
    public void removeAnimal( ) {
        animals.remove(animals.getLast());
    }
    public void animal( ) {
        System.out.println("Your list of animals: ");
        for (String animal: animals){
            System.out.println( animal);
        }
    }
            }






