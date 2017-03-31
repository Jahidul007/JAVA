import javax.swing.*;

public class DrawingGraphics {

    public static void main(String[] args) {
        
        JFrame f = new JFrame("TITLE");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Graphic g = new Graphic();
        g.add(g);
        g.setSize(300,200);
        f.setVisible(true);
    }
    
}
