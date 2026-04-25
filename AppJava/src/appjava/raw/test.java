package appjava.raw;

import javax.swing.*;
import javax.swing.tree.*;

public class test {
    test(){
        JFrame f = new JFrame();
        
        DefaultMutableTreeNode style = new DefaultMutableTreeNode("Style");
        DefaultMutableTreeNode color = new DefaultMutableTreeNode("Color");
        DefaultMutableTreeNode red = new DefaultMutableTreeNode("Red");
        DefaultMutableTreeNode blue = new DefaultMutableTreeNode("Blue");
        DefaultMutableTreeNode black = new DefaultMutableTreeNode("Black");
        DefaultMutableTreeNode green = new DefaultMutableTreeNode("Green");
        DefaultMutableTreeNode font = new DefaultMutableTreeNode("Font");
        
        style.add(color); style.add(font);
        color.add(red); color.add(blue); color.add(black); color.add(green);
        
        JTree jt = new JTree(style);
        
        f.add(jt);
        
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
    }
    public static void main(String[] args) {
        new test();
    }    
}
