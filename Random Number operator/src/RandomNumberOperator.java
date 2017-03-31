
import java.util.Random;
public class RandomNumberOperator {

    public static void main(String[] args) {
        // TODO code application logic here
        Random dice = new Random();
        int number;
        
        for(int counter =1;counter<=10;counter++)
        {
            number = 1+dice.nextInt(10);
            System .out.println(number+" ");
        }
    }
    
}
