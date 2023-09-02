package Lesson8.Task2;

public class Circle implements Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        double pi = Math.PI;

        return 2 * pi * radius;
    }

    @Override
    public double area() {
        double pi = Math.PI;
        return pi * radius * radius;

    }
}
