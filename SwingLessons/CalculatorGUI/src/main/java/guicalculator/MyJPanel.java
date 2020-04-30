package guicalculator;

import javax.swing.*;
import java.awt.*;

public class MyJPanel extends JPanel {

    public MyJPanel(String name, int width, int height) {
        super.setName(name);
        super.setSize(width, height);
        super.setBorder(BorderFactory.createEtchedBorder());
    }


    public MyJPanel (String name, int width, int height, Component comp) {
        super.setName(name);
        super.setSize(width, height);
        super.setBorder(BorderFactory.createEtchedBorder());
        super.add(comp);

    }
}
