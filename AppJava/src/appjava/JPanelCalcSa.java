package appjava;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JPanelCalcSa {

    {
        JFrame calc = new JFrame("Sample Calc: ");
        JTextField field1 = new JTextField();
        JTextField field2 = new JTextField();
        JTextField field3 = new JTextField();
        JButton btn1 = new JButton("Add");
        
        field1.setBounds(25, 60, 50, 30);
        field2.setBounds(80, 60, 50, 30);
        field3.setBounds(135, 60, 50, 30);
        btn1.setBounds(190, 60, 80, 30);

        JLabel label1 = new JLabel("Num1: ");
        JLabel label2 = new JLabel("Num2: ");
        JLabel label3 = new JLabel("Res: ");
        
        label1.setBounds(25, 25, 50, 30);
        label2.setBounds(80, 25, 50, 30);
        label3.setBounds(135, 25, 50, 30);
        
        calc.add(label1);
        calc.add(field1);
        calc.add(label2);
        calc.add(label3);
        calc.add(field2);
        calc.add(field3);
        calc.add(btn1);
        
        calc.setSize(500, 500);
        calc.setLayout(null);
        calc.setVisible(true);
        
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String txt1 = field1.getText();
                String txt2 = field2.getText();
                int num1 = Integer.parseInt(txt1);
                int num2 = Integer.parseInt(txt2);
                int res = num1 + num2;
                field3.setText(""+res);
            }
        });
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new JPanelCalcSa();
    }
    
}
