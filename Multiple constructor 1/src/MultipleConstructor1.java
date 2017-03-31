
public class MultipleConstructor1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        tuna tunaObject= new tuna();
        tuna tunaObject1= new tuna(5);
        tuna tunaObject2= new tuna(5,13);
        tuna tunaObject3= new tuna(5,13,43);
        System.out.printf("%s\n",tunaObject.toMilitary());
        System.out.printf("%s\n",tunaObject1.toMilitary());
        System.out.printf("%s\n",tunaObject2.toMilitary());
        System.out.printf("%s\n",tunaObject3.toMilitary());
      
        
    }
    
}
