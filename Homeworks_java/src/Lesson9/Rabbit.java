package Lesson9;

public class Rabbit implements Animal{
    @Override
    public void voice() {
        System.out.println("Hrr");
    }

    @Override
    public void eat(String food) {
        if (food == "Grass") {
            System.out.println("Rabbits love grass");
        }
        else{
            System.out.println("Rabbits don't like to eat it");
        }
    }
}
