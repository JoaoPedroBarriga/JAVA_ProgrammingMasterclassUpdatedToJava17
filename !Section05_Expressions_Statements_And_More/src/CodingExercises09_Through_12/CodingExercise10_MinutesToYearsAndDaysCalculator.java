package CodingExercises09_Through_12;

public class CodingExercise10_MinutesToYearsAndDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);  // should print "525600 min = 1 y and 0 d"
        printYearsAndDays(1051200); // should print "1051200 min = 2 y and 0 d"
        printYearsAndDays(561600);  //should print "561600 min = 1 y and 25 d"
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long hours = minutes / 60;
            long days = hours / 24;
            long years = days / 365;
            long remainingDays = days % 365;

            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
        }
    }

    //public static void printYearsAndDays(long minutes) {
    //        if (minutes < 0) {
    //            System.out.println("Invalid Value");
    //
    //        } else {
    //            long YY = minutes / (60 * 24 * 365);
    //            long DD = minutes % (60 * 24 * 365);
    //            long ZZ = DD / (60 * 24);
    //            System.out.println(""+minutes+" min = "+YY+" y and "+ZZ+" d");
    //        }
    //    }
}
