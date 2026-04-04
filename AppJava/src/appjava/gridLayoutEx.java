package appjava;
import javax.swing.*;
import java.awt.*;

public class gridLayoutEx {

    {
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        
        JFrame frame = new JFrame("Border Layout Management Example");
        
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);
        frame.add(btn5);
        
        // frame.setLayout(new GridLayout(3,2));
        
        // (new GridLayout(row, column, gap-x, gap-y)
        frame.setLayout(new GridLayout(3,2,5,5));
        frame.setVisible(true);
        frame.setSize(400,400);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new gridLayoutEx();
    }
    
}
