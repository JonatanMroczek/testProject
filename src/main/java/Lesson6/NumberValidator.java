package Lesson6;

public class NumberValidator {
    public static void main(String[] args) {
        validate(new int[]{10, 11, 20, 30});
    }

    public static void validate(int[] values) {
        int i;
        for (i = 0; i < 4; i++) {
            try {
                if (values[i] % 3 != 0) {
                    throw new IllegalArgumentException("Liczba:" + values[i] + " Nie jest podzielna przez 3");

                } else System.out.println("Liczba:" + values[i] + " Jest podzielna przez 3");

            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }


        }
    }
}
