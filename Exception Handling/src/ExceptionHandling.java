import java.util.*;
public class ExceptionHandling {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int x=1;
        do
        {
        try
        {
        System.out.println("Enter the First Num");
        int n1= input.nextInt();  
        System.out.println("Enter the Scoend Num");
        int n2= input.nextInt();
        int sum= n1/n2;
        
        System.out.println(sum);
        x=2;
                
        }
        catch(Exception e)
        {
            System.out.println("You can't do that");
            
        }
        }while(x==1);
    }
    
}
