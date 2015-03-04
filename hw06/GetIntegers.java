//Emma Newkirk  CSE 2  3 March 2015
//sum five user-entered integers

//import the scanner class
import java.util.Scanner;

//class 
public class GetIntegers {
    
    //method
    public static void main (String [] args) {
       
       //build declare and assign the scanner
       Scanner scan = new Scanner(System.in);
       
       int sum = 0;
       int i = 0;
       
       System.out.println("Please enter five positive integers.  ");
        
        //loop input acceptance
        for (i = 0; i < 5; i++) { //2
        
           //check type validity
            if (scan.hasNextInt()) { //3
               int number = scan.nextInt();
                
               //check range validity
                if (number < 0) {
                    System.out.println("Invalid input, try again.  ");
                    i--;
                    scan.nextLine();
                    continue;  }
                    
                //sum values in range        
                else if (number >= 0 ) {
                   sum += number;   } 
                   
            } //end 3
            
            else  {
                System.out.println("Invalid input, try again!  ");
                i--;
                scan.next();    } 
            
        } //end 2
        
        //print sum once enough values are obtained         
        System.out.println("Sum is " + sum);
        
    } //end method
} //end class
