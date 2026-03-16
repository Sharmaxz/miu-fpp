package lesson6;


public class OuterClass {
    private int num = 50;
    static String s = "Inner Class";



    // Inner Static Class
    static class StClass {
        // Inside static class, you can include
        // Static fields/methods, instance fields/methods
        // Static method can access only static references

        private int k = 50;
        static long l = 60l;

        public void m1() {
            System.out.println(k);
            System.out.println(l);
            // System.out.println(num); // Non static outer not allowed inside static class
            System.out.println(s);
        }

        public static void smethod() {
            // System.out.println(num); // Non static outer not allowed inside static class
            System.out.println(s);
            // System.out.println(k); // Non static not allowed inside static method
            System.out.println(l);
        }
    }
}
