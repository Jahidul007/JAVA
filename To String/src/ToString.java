
import static java.time.Clock.system;


public class ToString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        potpie potObject = new potpie(4,5,6);
        
        tuna tunaObject = new tuna("jahid",potObject);
        System.out.println(tunaObject); 
    }
    
}
