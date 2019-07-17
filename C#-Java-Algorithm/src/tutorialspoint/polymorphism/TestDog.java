package tutorialspoint.polymorphism;

interface Animal {
        public  void move() ;
}

class Dog implements Animal {
    public void move() {

        System.out.println("Dogs can walk and run");
    }
}

public class TestDog {

    public static void main(String args[]) {
        Animal b = new Dog();   // Animal reference but Dog object
        b.move();   // runs the method in Dog class


//        Animal a = new Animal();
//        a.move();

        Dog d = new Dog();
        d.move();

//
//        Dog d2 = new Animal();
//        d2.move();

    }
}