package Lesson6;
public class Pesel {
    static String pesel = "940507082a";

    public static void main(String[] args) {
        try {
            isNumeric(pesel);
        } catch (WrongTypeOfDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            isPesel11CharaterLong(pesel);
        } catch (IllegalLengthException ex) {
            System.out.println(ex.getMessage());
        }


    }


    public static boolean isPesel11CharaterLong(String pesel) throws IllegalLengthException {

        if (pesel.length() != 11)
            throw new IllegalLengthException("pesel must be 11 numbers long ");
        else {
            return true;
        }


    }


    public static boolean isNumeric(String pesel) throws WrongTypeOfDataException {
        try {
            Long.parseLong(pesel);
            return true;
        } catch (NumberFormatException ex) {
            throw new WrongTypeOfDataException("pesel must be numeric");
        }
    }
}








