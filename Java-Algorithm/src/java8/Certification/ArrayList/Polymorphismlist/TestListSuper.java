package java8.Certification.ArrayList.Polymorphismlist;



import java.util.ArrayList;
        import java.util.List;

abstract class Animal {}
class Dog extends Animal{}

public class TestListSuper {
    public static void main(String [] args) {
        List<Animal> list = new ArrayList<Animal>();
        list.add(0, new Dog());
        System.out.println(list.size() > 0);
    }
}