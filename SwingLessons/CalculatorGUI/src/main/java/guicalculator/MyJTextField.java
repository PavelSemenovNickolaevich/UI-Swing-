package guicalculator;

import javax.swing.*;
import java.awt.*;

public class MyJTextField extends JTextField {
    public MyJTextField (int num, Component comp) {
        super(num);
        super.add(comp);
    }

    public MyJTextField (int num) {
        super(num);
    }
}
