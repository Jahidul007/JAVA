
public class doglist {
    private  Fish[] thelist =new Fish[5];
    private  int i =0;
    
    public void add(Fish fo ){
        if(i<thelist.length){
            thelist[i]=fo;
            System.out.println("Dog added at index "+i);
            ++i;
        }
    }
    
}
