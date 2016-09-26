package com.company.task1.client.guiWebService;

import com.company.task1.webService.CalculateWebService;

import javax.swing.*;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

public class formWebService {
    private JTextField jTextField1;
    private JTextField jTextField2;
    private CalculateWebService hello;

    void buildGUI() throws MalformedURLException {

        URL url = new URL("http://localhost:1986/calculate?wsdl");
        QName qname = new QName("http://webService.task1.company.com/", "CalculateWebServiceImplService");
        Service service = Service.create(url, qname);
        hello = service.getPort(CalculateWebService.class);

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
        jButton.addActionListener(new formWebService.MySendListener());
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
                    jTextField2.setText(String.valueOf(hello.subtraction(x, y)));
                    break;
                case "+":
                    jTextField2.setText(String.valueOf(hello.addition(x, y)));
                    break;
                case "*":
                    jTextField2.setText(String.valueOf(hello.multiplication(x, y)));
                    break;
                case "/":
                    jTextField2.setText(String.valueOf(hello.division(x, y)));
                    break;
            }
        }
    }
}
