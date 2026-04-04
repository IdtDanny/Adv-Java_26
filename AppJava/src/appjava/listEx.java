package appjava;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class listEx {

    {
        JFrame frame = new JFrame("List Example");
        Label label = new   Label("Select Program to Display");
        JButton close = new JButton("x");
        JButton show = new JButton("Show");
        
        close.setBounds(300, 60, 50, 30);
        show.setBounds(300, 170, 80, 30);
        
        label.setSize(400,50);
        label.setAlignment(Label.CENTER);
        
        List l1 = new List(5);
        l1.setBounds(20, 70, 200, 100);
        l1.add("C++");
        l1.add("Java");
        l1.add("C#");
        l1.add("Swift");
        l1.add("Python");
        
        List l2 = new List(5);
        l2.setBounds(20, 200, 200, 100);
        l2.add("John");
        l2.add("Claude");
        l2.add("Manual");
        l2.add("Help");
        l2.add("Sing");
        
        close.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
        
        show.addActionListener((ActionEvent l) -> {
            String data = "The selected program are ";
            
            for(String selected: l1.getSelectedItems()){
                data += selected;
            }
            
            label.setText(data);
        });
        
        
        frame.add(label);
        frame.add(l1);
        frame.add(l2);
        frame.add(close);
        frame.add(show);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new listEx();
    }
    
}
