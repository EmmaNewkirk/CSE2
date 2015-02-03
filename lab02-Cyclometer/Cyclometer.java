//Emma Newkirk  CSE2  30 Jan 2015
//Cyclometer.java calcluates the distance traveled on a bike trip based on the
//duration of the trip and the number of times the wheel rotated

//class
public class Cyclometer {
    
    //method
    public static void main (String[] args) {
        
        //decalare and assign variables
        int secsTrip1 = 480; //duration of trip 1 in seconds
        int secsTrip2 = 3220; //uration of trip 2 in seconds
        int countsTrip1 = 1561; //length of trip 1 in wheel rotations
        int countsTrip2 = 9037; //length of trip 2 in wheel rotations
        //declare and assign calculation constants
        double wheelDiameter = 27.0; //diameter of the wheel
        double PI = 3.1415926; //value of pi
        double feetPerMile = 5280; //feet in one mile
        double inchesPerFoot = 12; //inches in one foot
        double secondsPerMinute = 60; //seconds in one minute
        
        //print variable values
        System.out.println("The first trip took " + (secsTrip1/secondsPerMinute) +
            " minutes and the wheel rotated " + countsTrip1 + " times.");
        System.out.println("The second trip took " + (secsTrip2/secondsPerMinute) +
            " minutes and the wheel rotated " + countsTrip2 + " times.");
        
        //calculate and store distances based on duration, rotations, and stored constants
        double distanceTrip1 = countsTrip1 * wheelDiameter * PI; //gives distance in inches
        distanceTrip1 /= inchesPerFoot * feetPerMile; //redefines distance in miles  
        double distanceTrip2 = countsTrip2 * wheelDiameter * PI; //gives distance in inches
        distanceTrip2 /= inchesPerFoot * feetPerMile; //redefines distance in miles
        
        //print calculated distances
        System.out.println("The first trip was " + distanceTrip1 + " miles long.");
        System.out.println("The second trip was " + distanceTrip2 + " miles long.");
        System.out.println("The total distance of both trips was " + (distanceTrip1 + distanceTrip2)
            + " miles.");
        
    }
    
}