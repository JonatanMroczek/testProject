
public class Rectangle implements Shape{

    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
    }

    @Override
    public double area () {
        return  length * width;

    }

    @Override
    public double perimeter() {

        return (length + width) * 2;
    }

}
