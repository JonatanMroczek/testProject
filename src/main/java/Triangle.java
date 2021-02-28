
public class Triangle {


    public static boolean isRectengular (double lengthA, double lengthB, double lengthC) {
        if (lengthA*lengthA + lengthB*lengthB==lengthC*lengthC){
            return true;
        }
        else {
            return false;
        }
    }
}

public class Triangle extends Shape {


    private final double lengthA;
    private final double lengthB;
    private final double lengthC;
    private final double height;

    public Triangle(double lengthA, double lengthB, double lengthC, double height) {
        this.lengthA = lengthA;
        this.lengthB = lengthB;
        this.lengthC = lengthC;
        this.height = height;

    }
    @Override
   public double area () {

        return 0.5* lengthA * height;
    }

    @Override
    public double perimeter () {

        return lengthA + lengthB + lengthC;
    }
}


