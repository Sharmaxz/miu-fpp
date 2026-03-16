package com.homework3;

/*

USING Junit 4.11
Homework 3: Recursion
1. Using recursion to find the minimum character in the given string input.
If your input is “akel” in return ‘a’

Authors: Budhil Thijm & Joao Silva

Problems are listed under their titles.
Many helper functions exist, but only the "public" functions are for the homework

 */
public class Recursion {

    public static void main(String[] args) {
        String str = "spdhfpduqwpfsudfgbgpg";
        System.out.println(minimumCharacterString(str));

        int[] arr = reverseInt(new int[]{0, 1, 2, 5, 4, 6, 7, 8});
        for (int n : arr) {
            System.out.println(n);
        }

        System.out.println(reverseN(1235));
        System.out.println(isIntegerPalindrome(1234321));

        int[] arr1 = new int[]{5, -3, 6, 1, 9, 4};
        int n = maxInArr(arr1);
        System.out.println(n);
    }

    /* PROBLEM 1 */
//region problem 1 
    /**
     * PROBLEM 1 SOLUTION
     * We use a helper function minimumCharacterStringKernel, which converts to character array, 
     * and begins at the first vlaue of the string. We could also just use charAt.
    */
    public static char minimumCharacterString(String str) {
        //if it's empty, we return empty character
        if (str == null || str.isEmpty()) {
            return '\0';
        }

        //otherwise, return this helper function which is recursive
        return minimumCharacterStringKernel(str.toCharArray(), str.charAt(0), 0);
    }

    /**
     * Kernel functino that has two recursive cases depending if the current character is the smallest or not
     * @param str 
     * @param currmin
     * @param index
     * @return 
     */
    private static char minimumCharacterStringKernel(char[] str, char currmin, int index) {
        // base case, is if the index is greater or equal to the lenght - 1 (the last value of list)
        if (index >= str.length - 1) {
            //then we return the current minumum
            return currmin;
        }

        //then we check if the current minimum is less or greater than the current character
        if (str[index] < currmin) {
            //set a new minumum, and recursively iterate to the next index
            return minimumCharacterStringKernel(str, str[index], index + 1);
        } else {
            //set old minimum, and recursively iterate to the next index
            return minimumCharacterStringKernel(str, currmin, index + 1);
        }
    }

//endregion problem 1
/* PROBLEM 2 */
    //region problem 2
    /**
     * ReverseInt Porblem 2: reverses an integer array with no secondary array being made
     * Uses private helper function by overloading!
     * @param arr
     * @return
     */
    public static int[] reverseInt(int[] arr) {
        return reverseInt(arr, 0, arr.length - 1);
    }

    /** 
     * reverseInt(int[], int, int)
     * switches indexes until the first index is greater than or equal to the last index,
     * thus reverseing the array
    */
    private static int[] reverseInt(int[] arr, int firstIndex, int lastIndex) {
        if (firstIndex >= lastIndex) {
            return arr;
        }

        int temp = arr[firstIndex];
        arr[firstIndex] = arr[lastIndex];
        arr[lastIndex] = temp;

        return reverseInt(arr, firstIndex + 1, lastIndex - 1);
    }

    //endregion problem 2

    /* PROBLEM 3 */
    //region problem 3
    public static boolean isIntegerPalindrome(int n) {
        if (n < 0) {
            return false;
        }

        int reversedN = reverseN(n);
        return isIntegerPalindromeKernel(n, reversedN);
    }

    private static boolean isIntegerPalindromeKernel(int n, int reversen) {
        if (n <= 0) {
            return true;
        }
        return ((n % 10) == (reversen % 10)) && isIntegerPalindromeKernel(n / 10, reversen / 10);
    }

    private static int reverseN(int n) {
        if (n <= 0) {
            return 0;
        }
        int length = lengthN(n);
        //12345
        // 5 *10000
        return myPow(10, length - 1) * (n % 10) + reverseN(n / 10);
    }

    private static int myPow(int base, int power) {
        if (power <= 0) {
            return 1;
        }

        return base * myPow(base, power - 1);
    }

    private static int lengthN(int n) {
        if (n <= 0) {
            return 0;
        }
        int num = n / 10;
        return 1 + lengthN(num);
    }

    //endregion problem 3
    /* Problem 4 */
    //region problem 4

    public static int maxInArr(int[] arr) {

        return maxInArr(arr, 0, arr[0]);
    }

    private static int maxInArr(int[] arr, int index, int greater) {
        if (index >= arr.length - 1) {
            return greater;
        }

        return arr[index] < greater ? maxInArr(arr, index + 1, greater) : maxInArr(arr, index + 1, arr[index]);
    }

    //endregion problem 4
}
