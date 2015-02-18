//Emma Newkirk  CSE2  17 February 2015
//guess a user-generated number

//import scanner
import java.util.Scanner;

//class
public class WhichNumber {
    
    //method
    public static void main (String[] args) {
        
        //accept input 
        Scanner myScanner = new Scanner (System.in);
        int number = 0;
        char div3 = 'x';
        char div4 = 'x';
        char div5 = 'x';
        char more6 = 'x';
        char less3 = 'x';
        char mod1 = 'x';
        char confirm = 'x';
        char even = 'x';
        char lie = 'x';
        
        //prompt the game
        System.out.println("Think of a number between 1 and 10.");
        System.out.println("Is your number even? Y/N  ");
        even = myScanner.next(".").charAt(0);
        
        if (even == 'y' || even == 'Y') { //1 
            System.out.println("Is it divisible by 3? Y/N  ");
            div3 = myScanner.next(".").charAt(0);
                if (div3 == 'y' || div3 == 'Y') { //2 
                    number = 6;  } //end 2
                else if (div3 == 'n' || div3 == 'N') { //3
                    System.out.println("Is the number divisible by 4? Y/N  ");
                    div4 = myScanner.next(".").charAt(0);
                        if (div4 == 'y' || div4 == 'Y') { //4
                            System.out.println("Is the number divided by 4 greater than 1? Y/N  ");    
                            mod1 = myScanner.next(".").charAt(0);
                                if (mod1 == 'y' || mod1 == 'Y') { //5 
                                    number = 8;  } //end 5
                                else if (mod1 == 'n' || mod1 =='N') { //6
                                    number = 4;  } //end 6
                                else {System.out.println("Sorry, I don't understand that");  }
                                } //end 4
                        else if (div4 == 'n' || div4 =='N') { //7
                            System.out.println("Is it divisible by 5? Y/N  ");
                            div5 = myScanner.next(".").charAt(0);
                                if (div5 == 'y' || div5 == 'Y') { //8
                                    number = 10;  } //end 8
                                else if (div5 == 'n' || div5 == 'N') { //9
                                    number = 2;  } //end 9
                                else {System.out.println("Sorry, I don't understand that");  }    
                        } //end 7 
                        else {System.out.println("Sorry, I don't understand that");  }
                } //end 3 
                else {System.out.println("Sorry, I don't understand that");  }
        } //end 1
        else if (even == 'n' || even == 'N') { //10
            System.out.println("Is it divisible by 3? Y/N  ");
            div3 = myScanner.next(".").charAt(0);
                if (div3 == 'y' || div3 == 'Y') { //11
                    System.out.println("Is the number divided by 3 greater than 1? Y/N  ");
                    mod1 = myScanner.next(".").charAt(0);
                        if (mod1 == 'y' || mod1 == 'Y') { //12
                            number = 9;  } //end 12
                        else if (mod1 == 'n' || mod1 == 'N') { //13
                            number = 3;  } //end 13
                        else {System.out.println("Sorry, I don't understand that");  }    
                } //end 11
                else if (div3 == 'n' || div3 == 'N') { //14
                    System.out.println("Is the number greater than 6? Y/N  ");
                    more6 = myScanner.next(".").charAt(0);
                        if (more6 == 'y' || more6 == 'Y') { //15
                            number = 7;  } //end 15
                        else if (more6 == 'n' || more6 == 'N') { //16
                            System.out.println("Is it less than 3? Y/N  ");
                            less3 = myScanner.next(".").charAt(0);
                                if (less3 == 'y' || less3 == 'Y') { //17
                                    number = 1;  } //end 17
                                else if (less3 == 'n' || less3 == 'N') { //18
                                    number = 5;  } //end 18
                                else {System.out.println("Sorry, I don't understand that");  }    
                        }// end 16 
                        else {System.out.println("Sorry, I don't understand that");  }
                } //end 14
                else {System.out.println("Sorry, I don't understand that");  }
        } //end 10
        else {System.out.println("Sorry, I don't understand that");  }
        
        if (number != 0) {
        System.out.println("Is your number " + number + "? Y/N  ");
        confirm = myScanner.next(".").charAt(0);
        if (confirm == 'y' || confirm == 'Y') {
            System.out.println("Hooray!");
            return;  }
        else if (confirm == 'n' || confirm == 'N') { //19
            System.out.println("Are you lying? Y/N  " ); 
            lie = myScanner.next(".").charAt(0);
                if (lie == 'y' || lie == 'Y') {
                    System.out.println("That's not fair.");
                    return;  }
                else if (lie == 'n' || lie == 'N') {
                    System.out.println("Shit. Sorry.");  
                    return;  }
                else {System.out.println("Sorry, I don't understand that");  }
        }
        else {return;  }
            } //end 19
    } //end method
} //end class