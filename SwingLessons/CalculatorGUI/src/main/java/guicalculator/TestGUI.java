package guicalculator;


import listeners.CalcTextFocusListener;
import listeners.CalculateButtonListener;

import javax.swing.*;
import javax.swing.plaf.metal.MetalLookAndFeel;
import java.awt.*;


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
        numInOne = new MyJTextField(10, "Input chislo");
        numInTwo = new MyJTextField(10, "Input chislo");
        resultOut = new MyJTextField(20);
        resultOut.setEditable(false);
        //  resultOut.setFocusable(false);
        addTextFieldListeners();

    }

    private void createButtons () {
        plus = new MyJButton("+", 100, 100);
//        plus.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed (ActionEvent e) {
//                JOptionPane.showMessageDialog(paneleTwo, "r33t3t3t33t");
//            }
//        });
        minus = new MyJButton("-");
        multiply = new MyJButton("*");
        divide = new MyJButton("/");
        addButtonListeners();
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

    public void addButtonListeners () {
        CalculateButtonListener bl = new CalculateButtonListener(numInOne, numInTwo, resultOut);
        plus.addActionListener(bl);
        minus.addActionListener(bl);
        multiply.addActionListener(bl);
        divide.addActionListener(bl);
    }

    public void addTextFieldListeners() {
        numInTwo.addFocusListener(new CalcTextFocusListener(numInTwo));
        numInOne.addFocusListener(new CalcTextFocusListener(numInOne));

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
