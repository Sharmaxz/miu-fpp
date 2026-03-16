package lesson3;

// Overloading called as Static binding / Early Binding/ Compile time polymorphism
// Method of Constructor overloading
public class OverloadDemo {
    //Overloaded methods
    public void add(String s1, String s2) {
        System.out.println(s1 + " " + s2);
    }

//    public String add(String a1, String a2) { // Same signature
//        return a1 + " " + a2;
//    }

    public String add(String a1, String a2, String s3) {
        return a1 + " " + a2;
    }

//    public void add(String a1, String a2, String s3) { // Same signature, Return type not verified at compile
//        String res =  a1 + " " + a2 + s3;
//    }

    public String add(String a1, String a2, int s3) { // Same signature
        return a1 + " " + a2 + s3;
    }

    public void main(String[] args) {

    }
}
