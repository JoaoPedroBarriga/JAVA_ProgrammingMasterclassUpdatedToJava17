package Classes_032_Through_039;

import javax.swing.*;
import java.net.URL;

public class _039_OperatorPrecedenceAndOperatorChallenge {

    public static void main(String[] args) {

        ImageIcon imageIcon = new ImageIcon("resources/_039_OperatorPrecedenceAndOperatorChallenge.png");
        JLabel label = new JLabel(imageIcon);
        JPanel panel = new JPanel();
        panel.add(label);
        JFrame frame = new JFrame();
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);

        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myValuesTotal = (myFirstValue + mySecondValue) * 100.00d;
        System.out.println("MyValuesTotal = " + myValuesTotal);
        double theRemainder = myValuesTotal % 40.00d;
        System.out.println("theRemainder = " + theRemainder);
        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some remainder");

        }
    }

}


