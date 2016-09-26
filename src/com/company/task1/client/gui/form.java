package com.company.task1.client.gui;


import com.company.library.Calculate;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form {
    private JTextField jTextField1;
    private JTextField jTextField2;

    void buildGUI() {

        JFrame theFrame = new JFrame("Java 1 ");
        theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BorderLayout layout = new BorderLayout();
        JPanel background = new JPanel(layout);
        background.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        Box box = new Box(BoxLayout.Y_AXIS);

        jTextField1 = new JTextField();
        jTextField1.setSize(200, 24);
        box.add(jTextField1);

        JButton jButton = new JButton("Calculate");
        jButton.addActionListener(new MySendListener());
        box.add(jButton);

        jTextField2 = new JTextField();
        jTextField2.setSize(200, 24);
        box.add(jTextField2);

        background.add(BorderLayout.EAST, box);

        theFrame.getContentPane().add(background);
        theFrame.setBounds(50, 50, 300, 300);
        theFrame.pack();
        theFrame.setVisible(true);
    }

    private class MySendListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String[] split = jTextField1.getText().split(" ");
            double x = Double.valueOf(split[0]);
            double y = Double.valueOf(split[2]);
            switch (split[1]) {
                case "-":
                    jTextField2.setText(String.valueOf(Calculate.subtraction(x, y)));
                    break;
                case "+":
                    jTextField2.setText(String.valueOf(Calculate.addition(x, y)));
                    break;
                case "*":
                    jTextField2.setText(String.valueOf(Calculate.multiplication(x, y)));
                    break;
                case "/":
                    jTextField2.setText(String.valueOf(Calculate.division(x, y)));
                    break;
            }
        }
    }
}
