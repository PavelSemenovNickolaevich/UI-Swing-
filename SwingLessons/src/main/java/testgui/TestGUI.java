package testgui;


import javax.swing.*;
import javax.swing.plaf.metal.MetalLookAndFeel;
import java.awt.*;


public class TestGUI {

    public static void main (String[] args) {
        try {
            UIManager.setLookAndFeel(new MetalLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        JFrame.setDefaultLookAndFeelDecorated(true);
        MyJButton button = new MyJButton("Test QA");
        MyJFrame frame = new MyJFrame("Test", 300, 300);
        MyJPanel panel = new MyJPanel("TestQA", 300, 300);
        frame.setIconImage(new ImageIcon("C:\\Users\\natit\\Desktop\\pictures\\terminator.png")
                .getImage());
        frame.getContentPane().add(panel);
        panel.add(button);

    }

}
