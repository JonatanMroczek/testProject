public class Triangle {


    public static boolean isRectengular (double lengthA, double lengthB, double lengthC) {
        if (lengthA*lengthA + lengthB*lengthB==lengthC*lengthC){
            return true;
        }
        else {
            return false;
        }
    }
}