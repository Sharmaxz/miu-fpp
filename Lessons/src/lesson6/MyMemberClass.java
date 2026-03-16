package lesson6;


// Outer class - public or default
public class MyMemberClass {
    private String s = "Outer"; // Outer class member variable
    private int x = 20;
    private MyMemberInner ob;

    // Constructor of outer class
    public MyMemberClass() {
        // To access inner class from the outer class, we need to create an instance of inner class
        ob = new MyMemberInner(); // Create instance of member inner class
        ob.display();
    }

    //Member Inner Class - private, public, default, protected
    public class MyMemberInner {
        private String s = "Inner"; // Inner class member variable
        private int num = 100; //Member Inner class member variable

        public void display() {
            System.out.println(this.s); // Even private field of outer class can access
            System.out.println(MyMemberClass.this.s); // If same field exists
            System.out.println(num);
        }
    }

}
