/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.calculator;

/**
 *
 * @author Jahidul Islam
 */
import java.util.Scanner;
public class BasicCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner jahid= new Scanner(System.in);
        double fnum,snum,answer;
        System.out.println("Enter the first num: ");
        fnum = jahid.nextDouble();
        
        System.out.println("Enter the second num: ");
        snum = jahid.nextDouble();
        
        answer=fnum+snum;
        
        System.out.println(answer);
        
    }
    
}
