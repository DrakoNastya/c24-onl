package Lesson9;

public interface Animal {
    String food = null;
     default void voice(){
        System.out.println("Sound");}
        void eat(String food);
    }

