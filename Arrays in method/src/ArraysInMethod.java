
public class ArraysInMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int jahid[]={3,4,5,6,7};
        change(jahid);
        
        for(int y:jahid)
        System.out.println(y);
    }
    public static void  change(int x[]){
        for(int i=0;i<x.length;i++){
            x[i]+=5;
        }
        
    }
    
}
