import java.io.File;

public class FileClass {

    public static void main(String[] args) {
        
        File x =new File("C:\\KMPlayer\\bass_ape.dll");
        
        if(x.exists())
            System.out.println(x.getName()+" exist!");
        else
             System.out.println("this thing not exist!");
        
    }
    
}
