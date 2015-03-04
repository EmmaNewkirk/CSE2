//Emma Newkirk   CES2  27 February 2015
//loops print smiles

//class
public class SmileGenerator {
    
    //method
    public static void main (String [] args) {
        
        //loop smiles three ways
        int i;
        for ( i = 0; i < 5; i++) {
            System.out.print(":)");  
            System.out.println(i);    }
        System.out.println("");
        i = 0;
        while (i < 5) {
            System.out.print(":)");
            i++;  }
        System.out.println("");
        i = 0;
        do {System.out.print(":)"); 
        i++; }
        while (i < 5);
        System.out.println("");
        
        //random number of smiles
        i = 0;
        int smiles = (int) (Math.random() * 100) + 1;
        //limit output to 30 
        if (smiles > 30) {smiles = 30;  }
        while (i < smiles) {
            System.out.print(":)"); 
            i++;  } 
        System.out.println("");    
        
        //increasing smiles
        i = 0;
        String s = ":)";
        do {
          System.out.println(s);
          s += ":)";
          i++;  }
        while (i < smiles);
        
        
    }  //end method
} //end class