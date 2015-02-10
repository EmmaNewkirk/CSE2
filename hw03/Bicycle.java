//Emma Newkirk  CSE2  10 February 2015
//calculate distance and speed based on time and wheel turns

//import the scanner class
import java.util.Scanner;

//class
public class Bicycle {
    
    //method
    public static void main (String[] args) {
        
        //declare build and assign the scanner
        Scanner myScanner = new Scanner (System.in);
        
        //ask for and accept user input
        System.out.println("How many times did the wheel turn? Please enter and integer.  ");
        int counts = myScanner.nextInt();
        System.out.println("How many seconds did it take? Please enter an integer.  ");
        int seconds = myScanner.nextInt();
        
        //declare and assign calculation constants
        double wheelDiameter = 27.0; //diameter of the wheel
        double PI = 3.1415926; //value of pi
        double feetPerMile = 5280; //feet in one mile
        double inchesPerFoot = 12; //inches in one foot
        double secondsPerMinute = 60; //seconds in one minute
        
        //calculate and store distance and speed based on duration, rotations, and stored constants
        double distance = counts * wheelDiameter * PI; //gives distance in inches
        distance /= inchesPerFoot * feetPerMile; //redefines distance in miles  
        double speed = distance / (seconds/(secondsPerMinute*secondsPerMinute)); //gives miles per hour
        
        //print calculated distances
        System.out.println("The trip took " + (seconds/secondsPerMinute) +
            " minutes and was " + distance + " miles long.");
            System.out.println("The average speed was " + speed + " miles per hour.");
        
        
        
    }
    
}