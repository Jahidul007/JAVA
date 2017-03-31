
public class Enumeration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(tuna people: tuna.values())
            System.out.printf("%s\t%s\t%s\n", people,people.getDesc(),people.getYear());
    }
    
}
