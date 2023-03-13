package CodingExercises01_Through_08;

public class CodingExercise04_BarkingDog {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23)
            return false;
        else if (hourOfDay > 22 || hourOfDay < 8 && barking == true)
            return true;
        else
            return false;
    }
}
