/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.operator;

/**
 *
 * @author Jahidul Islam
 */
import java.util.Scanner;
public class MathOperator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner jahid= new Scanner(System.in);
        
        int boys ,girls, people;
        
        boys=11;
        girls=3;
        people=boys+girls;
        System.out.println(people);
        people=boys-girls;
        System.out.println(people);
        people=boys*girls;
        System.out.println(people);
        people=boys/girls;
        System.out.println(people);
        people=boys%girls;
        System.out.println(people);
    }
    
}
