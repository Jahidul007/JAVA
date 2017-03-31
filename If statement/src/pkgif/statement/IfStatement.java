/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.statement;

/**
 *
 * @author Jahidul Islam
 */
import java.util.Scanner;
public class IfStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner jahid= new Scanner (System.in);
        
        int test;
        
        test = jahid.nextInt();
        
        if(test>5)
        {
            System.out.println("Yes");
            
        }      
        else
        {
            System.out.println("No");
        }
    }
    
}
