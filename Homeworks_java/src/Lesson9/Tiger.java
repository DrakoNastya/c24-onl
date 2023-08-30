package Lesson9;

public class Tiger implements Animal{
    @Override
    public void voice() {
        System.out.println("Roar");
    }

    @Override
    public void eat(String food) {
        if (food == "Meat") {
            System.out.println("Tigers love meat");
        }
        else{
            System.out.println("Tigers don't like to eat it");
        }
    }
}
