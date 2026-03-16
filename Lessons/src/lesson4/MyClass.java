package lesson4;

public class MyClass {

    static void main() {
        MyClass mc = new MyClass();
        System.out.println("Sum = " + mc.sum(5));
    }

    int sum(int num) {
        if(num == 1) {
            return 1;
        }

        return sum(num - 1) + num;
    }
}
