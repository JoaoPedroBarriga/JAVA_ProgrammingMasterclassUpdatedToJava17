package Classes_032_Through_039;

public class _036_LogicalOrOperator {

    public static void main(String[] args) {

        int topScore = 99;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }


        int secondTopScore = 95;
        //AND: &&
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }
        //OR: ||
        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

    }
}
