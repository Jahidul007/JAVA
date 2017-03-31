
public class SummingElementsOfArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int jahid []={3 ,7 ,8 ,90};
        int sum=0;
        
        for(int i=0;i<jahid.length;i++){
            sum+=jahid[i];
        }
        System.out.println("The sum of these number is "+sum);
    }
    
}
