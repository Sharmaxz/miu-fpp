package lesson6;


// Outer class - public or default
public class TestMyMemberClass {
    static void main() {
        MyMemberClass obj = new MyMemberClass();
        MyMemberClass.MyMemberInner innerObj = obj.new MyMemberInner(); // Create instance of member inner class
        MyMemberClass.MyMemberInner innerObj2 = new MyMemberClass().new MyMemberInner(); // Create instance of member inner class
        innerObj2.display();
    }
}
