package appjava;
import javax.swing.*;

public class actionRadio {


    actionRadio() {
        JFrame frame = new JFrame("Radio Button Example");
        JRadioButton rad1 = new JRadioButton("Male");
        JRadioButton rad2 = new JRadioButton("Female");
        
        rad1.setBounds(20, 30, 100, 30);
        rad2.setBounds(20, 70, 100, 30);
        
        ButtonGroup radg = new ButtonGroup();
        radg.add(rad1); 
        radg.add(rad2);
        
        frame.add(rad1);
        frame.add(rad2);
        
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new actionRadio();
    }
    
}
