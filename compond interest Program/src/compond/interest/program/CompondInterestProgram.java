/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compond.interest.program;

/**
 *
 * @author Jahidul Islam
 */
public class CompondInterestProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //A=P(1+R)^n
        double amount;
        double principal=10000;
        double rate= .01;
        
        for(int day =1 ;day<=20;day++){
            amount =principal*Math.pow(1+rate,day);
            System.out.println(day+" "+amount);
        }
    }
    
}
