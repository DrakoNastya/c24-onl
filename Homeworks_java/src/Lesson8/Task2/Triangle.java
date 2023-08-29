package Lesson8.Task2;

public class Triangle implements Figure {
    private double height1;
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double height1, double side1, double side2, double side3) {
        this.height1 = height1;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double perimeter() {


        return side1 + side2 + side3;
    }

    @Override
    public double area() {
        return (height1 * side1) / 2;

    }
}
