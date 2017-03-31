

/**
 *
 * @author Jahidul Islam
 */
public class tuna {
    private String name;
    private potpie birthday;
    
    public tuna(String theName,potpie theDate){
        name =theName;
        birthday=theDate;
        
    }
    
    public String toString()
    {
        return String.format("may name is %s ,my birthday is %s",name,birthday);
    }
    
}
