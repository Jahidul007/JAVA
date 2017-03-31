
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;


public class DrawingMore {

   
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame f = new JFrame("TITLE");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Peach p = new Peach();
        p.setBackground(Color.WHITE);
        p.add(p);
        p.setSize(300,200);
        p.setVisible(true);
    }
    
}
