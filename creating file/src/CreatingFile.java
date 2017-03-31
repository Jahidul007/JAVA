import java.util.*;

public class CreatingFile {

    public static void main(String[] args) {
        
        final Formatter x;
        
        try
        {
            x = new Formatter("FRED.txt");
            System.out.println("You created a file");
        }
        catch(Exception e)
        {
             System.out.println("You got a error");
        }
        
    }
    
}
