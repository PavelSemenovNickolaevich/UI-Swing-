package listeners;

import calc.CalcOperations;
import guicalculator.MyJTextField;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculateButtonListener implements ActionListener {
    private MyJTextField numInOne;
    private MyJTextField numInTwo;
    private MyJTextField resultOut;


    public CalculateButtonListener (MyJTextField numInOne, MyJTextField numInTwo, MyJTextField resultOut) {
        this.numInOne = numInOne;
        this.numInTwo = numInTwo;
        this.resultOut = resultOut;
    }

    @Override
    public void actionPerformed (ActionEvent e) {
        if ((e.getSource() instanceof JButton)) {

            JButton button = (JButton) e.getSource();
            final double a = Double.parseDouble(numInOne.getText());
            final double b = Double.parseDouble(numInTwo.getText());
            if (button.getActionCommand().equals("+")) {
                resultOut.setText(String.valueOf(CalcOperations.add(a, b)));
            } else if (button.getActionCommand().equals("-")) {
                resultOut.setText(String.valueOf(CalcOperations.minus(a, b)));
            } else if (button.getActionCommand().equals("*")) {
                resultOut.setText(String.valueOf(CalcOperations.multiply(a, b)));
            } else if (button.getActionCommand().equals("/")) {
                resultOut.setText(String.valueOf(CalcOperations.divide(a, b)));
            }
            //   JOptionPane.showMessageDialog(panel, "Sign from  " + button.getText());
        }
        //   System.out.println(e.getSource());
        //  JOptionPane.showMessageDialog(panel, "r33t3t3t33t");
    }
}
