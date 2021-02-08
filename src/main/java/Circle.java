public class Circle extends Shape {
    private final double radius;
    private final double pi = Math.PI;

    public Circle (double radius){
        this.radius = radius;
    }

    @Override
   public double area () {
        return pi*radius*radius;
    }
    @Override
    public double perimeter() {
        return 2*pi*radius;
    }
}
