package listeners;

import guicalculator.MyJTextField;
import guicalculator.TestGUI;

import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class CalcTextFocusListener implements FocusListener {

    private  MyJTextField field;



    public CalcTextFocusListener (MyJTextField field) {
        this.field = field;
    }

    @Override
    public void focusGained (FocusEvent e) {
        if (field.getText().equals("Input chislo")) {
            field.setText("");
            field.setForeground(Color.GRAY);
        }
    }

    @Override
    public void focusLost (FocusEvent e) {
        if (field.getText().equals("")) {
            field.setText("Input chislo");
            field.setForeground(Color.RED);
        }

    }
}
