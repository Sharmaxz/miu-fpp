package lesson4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyClassTest {
    MyClass mc = new MyClass();

    @Test
    void sum() {
        int res = mc.sum(5);
        System.out.println(res);
        assertEquals(15, res);
    }
}