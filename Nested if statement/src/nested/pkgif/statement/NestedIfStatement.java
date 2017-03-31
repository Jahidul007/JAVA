/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nested.pkgif.statement;

/**
 *
 * @author Jahidul Islam
 */
public class NestedIfStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int age = 80 ;
        if(age<50){
        System.out.println("You are young");
         }
        else{
            System.out.println("you are old");
            if(age>75){
                System.out.println("You are really old!");
            }
            else
                System.out.println("Do not worry are not really that old "); 
        }
    }
    
}
