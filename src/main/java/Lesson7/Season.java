package Lesson7;

import java.time.Month;

public class Season {
    public static void main(String[] args) {
        System.out.println(getSeason(Month.AUGUST));
    }

    static public Seasons getSeason(final Month month) {
        Seasons result = null;

        switch (month) {
            case MARCH, APRIL, MAY -> result = Seasons.WIOSNA;
            case JULY, JUNE, AUGUST -> result = Seasons.LATO;
            case SEPTEMBER, OCTOBER, NOVEMBER -> result = Seasons.JESIEŃ;
            case DECEMBER, JANUARY, FEBRUARY -> result = Seasons.ZIMA;
        }
        return result;
    }
}