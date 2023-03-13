package CodingExercises01_Through_08;

public class CodingExercise05_LeapYearCalculator {
    public static void main(String[] args) {
        System.out.println(isLeapYear(2012));
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
    }


    public static boolean isLeapYear(int year) {
        boolean leapYear = false;
        if (year <= 0 || year > 9999) {
            return leapYear;
        } else if (year % 4 == 0) {
            leapYear = true;
        }
        if (year % 100 == 0 && year % 400 != 0) {
            leapYear = false;
        }
        return leapYear;

    }


}
