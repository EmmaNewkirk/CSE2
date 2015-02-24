//Emma Newkirk  CSE2  24 February 2015
//converting decimal RGB color values to hex codes

//import scanner class
import java.util.Scanner;

//class
public class ToHex {
    
    //method
    public static void main (String [] args){
        
    //construct declare and assign the scanner
    Scanner scan = new Scanner(System.in);
    
    //prompt and accept user input    
    System.out.println("Please enter three integers representing RGB values: ");
    
    //check for integer input
    if (scan.hasNextInt())  { //1
        int red = scan.nextInt();
        int green = scan.nextInt();
        int blue = scan.nextInt();
        String redHex1 = "z";
        String redHex2 = "z";
        String greenHex1 = "z";
        String greenHex2 = "z";
        String blueHex1 = "z";
        String blueHex2 = "z";
        String hexCode = "ZZZZZZ";
        //check for properly ranged input
        if (red >= 0 && red <= 255 && green >= 0 && green <= 255 && blue >= 0 && blue <= 255) { //2 
           //convert red integer from decimal to hex
           int red1 = red/16;
           int red2 = red%16;
           if (red1 >= 10) { //3
               switch (red1) {
                   case 10:
                       redHex1 = "A";
                       break;
                    case 11:
                        redHex1 = "B";
                        break;
                    case 12:
                        redHex1 = "C";
                        break;
                    case 13: 
                        redHex1 = "D";
                        break;
                    case 14:     
                        redHex1 = "E";
                        break;
                    case 15:
                        redHex1 = "F";
                        break;       }
           } //end 3           
            else if (red1 < 10) {redHex1 = String.valueOf(red1); } 
            hexCode = redHex1;
           
            if (red2 >= 10) { //4
               switch (red2) {
                   case 10:
                       redHex2 = "A";
                       break;
                    case 11:
                        redHex2 = "B";
                        break;
                    case 12:
                        redHex2 = "C";
                        break;
                    case 13: 
                        redHex2 = "D";
                        break;
                    case 14:     
                        redHex2 = "E";
                        break;
                    case 15:
                        redHex2 = "F";
                        break;       }
            } //end 4     
            else if (red2 < 10) {redHex2 = String.valueOf(red2); } 
            hexCode += redHex2;
            
            //convert green integer from decimal to hex
            int green1 = green/16;
            int green2 = green%16;
           if (green1 >= 10) { //5
               switch (green1) {
                   case 10:
                       greenHex1 = "A";
                       break;
                    case 11:
                        greenHex1 = "B";
                        break;
                    case 12:
                        greenHex1 = "C";
                        break;
                    case 13: 
                        greenHex1 = "D";
                        break;
                    case 14:     
                        greenHex1 = "E";
                        break;
                    case 15:
                        greenHex1 = "F";
                        break;       }
           } //end 5           
            else if (green1 < 10) {greenHex1 = String.valueOf(green1); } 
            hexCode += greenHex1;
           
            if (green2 >= 10) { //6
               switch (green2) {
                   case 10:
                       greenHex2 = "A";
                       break;
                    case 11:
                        greenHex2 = "B";
                        break;
                    case 12:
                        greenHex2 = "C";
                        break;
                    case 13: 
                        greenHex2 = "D";
                        break;
                    case 14:     
                        greenHex2 = "E";
                        break;
                    case 15:
                        greenHex2 = "F";
                        break;       }
            } //end 6     
            else if (green2 < 10) {greenHex2 = String.valueOf(green2); } 
            hexCode += greenHex2;
            
            //convert blue integer from decimal to hex
            int blue1 = blue/16;
           int blue2 = blue%16;
           if (blue1 >= 10) { //7
               switch (blue1) {
                   case 10:
                       blueHex1 = "A";
                       break;
                    case 11:
                        blueHex1 = "B";
                        break;
                    case 12:
                        blueHex1 = "C";
                        break;
                    case 13: 
                        blueHex1 = "D";
                        break;
                    case 14:     
                        blueHex1 = "E";
                        break;
                    case 15:
                        blueHex1 = "F";
                        break;       }
           } //end 7           
            else if (blue1 < 10) {blueHex1 = String.valueOf(blue1); } 
            hexCode += blueHex1;
           
            if (blue2 >= 10) { //8
               switch (blue2) {
                   case 10:
                       blueHex2 = "A";
                       break;
                    case 11:
                        blueHex2 = "B";
                        break;
                    case 12:
                        blueHex2 = "C";
                        break;
                    case 13: 
                        blueHex2 = "D";
                        break;
                    case 14:     
                        blueHex2 = "E";
                        break;
                    case 15:
                        blueHex2 = "F";
                        break;       }
            } //end 8    
            else if (blue2 < 10) {blueHex2 = String.valueOf(blue2); }
            hexCode += blueHex2;
            
            //print the hexidecimal output
            System.out.println("The decimal numbers R: " + red + " G: " + green + " B: " + blue
                + " are represented hexidecimally as: #" + hexCode);
            
        } //end 2
        //range error
        else {System.out.println("Sorry, RBG values must be between 0 and 255.");  }
    } //end 1
    //non-integer error
    else {System.out.println("Integers, please.");  } 
    
    }  //end method
}  //end class