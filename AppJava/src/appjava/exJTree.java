package appjava;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class exJTree {

    exJTree() {
        JFrame frame = new JFrame("Radio Button Example");
        
        DefaultMutableTreeNode style = new DefaultMutableTreeNode("Style");
        DefaultMutableTreeNode color = new DefaultMutableTreeNode("Color");
        DefaultMutableTreeNode font = new DefaultMutableTreeNode("Font");
        
        style.add(color);
        style.add(font);
        
        DefaultMutableTreeNode red = new DefaultMutableTreeNode("Red");
        DefaultMutableTreeNode green = new DefaultMutableTreeNode("Green");
        DefaultMutableTreeNode blue = new DefaultMutableTreeNode("Blue");
        
        color.add(red);
        color.add(green);
        color.add(blue);
        
        JTree jt = new JTree(style);
        
        frame.add(jt);
        
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setLayout(null);
    }
    public static void main(String[] args) {
        // TODO code application logic here
            new exJTree();
    }
    
}
