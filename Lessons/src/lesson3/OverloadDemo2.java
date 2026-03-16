package lesson3;

public class OverloadDemo2 {
    static int x = 0; // Instance variable

    public OverloadDemo2() {
        x++;
    }

    public static int getX() {
        int y = 50; // Local Variable
        return x;
    }

    public static void main(String[] args) {
        int k = 100;  // Local Variable
        OverloadDemo2 ob = null;

        for (int i = 0; i < 10; i++) {
            ob = new OverloadDemo2();
        }

        System.out.println("Count = " + ob.getX());
        // The method of the field is static call Classname.field or Classname.method()
        System.out.println("Count = " + OverloadDemo2.getX());
        display(); // Invoking
        String s = "Hello"; // String Literal
        String b = new String("123");
    }

    public static void display() {

    }
}
