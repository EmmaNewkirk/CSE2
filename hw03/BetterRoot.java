//Emma Newkirk  CSE2  10 February 2015
//

//import the scanner class
import java.util.Scanner;

//class
public class BetterRoot {
    
    //method
    public static void main (String[] args) {
        
        //construct declare and assign the scanner
        Scanner myScanner = new Scanner(System.in);
        
        //prompt and accept user input
        System.out.println("Please enter a positive number:  ");
        double number = myScanner.nextDouble();
        
        //systematically improve cube root guess
        double guess = number/3;
        while ((guess*guess*guess) > (number)){
        guess = ((2*guess*guess*guess+number)/(3*guess*guess));  }
        
        //print estimation
        System.out.println("The cube root of " + number + " is "
            + guess);
        System.out.println(guess + "*" + guess + "*" + guess + "="
            +(guess*guess*guess));
            
    }
}