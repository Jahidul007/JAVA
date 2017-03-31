import javax.swing.JOptionPane;
public class GrapicalUserInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String fn=JOptionPane.showInputDialog("Enter the first Number"); 
        String sn=JOptionPane.showInputDialog("Enter the second Number");
        
        int num1=Integer.parseInt(fn);
        int num2=Integer.parseInt(sn);
        
        int sum=num1+num2;
        JOptionPane.showConfirmDialog(null,"The answer is"+sum,"the title",JOptionPane.ERROR_MESSAGE);
        
    }
    
}
