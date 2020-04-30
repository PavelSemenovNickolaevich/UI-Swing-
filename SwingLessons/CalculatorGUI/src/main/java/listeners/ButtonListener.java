package listeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {
    private JPanel paneleTwo;

    public  ButtonListener(JPanel paneleTwo) {
        this.paneleTwo = paneleTwo;
    }

    @Override
    public void actionPerformed (ActionEvent e) {
        JOptionPane.showMessageDialog(paneleTwo, "r33t3t3t33t");
    }
}
