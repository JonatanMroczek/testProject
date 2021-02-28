
public class Circle implements Shape {

    private double radius;
    private final double pi = 3.14;

    public Circle(double radius) {

public class Circle extends Shape {
    private final double radius;

    public Circle (double radius){

    }

    @Override

    public double area() {
        return pi * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2*pi*radius;

    }
}
