package CodingExercises09_Through_12;

public class CodingExercise11_EqualityPrinter {
    public static void main(String[] args) {
        printEqual(1, 1, 1);        // should print text All numbers are equal
        printEqual(1, 1, 2);        // should print text Neither all are equal nor different
        printEqual(-1, -1, -1);     // should print text Invalid Value
        printEqual(1, 2, 3);        // should print text All numbers are different
    }

    public static void printEqual(int i1, int i2, int i3) {
        if (i1 < 0 || i2 < 0 || i3 < 0) {
            System.out.println("Invalid Value");
        } else {
            if (i1 == i2 && i2 == i3) {
                System.out.println("All numbers are equal");

            } else {
                if (i1 != i2 && i2 != i3 && i1 != i3) {
                    System.out.println("All numbers are different");
                } else {
                    System.out.println("Neither all are equal nor different");
                }
            }
        }
    }
}
