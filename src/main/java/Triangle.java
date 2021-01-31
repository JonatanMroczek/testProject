import java.lang.Math;
public class Triangle {
    private double angleA;
    private double angleB;
    private double angleC;

    public static String checkIfTirangleIsRectangular(double angleA, double angleB, double angleC) {
        if (Math.sqrt(angleA) + Math.sqrt(angleB) == Math.sqrt(angleC)) {

            return ("This Triangle is Rectangual");
        }
        else

    {
        return "This Triangle is not Rectangual";
    }
}
}
