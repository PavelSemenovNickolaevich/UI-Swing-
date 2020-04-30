package guicalculator;


import listeners.ButtonListener;

import javax.swing.*;
import javax.swing.plaf.metal.MetalLookAndFeel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TestGUI {

    private MyJButton plus;
    private MyJButton minus;
    private MyJButton multiply;
    private MyJButton divide;

    private MyJLabel num1;
    private MyJLabel num2;
    private MyJLabel result;

    private MyJTextField numInOne;
    private MyJTextField numInTwo;
    private MyJTextField resultOut;

    private MyJPanel paneleOne;
    private MyJPanel paneleTwo;
    private MyJPanel paneleThree;

    //private MyJDialog frame;
    private MyJFrame frame;


    public static void main (String[] args) {
        try {
            UIManager.setLookAndFeel(new MetalLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        JFrame.setDefaultLookAndFeelDecorated(true);

        TestGUI testGUI = new TestGUI();
        testGUI.createLabels();
        testGUI.createTextField();
        testGUI.createButtons();
        testGUI.createPanel();
        testGUI.createFrame();


        //frame.setIconImage(new ImageIcon("C:\\Users\\natit\\Desktop\\pictures\\terminator.png").getImage());
    }

    private void createLabels () {
        num1 = new MyJLabel("Number One");
        num2 = new MyJLabel("Number Two");
        result = new MyJLabel("Result");
    }

    private void createTextField () {
        numInOne = new MyJTextField(10);
        numInTwo = new MyJTextField(10);
        resultOut = new MyJTextField(20);
        resultOut.setEditable(false);
        resultOut.setFocusable(false);

    }

    private void createButtons () {
        plus = new MyJButton("+", 100, 100);
//        plus.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed (ActionEvent e) {
//                JOptionPane.showMessageDialog(paneleTwo, "r33t3t3t33t");
//            }
//        });
        plus.addActionListener(new ButtonListener(paneleTwo));
        minus = new MyJButton("-");
        multiply = new MyJButton("*");
        divide = new MyJButton("/");
    }


    private void createPanel () {
        paneleOne = new MyJPanel("firstPanel", 100, 100);
        paneleOne.setPreferredSize(new Dimension(200, 60));
        paneleOne.setLayout(new FlowLayout(FlowLayout.LEFT, 50, 20));

        paneleOne.add(num1);
        paneleOne.add(numInOne);
        paneleOne.add(num2);
        paneleOne.add(numInTwo);


        paneleTwo = new MyJPanel("secondPanel", 100, 100);
        paneleTwo.setPreferredSize(new Dimension(200, 50));
        paneleTwo.setLayout(new FlowLayout(FlowLayout.LEFT, 100, 50));
        paneleTwo.add(minus);
        paneleTwo.add(plus);
        paneleTwo.add(multiply);
        paneleTwo.add(divide);


        paneleThree = new MyJPanel("thirdPanel", 100, 100);
        paneleThree.setPreferredSize(new Dimension(200, 50));
        paneleThree.setLayout(new FlowLayout(FlowLayout.LEFT, 100, 10));
        paneleThree.add(result);
        paneleThree.add(resultOut);

    }

    private void createFrame () {
        frame = new MyJFrame("Calcularor", 700, 300, new BorderLayout(2, 2));
        //   frame = new MyJDialog("Calcularor", 700, 300, new BorderLayout(2, 2));
        frame.setMinimumSize(new Dimension(700, 300));
        frame.setResizable(false);
        frame.getContentPane().add(paneleOne, BorderLayout.NORTH);
        frame.getContentPane().add(paneleTwo, BorderLayout.CENTER);
        frame.getContentPane().add(paneleThree, BorderLayout.SOUTH);

        frame.setVisible(true);
    }


//    class ButtonListener implements ActionListener {
//
//        @Override
//        public void actionPerformed (ActionEvent e) {
//
//            JOptionPane.showMessageDialog(paneleTwo, "r33t3t3t33t");
//
//        }
//    }
}
