/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logical.operatorf;

/**
 *
 * @author Jahidul Islam
 */

import java.util.Scanner;
public class LogicalOperatorf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner jahid = new Scanner(System.in);
        
        int boys,girls;
        
        
        boys=jahid.nextInt();
        girls=jahid.nextInt();
        
        
        if(boys>5&&girls>5)
        {
            System.out.println("They are matured");
        }
        else
        {
            System.out.println("They are too young");
        }
    }
    
}
