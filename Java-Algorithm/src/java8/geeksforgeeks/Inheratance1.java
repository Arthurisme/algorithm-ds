package java8.geeksforgeeks;



class Base {
    public void show() {
        System.out.println("Base::show() called");
    }
}

class Derived extends Base {
    public void show() {
        System.out.println("Derived::show() called");
    }
}

public class Inheratance1 {
    public static void main(String[] args) {
        Base b = new Derived();
        Base b2 = new Base();
        b2.show();
    }
}
