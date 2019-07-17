package java8.Certification;



        import java.util.ArrayList;
        import java.util.List;

interface Sellable {}
abstract class Animal {}
class Mammal extends Animal{}
class Rabbit extends Mammal implements Sellable{}

public class ListPolymorphism {
    {
        List<Animal> list = new ArrayList<>();
        list.add(new Rabbit());
    }
    {
        List<Animal> list = new ArrayList<>();
        list.add(new Mammal());
    }
    {
        List<Mammal> list = new ArrayList<>();
        list.add(new Rabbit());
    }
    {
        List<Sellable> list = new ArrayList<>();
        //list.add(new Mammal());
    }
    {
        List<Sellable> list = new ArrayList<>();
        list.add(new Rabbit());
    }
}
