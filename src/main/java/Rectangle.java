public class Rectangle extends Shape {
  protected final double width;
  protected final double length;



    public Rectangle (double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double area() {
        return width * length;
    }

    @Override
    public double perimeter() {
        return 2 * (width + length);
    }

}
