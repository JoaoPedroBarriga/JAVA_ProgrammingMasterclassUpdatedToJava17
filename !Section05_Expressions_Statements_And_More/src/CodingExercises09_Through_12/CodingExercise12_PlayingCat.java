package CodingExercises09_Through_12;

public class CodingExercise12_PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));     // should return false since temperature is not in range 25 - 45
        System.out.println(isCatPlaying(false, 36));    // should return false since temperature is not in range 25 - 35 (summer parameter is false)
        System.out.println(isCatPlaying(false, 35));    // should return true since temperature is in range 25 - 35
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer == true) {
            if (temperature >= 25 && temperature <= 45) {
                return true;
            } else {
                return false;
            }
        } else {
            if (temperature >= 25 && temperature <= 35) {
                return true;
            } else {
                return false;
            }
        }
    }
}
