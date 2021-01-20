public class EvenOrUnevenNumber {
    public static void main(String[] args) {
        System.out.println(evenOrUneven(10));

    }
    public static String evenOrUneven (int a) {
    if (a % 2 == 0) {
        return "This number is even";
    }
    else {
        return "This number is uneven";
    }
}
}