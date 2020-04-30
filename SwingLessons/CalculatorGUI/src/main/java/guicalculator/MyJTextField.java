package guicalculator;

import javax.swing.*;
import java.awt.*;

public class MyJTextField extends JTextField {
    public MyJTextField (int num, String text) {
        super(num);
        super.setText(text);
    }

    public MyJTextField (int num) {
        super(num);
        Font font = new Font ("Courier", Font.ITALIC, 12 );
        super.setFont(font);
        super.setForeground(Color.GRAY);
    }
}
