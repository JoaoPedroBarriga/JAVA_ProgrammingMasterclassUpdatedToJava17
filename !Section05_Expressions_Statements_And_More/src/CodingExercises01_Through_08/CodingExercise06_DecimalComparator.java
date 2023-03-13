package CodingExercises01_Through_08;

public class CodingExercise06_DecimalComparator {
    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));  // should return true since numbers are equal up to 3 decimal places.

        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));     // should return false since numbers are not equal up to 3 decimal places

        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));         // should return true since numbers are equal up to 3 decimal places.

        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));    // should return false since numbers are not equal up to 3 decimal places.

    }

    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {

        if (first < 0 && second > 0 || first > 0 && second < 0) {
            return false;
        }
        // you can cast directly without using second pair or double
        int i = (int) (first * 1000);
        int j = (int) (second * 1000);

        if (i == j) {
            return true;
        }
        return false;
    }
}
