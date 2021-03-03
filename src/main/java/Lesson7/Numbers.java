package Lesson7;

import static Lesson7.DivisibilityBy2.isDivisibileBy2;
import static Lesson7.SumOfDigits.addDigits;

public class Numbers {
    public static void main(String[] args) {
        int value = 123;
        System.out.println("Divisible by 2: " + isDivisibileBy2(value));
        System.out.println("Sum of digits = " + addDigits(String.valueOf(value)));


    }
}









