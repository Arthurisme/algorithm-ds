package java8.Lambda.lambdabasic2;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getSalary() {
        return salary;
    }

    public String toString() {
        return name;
    }
}

public class Lambdat1b {
    public static void main(String [] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("James", 25, 15000));
        list.add(new Employee("Lucy", 23, 12000));
        list.add(new Employee("Bill", 27, 10000));
        list.add(new Employee("Jack", 19, 5000));
        list.add(new Employee("Liya", 20, 8000));


        PredicateFomula<Employee> btf = new PredicateFomula<>();

        // type 1:
//        process(list, e -> e.getSalary() >= 10000 );

        // type 2:
        process(list, btf );


        System.out.println(list);
    }




    private static void process(List<Employee> list, Predicate<Employee> predicate) {
        Iterator<Employee> iterator = list.iterator();
        while(iterator.hasNext()) {
            if(predicate.test(iterator.next()))
                iterator.remove();
        }
    }
}


class PredicateFomula<E> implements Predicate<Employee> {

    @Override
    public boolean test(Employee e) {

        Integer five = 5;

        return e.getSalary() >= 10000;
    }
}


