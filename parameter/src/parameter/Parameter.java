

import java.util.Scanner;
public class Parameter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new Scanner(System.in);
        tuna tunaObject = new tuna();
        System.out.println("Enter your name: ");
        String name=input.nextLine();
        tunaObject.simple(name);
        
    }
    
}
