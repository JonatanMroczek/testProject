public class Rectangle extends Shape {
  protected final double WIDTH;
  protected final double LENGTH;



    public Rectangle (double WIDTH, double LENGTH) {
        this.WIDTH = WIDTH;
        this.LENGTH = LENGTH;
    }

    public double area() {
        return WIDTH * LENGTH;
    }

    @Override
    public double perimeter() {
        return 2 * (WIDTH + LENGTH);
    }

}
