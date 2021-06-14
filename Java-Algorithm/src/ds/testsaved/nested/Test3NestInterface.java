package ds.testsaved.nested;


interface X1 {
    default void print() {
        System.out.println("X1");
    }
}

interface X2 extends X1 {
    void print();
}

interface X3 extends X2 {
    default void print() {
        System.out.println("X3");
    }
}

class X implements X3 {}

public class Test3NestInterface {
    public static void main(String[] args) {
        X1 obj = new X();
        obj.print();
    }
}
