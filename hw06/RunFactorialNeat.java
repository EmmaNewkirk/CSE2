//Emma Newkirk  CSE 2  3 March 2015
//calculate the factorial of a user-provided integer using non-nested while loops

//import the scanner class
import java.util.Scanner;

//class
public class RunFactorialNeat {
    
    //method
    public static void main (String [] args) {
        
        //construct, etc, the scanner
        Scanner scan = new Scanner(System.in);
   
        int i = 0;
        int input = 0;
        boolean needInput = true;
        int factorial = 1;
        
        while  (needInput == true) { //1
            System.out.println("Please enter an integer between 9 and 16");
            //check type validity
            if (scan.hasNextInt()) { //2
                i = scan.nextInt(); 
                //check range vaildity
                if (i >= 9 && i <= 16) { needInput = false; 
                    System.out.println("Input accepted:");  }
                else {
                    scan.nextLine();
                    continue;  }
            } //end 2
            else {
                scan.nextLine();
                continue;  }
        } //end 1
        
        //loop to calculate factorial 
        input = i;
        while (i > 0) {
            factorial *= i;
            i--;    } 
        
        System.out.println(input + "! = " + factorial);
        
    } //end method
} //end class