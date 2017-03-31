
/**
 *
 * @author Jahidul Islam
 */
public class StaticFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        tuna tunaObject = new tuna(10);
            
            for(int counter=0;counter<5;counter++){
            tunaObject.add();
            System.out.printf("%s",tunaObject);
        }
        
    }
    
}
