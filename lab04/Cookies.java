//Emma Newkirk  CSE2  13 February 2015
//

//import the scanner class
import java.util.Scanner;

//class
public class Cookies {
    
    //method
    public static void main (String[] args) {
        
        //construct decalre and assign the scanner
        Scanner myScanner = new Scanner(System.in);
        
        //prompt for user input about people
        System.out.println("How many people are coming to your party? Please enter a positive integer.  ");
        //accept user input
        int people = 1;
        int cookies = 1;
        int cookiesEach = 1;
        double enoughCheck = cookies/people;
        double leftoverCheck = cookies%people;
        
        if (myScanner.hasNextInt()) {people = myScanner.nextInt(); }
        if (people > 0 ) {  //if 1
            //prompt for user input about cookies
            System.out.println("How many cookies will you bring? Please enter a positive integer.  ");
            
                if (myScanner.hasNextInt()) {cookies = myScanner.nextInt();} 
                if (cookies > 0 ) {  //if 2
                    //prompt for user input about cookies per person
                    System.out.println("How many cookies would you like each guest to have? Please enter a positive integer.  ");
                    
                        if (myScanner.hasNextInt()) {cookiesEach = myScanner.nextInt();}
                        if (cookiesEach > 0 ) {  //if 3
                            
                                if (enoughCheck >= cookiesEach && leftoverCheck == 0){ //if 4
                                    System.out.println("You have enough cookies and they will divide evenly.");
                                    } //if 4 end
                                    else if (enoughCheck > cookiesEach && leftoverCheck != 0){ //if 5
                                        System.out.println("You have enough cookies but they will not divide evenly among your guests.");
                                        } //if 5 end
                                        else if (enoughCheck < cookiesEach){ //if 6
                                            System.out.println("That's not enough cookies. You need at least " + ((cookiesEach * people)-cookies)
                                                + " more cookies.");
                                        }  //if 6 end
                                        
                                    }  //if 3 end
                                    
                                     else {
                                        System.out.println("You did not follow the instructions");
                                        //program terminates
                                        return;   }
       
                            }  //if 2 end
                            
                            else {
                                System.out.println("You did not follow the instructions");
                                //program terminates
                                return;   }
                            
                }  //if 1 end
        else {
            System.out.println("You did not follow the instructions");
            //program terminates
            return;    }
               
        
        } //end method
    } //end class
    
    
