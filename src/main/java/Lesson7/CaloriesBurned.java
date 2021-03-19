package Lesson7;

public class CaloriesBurned {
    public static double getRatingFromCaloriesBurned(int caloriesBurned) {
        if (caloriesBurned <= 300) {
            return 1;
        } else if (caloriesBurned > 300 && caloriesBurned < 400) {
            return 2;
        } else if (caloriesBurned > 400) {
            return 3;
        } else {
            throw new IllegalArgumentException();
        }
    }
}

