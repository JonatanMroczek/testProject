public class Circle extends Shape {
    private final double RADIUS;

    public Circle (double RADIUS){
        this.RADIUS = RADIUS;
    }

    @Override
   public double area () {
        return Math.PI* RADIUS * RADIUS;
    }
    @Override
    public double perimeter() {
        return 2*Math.PI* RADIUS;
    }
}
