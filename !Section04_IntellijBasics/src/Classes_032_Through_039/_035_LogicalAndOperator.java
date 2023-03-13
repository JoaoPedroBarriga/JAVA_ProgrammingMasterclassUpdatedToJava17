package Classes_032_Through_039;

public class _035_LogicalAndOperator {

    public static void main(String[] args) {

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 81;
        //&& <- AND operator

        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }


    }
}
