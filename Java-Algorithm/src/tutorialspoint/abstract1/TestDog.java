package tutorialspoint.abstract1;

class Animal {
    public void move() {
        System.out.println("Animals can move");
    }
}

class Dog extends Animal {
    public void move() {
        super.move();   // invokes the super class method
        System.out.println("Dogs can walk and run");
    }
}

public class TestDog {

    public static void main(String args[]) {
        Animal b = new Dog();   // Animal reference but Dog object
        b.move();   // runs the method in Dog class


        Animal a = new Animal();
        a.move();

        Dog d = new Dog();
        d.move();

//
//        Dog d2 = new Animal();
//        d2.move();

//        Dog d3 = (Dog)a;
        Animal a4 = (Animal) d;

    }
}
