package Lesson7;

import static java.lang.String.valueOf;

public class SumOfDigits {



    public static String addDigits (String number){

        int value = Integer.parseInt(number);
        int sum = 0;
        while (value > 0) {
            sum = sum + value % 10;
            value = value / 10;

        } return String.valueOf(sum);

    }

}

