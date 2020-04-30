package guicalculator;

import javax.swing.*;
import java.awt.*;

public class MyJFrame extends JFrame {

    public  MyJFrame (String title, int width, int height, LayoutManager layout) {
        super(title);
        super.setSize(width, height);
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setVisible(true);
        super.setLayout(layout);
    }
    public  MyJFrame (String title, int width, int height, Component comp) {
            super(title);
            super.setSize(width, height);
            super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            super.setVisible(true);
            super.add(comp, BorderLayout.SOUTH);

    }

    public  MyJFrame (String title, int width, int height,JPanel panel, Component comp) {
        super(title);
        super.setSize(width, height);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setVisible(true);
        super.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        super.add(comp);

    }
}
