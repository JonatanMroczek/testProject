public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println(evenOrOdd(10));

    }
    public static String evenOrOdd (int a) {
        if (a % 2 == 0) {
            return "This number is even";
        }
        else {
            return "This number is odd";
        }
    }
}
