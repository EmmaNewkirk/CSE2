//Emma Newkirk  CSE2  10 February 2015
//program prints digits stored in decimal places

//import the scanner class
import java.util.Scanner;
    
//class
public class FourDigits {
        
    //method
    public static void main (String[] args) {
        
   //bulid declare and assign the scanner
   Scanner myScanner = new Scanner(System.in);
   
   //prompt for and accept input
   System.out.println("Enter a number and I'll tell you the four digits right of the decimal point. ");
   double number = myScanner.nextDouble();
   
    //store decimal digits
    int fourth = (int) (number*10000)%10;
    int third = (int) (number*1000)%10;
    int second = (int) (number*100)%10;
    int first = (int) (number*10)%10;
    
    //print four digits
    System.out.println( first + " " + second + " " + third + " " +  fourth);
    
    }
}