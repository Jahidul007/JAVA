 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgelse.pkgif.statement;

/**
 *
 * @author Jahidul Islam
 */
public class ElseIfStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int age=45;
        if(age>=60){
            System.out.println("You are a senior citizen");    
        }
        else if(age>=50) 
        System.out.println("You are in your 50s");
        else if(age>=40) 
        System.out.println("You are in your 40s");
        else 
        {
            System.out.println("You are a young buck");
        }
    }
    
}
