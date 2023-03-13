package CodingExercises01_Through_08;

public class CodingExercise01_PositiveNegativeZero {
    public static void main(String[] args) {
        checkNumber(5); // prints "positive"
        checkNumber(-10); // prints "negative"
        checkNumber(0); // prints "zero"
    }

    public static void checkNumber(int number) {
        System.out.println((number > 0) ? "positive" : ((number < 0) ? "negative" : "zero"));
    }
}

