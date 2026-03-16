package lesson3;

public class Recursion {

    static void main() {
//        IO.println(reverseString("Hello World!"));
        reverseString("Hello World!");
        IO.println("fact");
        IO.println(fact(5));
        IO.println("sum of odd");
        IO.println(sumOfOdd(3));
        IO.println("xMethod");
        xMethod(1234567);
        IO.println("Fibonacci");
        IO.println(fib(5));

    }

    public static void reverseString(String text) {
        if (text == null || text.isEmpty()) {
            return;
        } else {
            System.out.println(text.charAt(text.length() - 1));
            reverseString(text.substring(0, text.length() - 1));
        }
    }

//    public static String reverseString(String text) {
//        if(text == null || text.isEmpty()) {
//            return "";
//        }
//        else {
//            return text.substring(text.length() - 1) + reverseString(text.substring(0, text.length() - 1));
//        }
//    }

    public static int fact(int num) {
        if(num == 0 || num == 1) {
            return 1;
        }

        return num * fact(num - 1);
    }

    public static int sumOfOdd(int num) {
        if(num == 0) {
            return 0;
        }

        if(num == 1) {
            return 1;
        }

        return (2 * num - 1) + sumOfOdd(num - 1);
    }

    public static void xMethod(int n) {
        if (n > 0) {
            System.out.println(n % 10);
            xMethod(n / 10);
        }
    }

    public static int fib(int n) {
        if(n == 0 || n == 1) {
            return n;
        }
        return fib(n-1) + fib(n-2);
    }


}
