import java.util.Random;

public class ArrayElementsAsCounters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();
        int freq[]=new int[7];
        for (int i=1;i<1000;i++)
        {
            ++freq[1+rand.nextInt(6)];
        }
        System.out.println("face\tFrequency");
        for(int f=0;f<freq.length;f++){
            System.out.println(f+"\t"+freq[f]);
        }
    }
    
}
