
public class SimplePolymorphicProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        animal[] thelist  = new animal[2];
        dog d = new dog();
        fish f = new fish();
        
        thelist[0]=d;
        thelist[1]=f;
        
        for(animal x: thelist){
            x.noise();
            
        }
                
        
    }
    
}
