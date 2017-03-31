
/**
 *
 * @author Jahidul Islam
 */
public class Static {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        tuna member1= new tuna ("megan","Fox");
        tuna member2 =new tuna ("Natalie","Portman");
        tuna member3 = new tuna ("Taylor","Swift");
        
        System.out.println(tuna.getMembers());
        System.out.println(member1.getFirst());
        System.out.println(member1.getlast());
         System.out.println(member1.getMembers());
        
    }
    
}
