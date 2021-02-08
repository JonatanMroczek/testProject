public class Triangle extends Shape {


    private final double LengthA;
    private final double lengthB;
    private final double lengthC;
    private final double height;

    public Triangle(double lengthA, double lengthB, double lengthC, double height) {
        this.LengthA = lengthA;
        this.lengthB = lengthB;
        this.lengthC = lengthC;
        this.height = height;

    }
    @Override
   public double area () {

        return 0.5* LengthA * height;
    }

    @Override
    public double perimeter () {

        return LengthA + lengthB + lengthC;
    }
}

