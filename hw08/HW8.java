//Emma Newkirk  CSE2  24 March 2015
//Adventure game!

import java.util.Scanner;

//class
public class HW8 {
    
    //walk through game method
    public static String getInput(Scanner scan, String string) {
        String methVar = "X";
        String input = scan.next();
        if (input.equals("C") || input.equals("c")) {}
        else {System.out.println ("Fine, quit. We wanted a new hero anyway.");   
            System.exit(0);  }    
        return methVar;
    } //end walk through
    
     //cave scene method
     public static void cave() {
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    } //end cave scene
     
     //giant character method
     public static void giant() {
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
    } //end giant
    
    //fight giant method
    public static String getInput(Scanner scan, String string, int trial) {
        String methVar = "X";
        int hits = 0;
        while (hits < 10) { 
            String input = scan.next();
            if (input.equals("A") || input.equals("a")) {
                int crit = (int) (Math.random() * 2);
                    if (crit ==1) { System.out.println("Critical hit!");
                        hits++; }
                    else {System.out.println("A swing and a miss!");  }  
                } //end if
                
                else if (input.equals("E") || input.equals("e")) {
                    int esc = (int) (Math.random() * 10);
                    if (esc == 10) {System.out.println("By some miracle, you escaped from the giant!"); 
                    hits = 10;  }
                    else {System.out.println("Fee fi fo fum, you can't escape from here!");  }
                } //end else if
                
                else {  
                    System.out.println("*******      **********      **      ********");
                    System.out.println("***  ****    **********    ******    ***  ****");
                    System.out.println("***   ****   ***         ****  ****  ***   ****");
                    System.out.println("***    ****  *******     **********  ***    ****");
                    System.out.println("***     ***  *******     **********  ***     ***");
                    System.out.println("***    ****  ***         ***    ***  ***    ****");
                    System.out.println("***   ***    **********  ***    ***  ***   ***");
                    System.out.println("*******      **********  ***    ***  ********");
                    
                    System.out.println("The giant shows no mercy. Better luck next time."); 
                    System.exit(0);  }
                
        } //end while 
    return methVar;    
    } //end fight giant
   
    //box display method
     public static void box(){
        System.out.println("                  *********************     *********************    *********************             ");
        System.out.println("                 ***               ***     ***               ***    ***               ***              ");
        System.out.println("                 ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                 ***               ***     ***               ***    ***               ***              ");
        System.out.println("                 *********************     *********************    *********************               "); 
    } //end box
    
    //choose treasure box method
    public static String getInput(Scanner scan) {
        String methVar = "X";
        if (scan.hasNextInt()) {
            int input = scan.nextInt();
            switch (input) {
                case 1: 
                    System.out.println("Your reward is immortality!");
                    break;
                case 2:
                    System.out.println("You've won six bajillion pennies!");
                    break;
                case 3:
                    System.out.println("You've been rewarded with a canoe!");
                    break;
                default:
                    System.out.println("You can't follow directions! None for you, bye.");
                    System.exit(0);
                    break;
            } //end switch
        } //end if
        
        else {System.out.println("You can't follow directions! None for you, bye.");
                System.exit(0);  }
    return methVar;    
    } //end choose box
    
    
    //main method; directs gameplay
    public static void main(String[] args) {
        char option;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        String input = getInput(scan, "Cc");
        System.out.println("You are in a dead valley.");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You walked and walked and walked and you saw a cave!");
        cave();
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("Unfortunately, you ran into a GIANT!");
        giant();
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, ANYTHING else is to YIELD");
        input = getInput(scan, "AaEe", 10);
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are 3 treasure boxes in front of you! Enter the box number you want to open!");
        box();
        input = getInput(scan);
        System.out.println("Hero! Have a good day!");
    } //end main method

} //end class