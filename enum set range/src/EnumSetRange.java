

/**
 *
 * @author Jahidul Islam
 */
import java.util.EnumSet;
public class EnumSetRange {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           for(tuna people: tuna.values())
            System.out.printf("%s\t%s\t%s\n", people,people.getDesc(),people.getYear());
           
          System.out.println("\nAnd now for the range of congratants\n");
          
          for(tuna people : EnumSet.range(tuna.jahid, tuna.Julia) )
                      System.out.printf("%s\t%s\t%s\n", people,people.getDesc(),people.getYear());

    }
    
}
