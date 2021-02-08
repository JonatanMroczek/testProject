public class Calculator {


    public static void main(String[] args) {

        System.out.println(add(5,10));
        System.out.println(substract(5,10));
        System.out.println(multiply(5,10));
        System.out.println(divide(5,10));

    }
    public static int add (int value1, int value2) {
        return value1 + value2;
    }
    public static int substract (int value1, int value2) {
        return value1 - value2;
    }
    public static int multiply (int value1, int value2) {
        return value1 * value2;
    }
    public static int divide (int value1, int value2) {
        return value1 / value2;
    }

}