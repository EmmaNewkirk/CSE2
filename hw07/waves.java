//Emma Newkirk  CSE 2  17 March 2015
//

//import the scanner class
import java.util.Scanner;

//class 
public class waves {
    
    //method
    public static void main (String [] args) {
        
        //construct, etc, the scanner
        Scanner scan = new Scanner(System.in);
        
        //prompt for input
        System.out.println("Please enter an integer between 1 and 30  ");
        
        
        for (int q = 0; q < 1; q++) {
            if (scan.hasNextInt()) { //a
                int limit = scan.nextInt();
                if (limit <= 30 && limit >= 1) { //b
       
        System.out.println("FOR LOOP:");
        int g = 0;
        int h = 0;
        int i = 0;
        int j = 0;
        int k = 0;
        
        for (k=1; k <= limit; k++) { //1
            if (k%2 == 0) { //4
            
                for(j = 0; j < k; j++) { //2
                    System.out.println("");
                    // System.out.print(" j" + j);
                        
                    for (i = 0; i <= j; i++) { //3
                        System.out.print(k);
                        // System.out.print(" i" + i);
                    } //end 3
                } //end 2    
            } //end 4 if
                 
            else { //5 
               
                for (h = k; h > 0; h--) { //6
                    System.out.println("");
                    // System.out.print(h);
                    
                    for (g = h; g > 0; g-- ) { //7
                        System.out.print(k);
                        // System.out.print(g);
                        
                    } //end 7
                } //end 6
            } //end 5 else
        } //end 1
        
        System.out.println("");
        System.out.println("");
        System.out.println("WHILE LOOP:");
        int g1 = 0;
        int h1 = 0;
        int i1 = 0;
        int j1 = 0;
        int k1 = 1;
        
        while ( k1 <= limit ) { //1

            if (k1%2 == 0) { //4
                j1 = 1;
               while (j1 <= k1) { //2
                    
                     i1 = 0;   
                    while (i1 < j1) { //3
                        System.out.print(k1); 
                        i1++;
                        
                    } //end 3
                    System.out.println("");
                    j1++;
                } //end 2    
            } //end 4 if
            
                 
            else { //5 
               h1 = k1;
               
                while ( h1 > 0 ) { //6
                     
                    h1--;
                    g1 = h1;
                    
                    while ( g1 >= 0 ) { //7
                        System.out.print(k1);
                        g1--;
                        
                    } //end 7
                    System.out.println("");  
                } //end 6
            } //end 5 else
            
           k1++; 
            
        } //end 1
        
        System.out.println("");
        System.out.println("");
        System.out.println("DO-WHILE LOOP:");
        int g2 = 0;
        int h2 = 0;
        int i2 = 0;
        int j2 = 0;
        int k2 = 1;
        
        do { //1

            if (k2%2 == 0) { //4
                j2 = 1;
               do { //2
                    
                     i2 = 0;   
                    do { //3
                        System.out.print(k2); 
                        i2++;
                        
                    } //end 3
                    while (i2 < j2);
                    System.out.println("");
                    j2++;
                } //end 2 
                while (j2 <= k2);
            } //end 4 if
            else { //5 
               h2 = k2;
               
                do { //6
                     
                    h2--;
                    g2 = h2;
                    
                    do { //7
                        System.out.print(k2);
                        g2--;
                        
                    } //end 7
                    while ( g2 >= 0 );
                    System.out.println("");
                } //end 6
                while ( h2 > 0 );
            } //end 5 else
           k2++; 
           
        } //end 1
        while ( k2 <= limit );
        System.out.println("");
        }  //a
              else {System.out.println("Between 1 and 30, please");
                    q--;
                    }
            } //b
            else {System.out.println("An integer, please");
                    q--;  
                scan.next();
            }    
        }
    } //end method
} //end class