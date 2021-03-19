package Lesson7;

public class AveragePulse {
    public static double getRatingFromAveragePulse(int averagePulse) {
        if (averagePulse < 160) {
            return 3;
        } else if (averagePulse >= 160 && averagePulse <= 175) {
            return 2;
        } else if (averagePulse > 175) {
            return 1;
        } else {
            throw new IllegalArgumentException();
        }
    }
}

