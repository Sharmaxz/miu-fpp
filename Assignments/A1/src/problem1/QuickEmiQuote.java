package problem1;

import java.util.Random;

class QuickEmiQuote {
    public static void main(String[] args) {
        /*Randomize inputs */
        Random random = new Random();

        //within range.
        int P = random.nextInt(5000, 25000); //principal
        // System.out.println("P: " + P);

        int n = random.nextInt(6, 36); //tenure
        // System.out.println("n: " + n);

        double APR = random.nextDouble(3.5, 11.5); //apr %
        // System.out.println("APR: " + APR);

        //compute the EMI using
        double r = APR / 12 / 100; //monthly rate
        // System.out.println("Monthly Interest Rate (r): " + r);

        //emi formula
        double EMI = ((double) P * r * Math.pow((1 + r), n)) /
                (Math.pow((1 + r), n) - 1);

        // System.out.println("EMI: " + EMI);

        double totalPayment = EMI * n;
        // System.out.println("Total Payment: " + totalPayment);

        double totalInterest = totalPayment - P;
        // System.out.println("Total Interest Paid: " + totalInterest);

        // 3 show multiple integer views of EMI
        int EMIasInt = (int) EMI;
        System.out.printf("\nCast to Int: %d \n", EMIasInt);
        int EMIrounded = (int) Math.round(EMI);
        System.out.printf("Rounded EMI to the nearest int: %d \n", EMIrounded);

        //print formatted summary block for questions 1-3.
        System.out.printf("\nSummary of values: \n\tPrincipal (P): $%d \n\tTenure (n): %d months \n\tAPR: %.2f%% \n\tEMI: $%.2f \n\tTotal Payment: $%.2f \n\tTotal Interest Paid: $%.2f \n\n", P, n, APR, EMI, totalPayment, totalInterest);

        //print everything..
    }
}
