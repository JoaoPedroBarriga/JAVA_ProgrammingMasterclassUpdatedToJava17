package Classes_041_Through_050;

public class _041_KeywordsAndExpressions {
    public static void main(String[] args) {
        double kilometers = (100 * 1.609344);

        int highScore = 50;

        if (highScore > 25) {
            highScore = 1000 + highScore;     // add bonus points
        }

        int health = 100; //Expression

        if ((health < 25) && (highScore > 1000)) { //Two Expressions + ONE/BOTH Expression
            highScore = highScore - 1000; // Two Expressions
        }
    }
}