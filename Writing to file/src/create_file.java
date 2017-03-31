import java.io.*;
import java.lang.*;
import java.util.*;
public class create_file {
    
    private Formatter x;
    
    public void openFile()
    {
        try
        {
            x= new Formatter ("chinese.txt");
        }
        catch(Exception e )
        {
             System.out.println("You have an error");
        }
    }
    public void addRecords()
    {
        x.format("%s%s%s","Jahid hasan is  ","20 years old ","and he is awesome and hot");
    }
    
    public void closeFile()
    {
        
        x.close();
    }
    
}
