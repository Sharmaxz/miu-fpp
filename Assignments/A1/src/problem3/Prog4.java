package problem3;

public class Prog4 {
    public static void main(String[] args) {
        //here is example input
        String[] input = new String[]{"horse", "dog", "cat", "horse", "dog"};

        String[] result = removeDuplicates(input);

        // System.out.println(Arrays.toString(result));
        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            // Use the backslash escape character \" to include a literal double quote
            System.out.print("\"" + result[i] + "\"");
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }

    public static String[] removeDuplicates(String[] array) {
        String[] removedDuplicates = new String[array.length];
        int length = 0;

        for (String current : array) {
            boolean contains = false;
            for (String s : removedDuplicates) {
                //no need to add if it's inside already
                if (current.equals(s)) {
                    contains = true;
                    break;
                }
            }

            //if our new array contains it, we can add this current string bc it is unique.. 
            if (!contains) {
                removedDuplicates[length] = current;

                //increase length so we know the length of our new array. 
                length++;
            }
        }//for

        //make the new values
        String[] result = new String[length];

        //manual copy of array. 
        for (int i = 0; i < length; i++) {
            result[i] = removedDuplicates[i];
        }

        //our return result
        return result;
    }
}
