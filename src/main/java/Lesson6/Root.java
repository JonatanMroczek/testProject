package Lesson6;

public class Root {
    public static void main(String[] args) {
        System.out.println(calculateRoot(-2));

    }
    public static double calculateRoot(double a) {
        if (a < 0) throw new IllegalArgumentException("Can't calculate root from negative value");
        return Math.sqrt(a);
    }


}