package Lesson8.Task2;

public class Rectangle implements Figure {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double perimeter() {
        return 2 * (width + length);

    }

    @Override
    public double area() {
        return width * length;

    }
}
