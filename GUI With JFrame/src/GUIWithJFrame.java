import javax.swing.JFrame;
public class GUIWithJFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        tuna tunaObject = new tuna();
        tunaObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tunaObject.setSize(1080,720);
        tunaObject.setVisible(true);
    }
    
}
