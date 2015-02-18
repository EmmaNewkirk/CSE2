//Emma Newkirk  CSE2  17 February 2014
//deopsit, withdraw, and print balance of bank accounts

//import scanner & random operator
import java.util.Scanner;

//class
public class Banking {
    
    //method
    public static void main (String[] args){
        
        //construct declare and assign the scanner
        Scanner myScanner = new Scanner(System.in);
        
        //generate balance
        double balance = Math.random() * 5000 + 1000;
        System.out.printf("Balance: $%4.2f", balance);
        System.out.println(" ");
        //prompt user choice
        System.out.println("Press 1 to make a deposit.");
        System.out.println("Press 2 to make a withdrawal.");
        System.out.println("Press 3 to view your balance.");
        //inititae variables
        int choice = myScanner.nextInt();
        double deposit = 0;
        double withdrawal = 0;
        
        //select action
        switch (choice) {
            
            case 1:
                System.out.println("How much would you like to deposit?  ");
                deposit = myScanner.nextDouble();
                if (deposit > 0){
                balance += deposit;
                System.out.printf("Balance: $%4.2f", balance);}
                else {System.out.println("Invalid entry. ");}
                break;
                
            case 2:
                System.out.println("How much would you like to withdraw?  ");
                withdrawal = myScanner.nextDouble();
                if (withdrawal > 0 && withdrawal < balance){
                balance -= withdrawal;
                System.out.printf("Balance: $%4.2f", balance);}
                else if (withdrawal > balance)
                     {System.out.println("Insufficient funds. ");}
                else {System.out.println("Invalid entry. ");}
                break;
                
            case 3:
                System.out.printf("Balance: $%4.2f", balance);
                break;
            
            default:
                System.out.println("Invalid key press. ");
                break;
            }
    }
    
}