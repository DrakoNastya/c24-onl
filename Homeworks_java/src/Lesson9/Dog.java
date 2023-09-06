package Lesson9;

public class Dog implements Animal{
    @Override
    public void voice() {
        System.out.println("Woof");
    }

    @Override
    public void eat(String food) {
        if (food == "Meat") {
            System.out.println("Dogs love meat");
        }
        else{
            System.out.println("Dogs don't like to eat it");
        }
    }
}
