package guicalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJButton extends JButton   {


    public MyJButton(String name, int width, int height) {
        super(name);
        super.setSize(width, height);
    }

        public MyJButton(String name) {
            super(name);
        }


}
