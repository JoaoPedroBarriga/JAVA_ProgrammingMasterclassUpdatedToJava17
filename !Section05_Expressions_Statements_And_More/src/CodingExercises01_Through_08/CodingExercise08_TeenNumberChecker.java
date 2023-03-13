package CodingExercises01_Through_08;

public class CodingExercise08_TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));  //should return true since 19 is in range 13 - 19

        System.out.println(hasTeen(23, 15, 42));  //should return true since 15 is in range 13 - 19

        System.out.println(hasTeen(22, 23, 34));  //should return false since numbers 22, 23, 34 are not in range 13-19

        System.out.println(isTeen(9)); //should return false since 9 is in not range 13 - 19

        System.out.println(isTeen(13));  //should return true since 13 is in range 13 - 19
    }

    public static boolean hasTeen(int a, int b, int c) {
        return a > 12 && a < 20 || b > 12 && b < 20 || c > 12 && c < 20;
    }

    public static boolean isTeen(int a) {
        return a > 12 && a < 20;
    }
}
