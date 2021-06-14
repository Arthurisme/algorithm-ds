package udemy.javacertification.testsample;


class X {
    void A() {
        System.out.print("A");
    }
}

class Y extends X {
    void A() {
        System.out.print("A-");
    }

    void B() {
        System.out.print("B-");
    }

    void C() {
        System.out.print("C-");
    }
}

public class Test {
    public static void main(String[] args) {
        Y obj = new Y(); //Line n1
//        X obj = new Y(); //Line n1
        obj.A(); //Line n2
        obj.B(); //Line n3
        obj.C(); //Line n4
    }
}
