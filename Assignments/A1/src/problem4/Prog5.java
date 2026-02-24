class Prog5 {
    public static void main(String[] args) {

        double resultA = sequenceA(5);
        System.out.printf("%.3f\n", resultA);

        double resultB = sequenceB(5);
        System.out.printf("%.3f\n", resultB);
        
    }

    //returns first N of the sequence:
    //1 – 1/3 + 1/5 – 1/7 + 1/9 - …..
    public static double sequenceA(int n){

        //summed value
        double sum = 0;

        //this will increase by 2 every step
        double divisor = 1;
        boolean subtract = true;

        //the second value.
        for(int i = 0; i < n; i++){
            //divide by the divisor, and keep subtracting from the total sum. 
            sum = (i % 2 != 0) ? sum - (1 / divisor) : sum + (1 / divisor);
            divisor += 2;
        }
        
        //eventually we will get our sum
        return sum;
    }


    public static double sequenceB(int n){

        //summed value
        double sum = 0;

        //this will increase by 2 every step
        double divisor = 2;
        boolean subtract = true;

        //the second value.
        for(int i = 0; i < n; i++){
            //divide by the divisor, and keep subtracting from the total sum. 
            sum = (i % 2 != 0) ? sum - (1 / divisor) : sum + (1 / divisor);
            divisor += 2;
        }
        
        //eventually we will get our sum
        return sum;
    }
}
