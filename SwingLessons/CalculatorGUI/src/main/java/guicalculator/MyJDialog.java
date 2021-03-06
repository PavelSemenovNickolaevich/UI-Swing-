package guicalculator;

import javax.swing.*;
import java.awt.*;

public class MyJDialog extends JDialog {
    public MyJDialog (String title, int width, int height) {
        super.setTitle(title);
        super.setSize(width, height);
        super.setLocationRelativeTo(null);
        //  super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setVisible(true);
        super.setLayout(new FlowLayout());

    }

    public MyJDialog (String title, int width, int height, Component comp) {
        this(title, width, height);
        super.getContentPane().add(comp);
    }

    public MyJDialog (String title, int width, int height, LayoutManager layout) {
        super.setTitle(title);
        super.setSize(width, height);
        super.setLocationRelativeTo(null);
        //    super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLayout(layout);

    }
}
