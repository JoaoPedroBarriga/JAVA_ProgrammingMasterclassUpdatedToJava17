package CodingExercises01_Through_08;

public class CodingExercise02_SpeedConverter {

    public static void main(String[] args) {
        System.out.println(SpeedConverter.toMilesPerHour(1.5)); // should print 1
        System.out.println(SpeedConverter.toMilesPerHour(10.25)); // should print 6
        System.out.println(SpeedConverter.toMilesPerHour(-5.6)); // should print -1
        System.out.println(SpeedConverter.toMilesPerHour(25.42)); // should print 16
        System.out.println(SpeedConverter.toMilesPerHour(75.114)); // should print 47
    }


//        public static void main(String[] args) {
//            SpeedConverter.printConversion(1.5); // should print "1.5 km/h = 1 mi/h"
//            SpeedConverter.printConversion(10.25); // should print "10.25 km/h = 6 mi/h"
//            SpeedConverter.printConversion(-5.6); // should print "Invalid Value"
//            SpeedConverter.printConversion(25.42); // should print "25.42 km/h = 16 mi/h"
//            SpeedConverter.printConversion(75.114); // should print "75.114 km/h = 47 mi/h"
//        }


    public class SpeedConverter {

        public static long toMilesPerHour(double kilometersPerHour) {
            if (kilometersPerHour < 0) {
                return -1;
            } else {
                return Math.round(kilometersPerHour / 1.609);
            }
        }

        public static void printConversion(double kilometersPerHour) {
            if (kilometersPerHour < 0) {
                System.out.println("Invalid Value");
            } else {
                long round = toMilesPerHour(kilometersPerHour);
                System.out.println(kilometersPerHour + " km/h = " + round + " mi/h");
            }
        }
    }
}
