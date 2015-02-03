//Emma Newkirk  CSE2  30 Jan 2015
//Arithmetic.java calculates cost of items + 6% PA sales tax

//class
public class Arithmetic {
    
    //method
    public static void main (String[] args) {
        
        //declare and assign given variables
        int nSocks = 3; //pairs of socks
        double sockCost$ = 2.58; //cost per pair
        int nGlasses = 6; //number of drinking glasses
        double glassCost$ = 2.29; //cost per glass
        int nEnvelopes = 1; //boxes of envelopes
        double envelopeCost$ = 3.25; //cost per box
        double taxPercent = 0.06; //sales tax percentage in the state of Pennsylvania
        
        //calculate costs based on given variables
        double totalSockCost$ = nSocks * sockCost$; //socks times cost per sock
        double sockTax$ = (int) ((totalSockCost$ * taxPercent) * 100) / 100.0; //formatted 6% of sock cost
        double totalGlassCost$ = nGlasses * glassCost$; //glasses times cost per glass
        double glassTax$ = (int) ((totalGlassCost$ * taxPercent) * 100) / 100.0; //formatted 6% of glasses cost
        double totalEnvelopeCost$ = nEnvelopes * envelopeCost$; //envelopes times cost per envelope
        double envelopeTax$ = (int) ((totalEnvelopeCost$ * taxPercent) * 100) / 100.0; //formatted 6% of envelope cost
        double subtotal$ = totalEnvelopeCost$ + totalGlassCost$ + totalSockCost$; //unformatted subtotal
        double formattedSubtotal$ = (int) (subtotal$ * 100) / 100.0; //formatted subtotal
        double totalTax$ = (int) ((subtotal$ * taxPercent) * 100) / 100.0; //formatted 6% tax of all items
        double total$ = (int) ((totalTax$ + subtotal$) * 100) / 100.0; //formatted total cost
        
        //print bill
        System.out.println("BILL:");
        System.out.println(nSocks + " sock(s) @ $" + sockCost$ + " ea: $" + totalSockCost$);
        System.out.println("+ $" + sockTax$ + " sales tax");
        System.out.println(nGlasses + " glass(es) @ $" + glassCost$ + " ea: $" + totalGlassCost$);
        System.out.println("+ $" + glassTax$ + " sales tax");
        System.out.println(nEnvelopes + " envelope box(es) @ $" + envelopeCost$ + " ea: $" + totalEnvelopeCost$);
        System.out.println("+ $" + envelopeTax$ + " sales tax");
        System.out.println("Item Subtotal: $" + formattedSubtotal$);
        System.out.println("PA sales tax: $" + totalTax$);
        System.out.println("TOTAL DUE: $" + total$);
        
    }
    
    
}