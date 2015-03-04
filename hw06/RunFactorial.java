//Emma Newkirk  CSE 2  3 March 2015
//calculate the factorial of a user-provided integer using nested while loops

//import the scanner class
import java.util.Scanner;

//class
public class RunFactorial {
    
    //method
    public static void main (String [] args) {
        
        //construct, etc, the scanner
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter an integer between 9 and 16");
        
        int i = 0;
        boolean ran = false;
        int input = 0;
        int factorial = 1;
    
        while (ran == false) { //1
            if (scan.hasNextInt()) { //2
                i = scan.nextInt();
                
                if (i >= 9 && i <= 16) { //3
                    input = i;
                    
                    //loop multiplication to calculate factorial
                    while (i > 0) {
                        factorial *= i;
                        i--;    } 
                    ran = true;
                } //end 3
                
                else { System.out.println("Not in range; try again.  ");
                scan.nextLine();
                continue;  }
           
            } //end 2
            
           else { System.out.println("Not in range; try again.  ");
                scan.nextLine();
                continue;  }
                
        } //end 1
        
        System.out.println("Input accepted:"); 
        System.out.println(input + "! = " + factorial);
        
    } //end method
} //end class