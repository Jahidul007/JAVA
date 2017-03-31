/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch.statement;

/**
 *
 * @author Jahidul Islam
 */

import java.util.Scanner;
public class SwitchStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner jahid = new Scanner (System.in);
        int age ;
        age=jahid.nextInt();
        switch(age)
        {
            case 1: 
                System.out.println("you can crawl");
                break;
            case 2: 
                System.out.println("you can talk");
                break;
            case 3: 
                System.out.println("you can walk");
                break;
            case 4: 
                System.out.println("you can jaump");
                break;
            case 5: 
                System.out.println("you can run");
                break;
            case 6: 
                System.out.println("you can mature");
                break;
            default : 
                System.out.println("i do not know how old are you");
        }
        
        
    }
    
}
