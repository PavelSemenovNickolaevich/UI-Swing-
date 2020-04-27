package testgui;


import javax.swing.*;
import java.awt.*;


public class TestGUI {

    public static void main (String[] args) {
        MyJButton button = new MyJButton("Test QA");
        MyJFrame frame = new MyJFrame("Test", 200, 200);
        MyJPanel panel = new MyJPanel("TestQA", 300, 300);
        frame.add(panel);
        panel.add(button);

    }

}
