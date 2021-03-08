package Lesson7;

public class TrainingTimeRating {
    public static double getRatingFromTrainingTime(int trainingTime) {
        if (trainingTime < 30) {
            return 1;
        } else if (trainingTime >= 30 && trainingTime <= 60) {
            return 2;
        } else if (trainingTime > 60) {
            return 3;
        } else {
            throw new IllegalArgumentException();
        }
    }
}

