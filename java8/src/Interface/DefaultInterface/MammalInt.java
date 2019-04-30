package Interface.DefaultInterface;


/* File name : Animal.java */
interface Animal {
    default void print(){
        System.out.println("I am an animal!");
    }
    public void eat();
    public void travel();
}

interface MovedSystem {
    default void print(){
        System.out.println("I am an MovedSystem!");
    }

}


/* File name : MammalInt.java */
public class MammalInt implements Animal, MovedSystem {

    public void print(){
        System.out.println("I am an Mammal!");
    }

    public void eat() {
        System.out.println("Mammal eats");
    }

    public void travel() {
        System.out.println("Mammal travels");
    }

    public int noOfLegs() {
        return 0;
    }

    public static void main(String args[]) {
//        MammalInt m = new MammalInt();
//        m.print();
//        m.eat();
//        m.travel();

        Animal a = new MammalInt();
        Animal a2 = new Animal() {
            @Override
            public void eat() {

            }

            @Override
            public void travel() {

            }
        };
        a.print();
        a.eat();
        a.travel();

    }
}
