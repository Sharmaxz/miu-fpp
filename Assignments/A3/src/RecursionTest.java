package com.homework3;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * USING Junit 4.11
 * Homework 3: Recursion
 * Authors: Budhil Thijm & Joao Silva
 */
public class RecursionTest 
{
    //Minimum Character string should return the smallest character in a string. 
    @Test
    public void isMinimumCharString(){
        //edge case where there is no character
        assertEquals('\0', Recursion.minimumCharacterString(""));
        //edge case where there is many characters
        assertEquals('a', Recursion.minimumCharacterString("bcdsdfefpaoshdifpoashdfpouh"));
    }

    //validateIntegerPalindrome tests isIntegerPalindrome, making sure it returns as expected
    @Test 
    public void validateIntegerPalindrome(){
        //normal case, where an integer is a palindrome
        assertEquals(true, Recursion.isIntegerPalindrome(1234321));

        //invalid palindrome
        assertEquals(false, Recursion.isIntegerPalindrome(1223810505));

        //edge case with one value
        assertEquals(true, Recursion.isIntegerPalindrome(1));
        assertEquals(true, Recursion.isIntegerPalindrome(0));
    }

    //validates the function maxInArr which finds the largest integer in an integer array
    @Test
    public void validateMaxInArr(){
        //two practice arrays
        int[] arr1 = new int[] { 5, -3, 6, 1, 9, 4 };
        int[] arr2 = new int[] { 5, -3, 6, 1, 15, 4};

        //checking if the values are equal to expected value.
        assertEquals(9, Recursion.maxInArr(arr1));
        assertEquals(15, Recursion.maxInArr(arr2));

    }
    
}