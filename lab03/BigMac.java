//Emma Newkirk  CSE2  06 February 2015
//calculate cost and tax from user input

//import the scanner class
import java.util.Scanner;

//class
public class BigMac {
    
    //method
    public static void main (String[] args) {
        
        //accept input from the scanner class
        Scanner myScanner = new Scanner (System.in);
        
        //prompt for and acept user input
        System.out.print("How many Big Macs would you like? Please enter a positive integer.  ");
        int nBigMacs =  myScanner.nextInt();
        
        System.out.print("How much does each Big Mac cost? Use the form XX.XX  ");
        double bigMac$ = myScanner.nextDouble();
        
        System.out.print("What is the percent sales tax? Enter a whole number.  ");
        double taxRate = myScanner.nextDouble();
        taxRate /= 100;
        
        //format output to xx.xx
        double cost$ = nBigMacs * bigMac$ * (1+taxRate);
        int pennies = (int) (cost$*100)%10;
        int dimes = (int) (cost$*10)%10;
        int dollars = (int) cost$;
        
       //output calculations
        System.out.println("The total cost of " + nBigMacs + " Big Macs, at $" 
            + bigMac$ + " per Big Mac with a sales tax of " + (int) (taxRate*100)
            + "%, is $" + dollars + "." + dimes + pennies);
        
        
        
        
    }

    
}
