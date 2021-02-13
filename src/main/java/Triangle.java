public class Triangle extends Shape {


    private final double LENGTH_A;
    private final double LENGTH_B;
    private final double LENGTH_C;
    private final double HEIGHT;

    public Triangle(double LENGTH_A, double LENGTH_B, double LENGTH_C, double HEIGHT) {
        this.LENGTH_A = LENGTH_A;
        this.LENGTH_B = LENGTH_B;
        this.LENGTH_C = LENGTH_C;
        this.HEIGHT = HEIGHT;

    }
    @Override
   public double area () {

        return 0.5* LENGTH_A * HEIGHT;
    }

    @Override
    public double perimeter () {

        return LENGTH_A + LENGTH_B + LENGTH_C;
    }
}

