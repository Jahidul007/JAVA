
import java.util.Scanner;


public class Constructor {

  
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner input = new Scanner (System.in);
        tuna tunaObject= new tuna("Mahira khan");
        tuna tunaObject2= new tuna("Mira khan");
        //System.out.println("Enter your name first gf here: ");
        //String temp = input.nextLine();
        //tunaObject.setName(temp);
        tunaObject.saying();
        tunaObject2.saying();
    }
    
}
