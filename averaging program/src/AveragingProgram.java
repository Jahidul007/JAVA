import java.util.Scanner;

public class AveragingProgram {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        float total =0;
        int grade;
        float average;
        int counter =0;
        
        while(counter <10){
            grade=input.nextInt();
            total+=grade;
            counter++;
        }
        System.out.println("Total "+total);
        average=total/10;
        System.out.println("Your average is "+average);
    }
    
}
