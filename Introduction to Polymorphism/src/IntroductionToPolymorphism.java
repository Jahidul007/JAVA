

/**
 *
 * @author Jahidul Islam
 */
public class IntroductionToPolymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //tuna jahid = new tuna();
        food jahid[]=new food[2];
        jahid[0]=new potpie();
        jahid[1]=new tuna();
        
        for(int i=0;i<jahid.length;++i)
            jahid[i].eat();
        
        ///tuna tunaObject
                    
    }
    
}
