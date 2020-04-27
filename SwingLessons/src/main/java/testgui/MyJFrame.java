package testgui;

import javax.swing.*;
import java.awt.*;

public class MyJFrame extends JFrame {

    public  MyJFrame(String title, int width, int height) {
        super(title);
        super.setSize(width, height);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setVisible(true);
        super.setLayout(new FlowLayout());
        super.setLocationRelativeTo(null);

    }
}
