//Emma Newkirk  CSE 2  06 March 2015

import java.util.Scanner;

public class zigzag {
    public static void main (String [] args) {
        
        // Scanner scan = new Scanner(System.in);
        // int nStars = 1;
        // boolean needInput = true;
        // boolean inRange = false;
        // System.out.println("Please enter an integer between 3 and 33.  ");
        //     while (scan.hasNextInt()) {
        //         nStars = scan.nextInt();
        //         if (nStars > 3 && nStars < 33) {inRange = true;  }
        //         while (inRange == true) { //4
        //             needInput = false; }
        //         // else {System.out.println    
        
        // while (needInput = false)  { //3 
        
        // if (scan.hasNextInt()) {needInput = false;}
        //     while (needInput == true) {
        //         scan.next();
        //         System.out.println("An integer, please.  ");
        //         break;   }
                
        // nStars = scan.nextInt();
        // while (nStars > 33 || nStars < 3)  {
        //     System.out.println("Between 3 and 33, please.  ");
        //     // scan.next();
        //     break;
        
        //        }
        
        
        
        nStars = scan.nextInt();
        int k = 0;
        boolean star = false;
        if (nStars < 33 && nStars > 3) {star = true;  }
        for (star = true; k < 1; k++ )  { //2
        int i = 0;
        for (i = 0; i < nStars + 2; i++)  {
            System.out.print("*");  }
            
        System.out.println("");
        
         int j = 0;
         String spacing = "";
         for (j =0; j < nStars; j++) { //1
             
             for (i = 1;; i++)  {
                spacing += " ";
                System.out.print(spacing);
                System.out.print("*");
                System.out.println("");
                break ;  }
                
         } //end 1

         for (i = 0; i < nStars + 2; i++)  {
            System.out.print("*");  }
            
        System.out.println("");
        
        } //end 2
        
        // } //end 3
        
        //     } //end 4
        
        
        
    } //end method
    
} //end class