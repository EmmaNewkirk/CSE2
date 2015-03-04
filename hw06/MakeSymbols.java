//Emma Newkirk  CSE 2  3 March 2015
// print a random number of symbols by a do-while loop

//class
public class MakeSymbols {
     
     //method 
     public static void main (String [] args) {
          
          //generate random number
          int number = (int) (Math.random() * 101);
          int i = 0;
          System.out.println("Number: " + number);
          System.out.print("Pattern: ");
          
          //loop printing even pattern
          if (number%2 == 0 && number != 0) {
               do {System.out.print("*");
               i ++;  } 
               while (i < number);
          }
    
          //loop printing odd pattern    
          else if (number%2 == 1) {
               do {System.out.print("&");  
               i++;  }
               while (i < number);
          }

          //zero case
          else if (number == 0) {
               System.out.println("");  }
               
          System.out.println("");     
          
     } //end method
} //end class          