import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Gui extends JFrame {
    private JPanel mousepanel;
    private JLabel statusbar;
    
    public Gui()
    {
        super("THE TITLE");
        
        mousepanel =new JPanel();
        mousepanel.setBackground(Color.white);
        add(mousepanel,BorderLayout.CENTER);
        
        statusbar = new JLabel("default");
        add(statusbar ,BorderLayout.SOUTH);
        
        Handlerclass handler = new Handlerclass() {
            @Override
            public void mousePressed(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        mousepanel.addMouseListener(handler);
        mousepanel.addMouseMotionListener(handler);
    }
   public abstract class Handlerclass implements MouseListener,MouseMotionListener
    {
        public void mouseClicked(MouseEvent event)
        {
            statusbar.setText(String.format("Clicked at %d %d",event.getX(),event.getY()));
        }
        public void mousePrassed(MouseEvent event)
        {
             statusbar.setText("You released the button");
        }
        public void mouseEntered(MouseEvent event)
        {
            statusbar.setText("you entered the area ");
            mousepanel.setBackground(Color.WHITE);
        }
        public void mouseExited(MouseEvent event)
        {
            statusbar.setText("the mouse had left the window");
            mousepanel.setBackground(Color.GRAY);
        }
        public void mouseDragged( MouseEvent event)
        {
            statusbar.setText("you are dragging the mouse");
        }
        public void mouseMoved(MouseEvent event)
        {
            statusbar.setText("you move the mouse");
        }
    }
}
