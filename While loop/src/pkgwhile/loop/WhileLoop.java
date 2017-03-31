/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgwhile.loop;

/**
 *
 * @author Jahidul Islam
 */
import java.util.Scanner;
public class WhileLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner jahid= new Scanner(System.in);
        int counter =0;
        while(counter<10)
        {
            System.out.println(counter);
            counter++;
        }
        
    }
    
}
