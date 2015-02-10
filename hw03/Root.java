//Emma Newkirk  CSE2  10 February 2015
//estimate the cube root of user input integers

//import the scanner class
import java.util.Scanner;

//class
public class Root {
    
    //method
    public static void main (String[] args) {
        
        //construct declare and assign the scanner
        Scanner myScanner = new Scanner(System.in);
        
        //prompt and accept user input
        System.out.println("Please enter a positive number:  ");
        double number = myScanner.nextDouble();
        
        //systematically improve cube root guess
        double guess = number/3;
        double guess1 = ((2*guess*guess*guess+number)/(3*guess*guess));
        double guess2 = ((2*guess1*guess1*guess1+number)/(3*guess1*guess1));
        double guess3 = ((2*guess2*guess2*guess2+number)/(3*guess2*guess2));
        double guess4 = ((2*guess3*guess3*guess3+number)/(3*guess3*guess3));
        double guess5 = ((2*guess4*guess4*guess4+number)/(3*guess4*guess4));
        
        //print estimation
        System.out.println("The cube root of " + number + " is "
            + guess5);
        System.out.println(guess5 + "*" + guess5 + "*" + guess5 + "="
            +(guess5*guess5*guess5));
        
        
        
    }
    
    
}

