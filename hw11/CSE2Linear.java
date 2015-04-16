//Emma Newkirk  CSE 2  14 April 2015

import java.util.Scanner;
import java.util.Arrays;


public class CSE2Linear {
    
    public static void main (String [] args) {
        
        //fill initial array with valid input
        System.out.println("Please enter 15 integer grades between 0 and 100, from smallest to largest");
        
        Scanner scan = new Scanner(System.in);
        int[] gradesArray = new int[15];
        
        if (scan.hasNextInt()) { 
        
                    int k = 0;
                    while ( k < gradesArray.length ) {
                        
                            int value = scan.nextInt();
                            
                            if ( value >= 0 && value <= 100 ) {
                                
                                if (k == 0) { 
                                    gradesArray[0] = value;
                                    // System.out.println(gradesArray[k]);
                                    k++;
                                    continue;  
                                }  //end if kzero
                               
                                if (gradesArray[k] <= gradesArray[k-1]) {
                                    gradesArray[k] = value;
                                    k++;
                                    
                                } //end if larger 
                                    
                                else if (gradesArray[k] > gradesArray[k-1]) {System.out.println("Enter in increasing order, please");
                                    continue;  }
                    
                         } // end if in range
                         
                         else {System.out.println("Grades greater than zero and less than one hundred, please");
                            continue;  }
                                
                    } //end while k
                    
        } //end if has next
            
       else {System.out.println ("Integers please");  }
            
        System.out.println(Arrays.toString(gradesArray));
        
        //binary search array for value
        System.out.println("Enter an integer grade to search for:  ");
        
        int target = scan.nextInt();
        
        binary( gradesArray, 0, gradesArray.length, target );
        
        //scramble array
        int[] gradesArray2 = new int [15];
        gradesArray2 = shuffle( gradesArray );
        
        System.out.println("Your non-sorted array is:");
        System.out.println(Arrays.toString(gradesArray2));
        
        //linear search array for value
        System.out.println("Enter an integer grade to search for:  ");
        
        target = scan.nextInt();
        
        linear(gradesArray2, target);
        
    }  //end main
    
    public static void binary (int[] array, int lower, int upper, int target ) {
        
        int i = 1; 
        int k = ( lower + upper) / 2;

        while((array[k] != target) && (lower <= upper)) {
             
             i++;
             
            if (array[k] > target) { 
                upper = k - 1;   }   
                  
            else  { lower = k + 1;   }
                  
           k = (lower + upper) / 2;
           
         }  //end while
         
         if (lower <= upper) {
               System.out.println( target + " was found in the list in " + i + " search iterations." );  } 
          
         else {
              System.out.println( target + " was not found in the list after " + i + " search iterations." );  }
      
    } //end binary
    
    public static int[] shuffle( int [] array ) {
        
        // int [] scrambled = new int [array.length];
        
        for (int i = 0; i < array.length; i++) {
            
            int target = (int) (array.length * Math.random() );
            
            int temp = array[target];
            array[target] = array [i];
            array[i] = temp;
            
        }  //end for
      
        return array;  
        
    }  //end shuffle
    
    public static void linear (int [] array, int target ) {
        
        boolean found = false;
        int j = 0;
        for ( int k = 0; k < array.length; k++) {
            
            j++;
            if (array[k] == target) {
                System.out.println (target + " was found in the list in " + j + " iterations");
                found = true;
                break;
            } // end if
            
        } //end for
        
        if (found == false) {System.out. println( target + " was not found in " + j + " iterations" );  }
        
        return;
        
    } //end linear
    
} //end class