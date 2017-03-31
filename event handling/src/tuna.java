
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class tuna extends JFrame {
    private JTextField item1;
    private JTextField item2;
    private JTextField item3;
    
    private JPasswordField passwordField;
    
    
    public tuna(){
        super("The Title");
        setLayout(new FlowLayout());
        
        item1 =new JTextField("Enter the text");
        add(item1);
        
        item2 =new JTextField("Enter text here");
        add(item2);
        
        item3 =new JTextField("Uneditable",20);
        item3.setEditable(false);
        add(item3);
        
        passwordField= new JPasswordField("My password");
        add(passwordField);
        
        thehandler handler =new thehandler();
        item1.addActionListener(handler);
        item2.addActionListener(handler);
        item3.addActionListener(handler);
        passwordField.addActionListener(handler);
        
        
    }
    
    private class thehandler implements ActionListener{
        
        public void actionPerformed(ActionEvent event){
            
            String String ="";
            
            
            if(event.getSource()==item1)
                String =String.format("field 1:%s",event.getActionCommand());
            else if(event.getSource()==item2)
                String =String.format("field 2:%s",event.getActionCommand()); 
            if(event.getSource()==item3)
                String =String.format("field 3:%s",event.getActionCommand());
            else if (event.getSource()==passwordField)
                String =String.format("Password field is : %s",event.getActionCommand());
            
            
            JOptionPane.showMessageDialog(null, String);
        }
    }
}
