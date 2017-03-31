
public class MultidimensionalArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int farray[][]={{4,5,6},{7,8,9}};
    
        int sarray[][]={{30,31,33},{34,35,36}};
        
        System.out.println("This is the first array");
        display(farray);
        System.out.println("This is the second array");
        display(sarray);
    }
    public static void display(int x[][]){
        for(int row=0;row<x.length;row++)
        {
            for(int coloum=0;coloum<x[row].length;coloum++){
                System.out.print(x[row][coloum]+"\t");
            }
            System.out.println();
        }
    }
    
}
