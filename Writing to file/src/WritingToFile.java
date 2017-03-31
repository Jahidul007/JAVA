
public class WritingToFile {

    public static void main(String[] args) {
       
        create_file y =new create_file();
        
        y.openFile();
        y.addRecords();
        y.closeFile();
    }
    
}
