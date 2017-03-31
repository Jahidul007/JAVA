 import java.util.Scanner;
public class Instance {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        tuna tunaObject= new tuna();
        System.out.println("Enter your name first gf here: ");
        String temp = input.nextLine();
        tunaObject.setName(temp);
        tunaObject.saying();
    }
    
}
