package Lesson7;


import static java.lang.Math.round;

public class TrainingEfficiency {
    private static int caloriesBurned = 301;
    private static int trainingTime = 20;
    private static int averagePulse = 160;
    private static double trainingEfficiencyScore;

    public static void main(String[] args) {
        trainingEfficiencyCalculator(trainingTime, caloriesBurned, averagePulse);
        System.out.println(trainingEfficiencyScore);
        System.out.println(trainingEfficiency(trainingEfficiencyScore));
    }


    public static double trainingEfficiencyCalculator(int trainingTime, int caloriesBurned, int averagePulse) {
        if (trainingTime < 0 || caloriesBurned < 0 || averagePulse < 0 ) throw new IllegalArgumentException("Arguments can not be negative");
        double result = ((TrainingTimeRating.getRatingFromTrainingTime(trainingTime) * 1 + CaloriesBurned.getRatingFromCaloriesBurned(caloriesBurned) * 2 + AveragePulse.getRatingFromAveragePulse(averagePulse) * 3) / 6);
        result = Math.round(result * 100d) / 100d;
        trainingEfficiencyScore = result;
        return result;
    }


    public static String trainingEfficiency(double trainingEfficiencyScore) {
        if (trainingEfficiencyScore < 1.2) {
            return "Low training efficiency";
        } else if (trainingEfficiencyScore >= 1.2 && trainingEfficiencyScore < 2) {
            return "Good training efficiency";
        } else if (trainingEfficiencyScore >= 2 && trainingEfficiencyScore < 3) {
            return "Very good training efficiency";
        } else if (trainingEfficiencyScore == 3) {
            return "Excellent training efficiency";
        } else throw new IllegalArgumentException();
    }

}
