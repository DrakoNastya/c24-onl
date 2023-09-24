package Lesson13;

public class AnimalCollection extends Animals{
    public static void main(String[] args) {
        AnimalCollection animalCollection =new AnimalCollection();
        animalCollection.addAnimal("Horse");
        animalCollection.addAnimal("Dog");
        animalCollection.addAnimal("Mouse");
        animalCollection.animal();
        animalCollection.removeAnimal();
        animalCollection.animal();

    }
}
