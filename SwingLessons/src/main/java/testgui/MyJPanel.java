package testgui;

import javax.swing.*;
import java.awt.*;

public class MyJPanel extends JPanel {

    public MyJPanel(String name, int width, int height) {
        super.setName(name);
        super.setSize(width, height);
        super.setBorder(BorderFactory.createEtchedBorder());
    }

    public MyJPanel(String name, int width, int height, LayoutManager layout, Component comp) {
        super.setName(name);
        super.setSize(width, height);
        super.setBorder(BorderFactory.createEtchedBorder());
        super.setLayout(layout);
        super.add(comp);

    }
}
