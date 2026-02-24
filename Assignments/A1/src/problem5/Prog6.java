public class Prog6 {
    public static void main(String[] args) {
        int[] arrayOfInts = new int[]{2, 21, 3, 45, 0, 12, 18, 6, 3, 1, 0, 0, 0, 22};

        //call the method to find the second smallest value in the array. 
        secondMin(arrayOfInts);
    }


    public static void secondMin(int[] arrayOfInts){
        int currMinIndex = 0;
        int currMin = Integer.MAX_VALUE;

        //will store index of the LOWEST value, and its index..
        int i = 0;
        for(; i < arrayOfInts.length; i++){
            int n = arrayOfInts[i];

            if(n < arrayOfInts[currMinIndex]){
                currMinIndex = i;
                currMin = arrayOfInts[currMinIndex];
            }
        }

        //remove all those elements that are the MINIMUM
        for(i = 0; i < arrayOfInts.length; i++){
            if(arrayOfInts[i] == currMin){
                arrayOfInts[i] = Integer.MAX_VALUE;
            }
        }
        
        //now we run the "find minimum algorithm" again, and it will find the second minimum (even if there are duplicate minimums).
        for(i = 0; i < arrayOfInts.length; i++){
            int n = arrayOfInts[i];

            if(n < arrayOfInts[currMinIndex]){
                currMinIndex = i;
            }
        }

        System.out.println(arrayOfInts[currMinIndex]);

    }
}
